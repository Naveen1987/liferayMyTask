/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.employee.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.employee.exception.NoSuchEmployeeeException;

import com.employee.model.Employeee;
import com.employee.model.impl.EmployeeeImpl;
import com.employee.model.impl.EmployeeeModelImpl;

import com.employee.service.persistence.EmployeeePersistence;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the employeee service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeePersistence
 * @see com.employee.service.persistence.EmployeeeUtil
 * @generated
 */
@ProviderType
public class EmployeeePersistenceImpl extends BasePersistenceImpl<Employeee>
	implements EmployeeePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EmployeeeUtil} to access the employeee persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EmployeeeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EmployeeeModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeeModelImpl.FINDER_CACHE_ENABLED, EmployeeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EmployeeeModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeeModelImpl.FINDER_CACHE_ENABLED, EmployeeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EmployeeeModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public EmployeeePersistenceImpl() {
		setModelClass(Employeee.class);
	}

	/**
	 * Caches the employeee in the entity cache if it is enabled.
	 *
	 * @param employeee the employeee
	 */
	@Override
	public void cacheResult(Employeee employeee) {
		entityCache.putResult(EmployeeeModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeeImpl.class, employeee.getPrimaryKey(), employeee);

		employeee.resetOriginalValues();
	}

	/**
	 * Caches the employeees in the entity cache if it is enabled.
	 *
	 * @param employeees the employeees
	 */
	@Override
	public void cacheResult(List<Employeee> employeees) {
		for (Employeee employeee : employeees) {
			if (entityCache.getResult(EmployeeeModelImpl.ENTITY_CACHE_ENABLED,
						EmployeeeImpl.class, employeee.getPrimaryKey()) == null) {
				cacheResult(employeee);
			}
			else {
				employeee.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all employeees.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(EmployeeeImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the employeee.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Employeee employeee) {
		entityCache.removeResult(EmployeeeModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeeImpl.class, employeee.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Employeee> employeees) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Employeee employeee : employeees) {
			entityCache.removeResult(EmployeeeModelImpl.ENTITY_CACHE_ENABLED,
				EmployeeeImpl.class, employeee.getPrimaryKey());
		}
	}

	/**
	 * Creates a new employeee with the primary key. Does not add the employeee to the database.
	 *
	 * @param eid the primary key for the new employeee
	 * @return the new employeee
	 */
	@Override
	public Employeee create(long eid) {
		Employeee employeee = new EmployeeeImpl();

		employeee.setNew(true);
		employeee.setPrimaryKey(eid);

		return employeee;
	}

	/**
	 * Removes the employeee with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param eid the primary key of the employeee
	 * @return the employeee that was removed
	 * @throws NoSuchEmployeeeException if a employeee with the primary key could not be found
	 */
	@Override
	public Employeee remove(long eid) throws NoSuchEmployeeeException {
		return remove((Serializable)eid);
	}

	/**
	 * Removes the employeee with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the employeee
	 * @return the employeee that was removed
	 * @throws NoSuchEmployeeeException if a employeee with the primary key could not be found
	 */
	@Override
	public Employeee remove(Serializable primaryKey)
		throws NoSuchEmployeeeException {
		Session session = null;

		try {
			session = openSession();

			Employeee employeee = (Employeee)session.get(EmployeeeImpl.class,
					primaryKey);

			if (employeee == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEmployeeeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(employeee);
		}
		catch (NoSuchEmployeeeException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Employeee removeImpl(Employeee employeee) {
		employeee = toUnwrappedModel(employeee);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(employeee)) {
				employeee = (Employeee)session.get(EmployeeeImpl.class,
						employeee.getPrimaryKeyObj());
			}

			if (employeee != null) {
				session.delete(employeee);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (employeee != null) {
			clearCache(employeee);
		}

		return employeee;
	}

	@Override
	public Employeee updateImpl(Employeee employeee) {
		employeee = toUnwrappedModel(employeee);

		boolean isNew = employeee.isNew();

		Session session = null;

		try {
			session = openSession();

			if (employeee.isNew()) {
				session.save(employeee);

				employeee.setNew(false);
			}
			else {
				employeee = (Employeee)session.merge(employeee);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		entityCache.putResult(EmployeeeModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeeImpl.class, employeee.getPrimaryKey(), employeee, false);

		employeee.resetOriginalValues();

		return employeee;
	}

	protected Employeee toUnwrappedModel(Employeee employeee) {
		if (employeee instanceof EmployeeeImpl) {
			return employeee;
		}

		EmployeeeImpl employeeeImpl = new EmployeeeImpl();

		employeeeImpl.setNew(employeee.isNew());
		employeeeImpl.setPrimaryKey(employeee.getPrimaryKey());

		employeeeImpl.setEid(employeee.getEid());
		employeeeImpl.setEname(employeee.getEname());
		employeeeImpl.setEsal(employeee.getEsal());

		return employeeeImpl;
	}

	/**
	 * Returns the employeee with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the employeee
	 * @return the employeee
	 * @throws NoSuchEmployeeeException if a employeee with the primary key could not be found
	 */
	@Override
	public Employeee findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEmployeeeException {
		Employeee employeee = fetchByPrimaryKey(primaryKey);

		if (employeee == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEmployeeeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return employeee;
	}

	/**
	 * Returns the employeee with the primary key or throws a {@link NoSuchEmployeeeException} if it could not be found.
	 *
	 * @param eid the primary key of the employeee
	 * @return the employeee
	 * @throws NoSuchEmployeeeException if a employeee with the primary key could not be found
	 */
	@Override
	public Employeee findByPrimaryKey(long eid) throws NoSuchEmployeeeException {
		return findByPrimaryKey((Serializable)eid);
	}

	/**
	 * Returns the employeee with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the employeee
	 * @return the employeee, or <code>null</code> if a employeee with the primary key could not be found
	 */
	@Override
	public Employeee fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(EmployeeeModelImpl.ENTITY_CACHE_ENABLED,
				EmployeeeImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Employeee employeee = (Employeee)serializable;

		if (employeee == null) {
			Session session = null;

			try {
				session = openSession();

				employeee = (Employeee)session.get(EmployeeeImpl.class,
						primaryKey);

				if (employeee != null) {
					cacheResult(employeee);
				}
				else {
					entityCache.putResult(EmployeeeModelImpl.ENTITY_CACHE_ENABLED,
						EmployeeeImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(EmployeeeModelImpl.ENTITY_CACHE_ENABLED,
					EmployeeeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return employeee;
	}

	/**
	 * Returns the employeee with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param eid the primary key of the employeee
	 * @return the employeee, or <code>null</code> if a employeee with the primary key could not be found
	 */
	@Override
	public Employeee fetchByPrimaryKey(long eid) {
		return fetchByPrimaryKey((Serializable)eid);
	}

	@Override
	public Map<Serializable, Employeee> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Employeee> map = new HashMap<Serializable, Employeee>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Employeee employeee = fetchByPrimaryKey(primaryKey);

			if (employeee != null) {
				map.put(primaryKey, employeee);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(EmployeeeModelImpl.ENTITY_CACHE_ENABLED,
					EmployeeeImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Employeee)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_EMPLOYEEE_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append(String.valueOf(primaryKey));

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (Employeee employeee : (List<Employeee>)q.list()) {
				map.put(employeee.getPrimaryKeyObj(), employeee);

				cacheResult(employeee);

				uncachedPrimaryKeys.remove(employeee.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(EmployeeeModelImpl.ENTITY_CACHE_ENABLED,
					EmployeeeImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the employeees.
	 *
	 * @return the employeees
	 */
	@Override
	public List<Employeee> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the employeees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmployeeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employeees
	 * @param end the upper bound of the range of employeees (not inclusive)
	 * @return the range of employeees
	 */
	@Override
	public List<Employeee> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the employeees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmployeeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employeees
	 * @param end the upper bound of the range of employeees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of employeees
	 */
	@Override
	public List<Employeee> findAll(int start, int end,
		OrderByComparator<Employeee> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the employeees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmployeeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employeees
	 * @param end the upper bound of the range of employeees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of employeees
	 */
	@Override
	public List<Employeee> findAll(int start, int end,
		OrderByComparator<Employeee> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Employeee> list = null;

		if (retrieveFromCache) {
			list = (List<Employeee>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_EMPLOYEEE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EMPLOYEEE;

				if (pagination) {
					sql = sql.concat(EmployeeeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Employeee>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Employeee>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the employeees from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Employeee employeee : findAll()) {
			remove(employeee);
		}
	}

	/**
	 * Returns the number of employeees.
	 *
	 * @return the number of employeees
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_EMPLOYEEE);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return EmployeeeModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the employeee persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(EmployeeeImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_EMPLOYEEE = "SELECT employeee FROM Employeee employeee";
	private static final String _SQL_SELECT_EMPLOYEEE_WHERE_PKS_IN = "SELECT employeee FROM Employeee employeee WHERE eid IN (";
	private static final String _SQL_COUNT_EMPLOYEEE = "SELECT COUNT(employeee) FROM Employeee employeee";
	private static final String _ORDER_BY_ENTITY_ALIAS = "employeee.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Employeee exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(EmployeeePersistenceImpl.class);
}