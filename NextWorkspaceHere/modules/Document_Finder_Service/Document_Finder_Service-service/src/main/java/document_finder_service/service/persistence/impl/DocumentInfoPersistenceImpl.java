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

package document_finder_service.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

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

import document_finder_service.exception.NoSuchDocumentInfoException;

import document_finder_service.model.DocumentInfo;

import document_finder_service.model.impl.DocumentInfoImpl;
import document_finder_service.model.impl.DocumentInfoModelImpl;

import document_finder_service.service.persistence.DocumentInfoPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the document info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DocumentInfoPersistence
 * @see document_finder_service.service.persistence.DocumentInfoUtil
 * @generated
 */
@ProviderType
public class DocumentInfoPersistenceImpl extends BasePersistenceImpl<DocumentInfo>
	implements DocumentInfoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DocumentInfoUtil} to access the document info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DocumentInfoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DocumentInfoModelImpl.ENTITY_CACHE_ENABLED,
			DocumentInfoModelImpl.FINDER_CACHE_ENABLED, DocumentInfoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DocumentInfoModelImpl.ENTITY_CACHE_ENABLED,
			DocumentInfoModelImpl.FINDER_CACHE_ENABLED, DocumentInfoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DocumentInfoModelImpl.ENTITY_CACHE_ENABLED,
			DocumentInfoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public DocumentInfoPersistenceImpl() {
		setModelClass(DocumentInfo.class);
	}

	/**
	 * Caches the document info in the entity cache if it is enabled.
	 *
	 * @param documentInfo the document info
	 */
	@Override
	public void cacheResult(DocumentInfo documentInfo) {
		entityCache.putResult(DocumentInfoModelImpl.ENTITY_CACHE_ENABLED,
			DocumentInfoImpl.class, documentInfo.getPrimaryKey(), documentInfo);

		documentInfo.resetOriginalValues();
	}

	/**
	 * Caches the document infos in the entity cache if it is enabled.
	 *
	 * @param documentInfos the document infos
	 */
	@Override
	public void cacheResult(List<DocumentInfo> documentInfos) {
		for (DocumentInfo documentInfo : documentInfos) {
			if (entityCache.getResult(
						DocumentInfoModelImpl.ENTITY_CACHE_ENABLED,
						DocumentInfoImpl.class, documentInfo.getPrimaryKey()) == null) {
				cacheResult(documentInfo);
			}
			else {
				documentInfo.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all document infos.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(DocumentInfoImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the document info.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DocumentInfo documentInfo) {
		entityCache.removeResult(DocumentInfoModelImpl.ENTITY_CACHE_ENABLED,
			DocumentInfoImpl.class, documentInfo.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DocumentInfo> documentInfos) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DocumentInfo documentInfo : documentInfos) {
			entityCache.removeResult(DocumentInfoModelImpl.ENTITY_CACHE_ENABLED,
				DocumentInfoImpl.class, documentInfo.getPrimaryKey());
		}
	}

	/**
	 * Creates a new document info with the primary key. Does not add the document info to the database.
	 *
	 * @param DocID the primary key for the new document info
	 * @return the new document info
	 */
	@Override
	public DocumentInfo create(long DocID) {
		DocumentInfo documentInfo = new DocumentInfoImpl();

		documentInfo.setNew(true);
		documentInfo.setPrimaryKey(DocID);

		return documentInfo;
	}

	/**
	 * Removes the document info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param DocID the primary key of the document info
	 * @return the document info that was removed
	 * @throws NoSuchDocumentInfoException if a document info with the primary key could not be found
	 */
	@Override
	public DocumentInfo remove(long DocID) throws NoSuchDocumentInfoException {
		return remove((Serializable)DocID);
	}

	/**
	 * Removes the document info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the document info
	 * @return the document info that was removed
	 * @throws NoSuchDocumentInfoException if a document info with the primary key could not be found
	 */
	@Override
	public DocumentInfo remove(Serializable primaryKey)
		throws NoSuchDocumentInfoException {
		Session session = null;

		try {
			session = openSession();

			DocumentInfo documentInfo = (DocumentInfo)session.get(DocumentInfoImpl.class,
					primaryKey);

			if (documentInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDocumentInfoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(documentInfo);
		}
		catch (NoSuchDocumentInfoException nsee) {
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
	protected DocumentInfo removeImpl(DocumentInfo documentInfo) {
		documentInfo = toUnwrappedModel(documentInfo);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(documentInfo)) {
				documentInfo = (DocumentInfo)session.get(DocumentInfoImpl.class,
						documentInfo.getPrimaryKeyObj());
			}

			if (documentInfo != null) {
				session.delete(documentInfo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (documentInfo != null) {
			clearCache(documentInfo);
		}

		return documentInfo;
	}

	@Override
	public DocumentInfo updateImpl(DocumentInfo documentInfo) {
		documentInfo = toUnwrappedModel(documentInfo);

		boolean isNew = documentInfo.isNew();

		Session session = null;

		try {
			session = openSession();

			if (documentInfo.isNew()) {
				session.save(documentInfo);

				documentInfo.setNew(false);
			}
			else {
				documentInfo = (DocumentInfo)session.merge(documentInfo);
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

		entityCache.putResult(DocumentInfoModelImpl.ENTITY_CACHE_ENABLED,
			DocumentInfoImpl.class, documentInfo.getPrimaryKey(), documentInfo,
			false);

		documentInfo.resetOriginalValues();

		return documentInfo;
	}

	protected DocumentInfo toUnwrappedModel(DocumentInfo documentInfo) {
		if (documentInfo instanceof DocumentInfoImpl) {
			return documentInfo;
		}

		DocumentInfoImpl documentInfoImpl = new DocumentInfoImpl();

		documentInfoImpl.setNew(documentInfo.isNew());
		documentInfoImpl.setPrimaryKey(documentInfo.getPrimaryKey());

		documentInfoImpl.setDocID(documentInfo.getDocID());
		documentInfoImpl.setDocName(documentInfo.getDocName());
		documentInfoImpl.setDocGen(documentInfo.getDocGen());
		documentInfoImpl.setDocFee(documentInfo.getDocFee());
		documentInfoImpl.setDocSize(documentInfo.getDocSize());
		documentInfoImpl.setDocPreUrl(documentInfo.getDocPreUrl());
		documentInfoImpl.setDocDownUrl(documentInfo.getDocDownUrl());

		return documentInfoImpl;
	}

	/**
	 * Returns the document info with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the document info
	 * @return the document info
	 * @throws NoSuchDocumentInfoException if a document info with the primary key could not be found
	 */
	@Override
	public DocumentInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDocumentInfoException {
		DocumentInfo documentInfo = fetchByPrimaryKey(primaryKey);

		if (documentInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDocumentInfoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return documentInfo;
	}

	/**
	 * Returns the document info with the primary key or throws a {@link NoSuchDocumentInfoException} if it could not be found.
	 *
	 * @param DocID the primary key of the document info
	 * @return the document info
	 * @throws NoSuchDocumentInfoException if a document info with the primary key could not be found
	 */
	@Override
	public DocumentInfo findByPrimaryKey(long DocID)
		throws NoSuchDocumentInfoException {
		return findByPrimaryKey((Serializable)DocID);
	}

	/**
	 * Returns the document info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the document info
	 * @return the document info, or <code>null</code> if a document info with the primary key could not be found
	 */
	@Override
	public DocumentInfo fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(DocumentInfoModelImpl.ENTITY_CACHE_ENABLED,
				DocumentInfoImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		DocumentInfo documentInfo = (DocumentInfo)serializable;

		if (documentInfo == null) {
			Session session = null;

			try {
				session = openSession();

				documentInfo = (DocumentInfo)session.get(DocumentInfoImpl.class,
						primaryKey);

				if (documentInfo != null) {
					cacheResult(documentInfo);
				}
				else {
					entityCache.putResult(DocumentInfoModelImpl.ENTITY_CACHE_ENABLED,
						DocumentInfoImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(DocumentInfoModelImpl.ENTITY_CACHE_ENABLED,
					DocumentInfoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return documentInfo;
	}

	/**
	 * Returns the document info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param DocID the primary key of the document info
	 * @return the document info, or <code>null</code> if a document info with the primary key could not be found
	 */
	@Override
	public DocumentInfo fetchByPrimaryKey(long DocID) {
		return fetchByPrimaryKey((Serializable)DocID);
	}

	@Override
	public Map<Serializable, DocumentInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, DocumentInfo> map = new HashMap<Serializable, DocumentInfo>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			DocumentInfo documentInfo = fetchByPrimaryKey(primaryKey);

			if (documentInfo != null) {
				map.put(primaryKey, documentInfo);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(DocumentInfoModelImpl.ENTITY_CACHE_ENABLED,
					DocumentInfoImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (DocumentInfo)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_DOCUMENTINFO_WHERE_PKS_IN);

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

			for (DocumentInfo documentInfo : (List<DocumentInfo>)q.list()) {
				map.put(documentInfo.getPrimaryKeyObj(), documentInfo);

				cacheResult(documentInfo);

				uncachedPrimaryKeys.remove(documentInfo.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(DocumentInfoModelImpl.ENTITY_CACHE_ENABLED,
					DocumentInfoImpl.class, primaryKey, nullModel);
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
	 * Returns all the document infos.
	 *
	 * @return the document infos
	 */
	@Override
	public List<DocumentInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the document infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DocumentInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of document infos
	 * @param end the upper bound of the range of document infos (not inclusive)
	 * @return the range of document infos
	 */
	@Override
	public List<DocumentInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the document infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DocumentInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of document infos
	 * @param end the upper bound of the range of document infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of document infos
	 */
	@Override
	public List<DocumentInfo> findAll(int start, int end,
		OrderByComparator<DocumentInfo> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the document infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DocumentInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of document infos
	 * @param end the upper bound of the range of document infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of document infos
	 */
	@Override
	public List<DocumentInfo> findAll(int start, int end,
		OrderByComparator<DocumentInfo> orderByComparator,
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

		List<DocumentInfo> list = null;

		if (retrieveFromCache) {
			list = (List<DocumentInfo>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_DOCUMENTINFO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOCUMENTINFO;

				if (pagination) {
					sql = sql.concat(DocumentInfoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DocumentInfo>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<DocumentInfo>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the document infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (DocumentInfo documentInfo : findAll()) {
			remove(documentInfo);
		}
	}

	/**
	 * Returns the number of document infos.
	 *
	 * @return the number of document infos
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DOCUMENTINFO);

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
		return DocumentInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	
	
	/**
	 * Initializes the document info persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(DocumentInfoImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_DOCUMENTINFO = "SELECT documentInfo FROM DocumentInfo documentInfo";
	private static final String _SQL_SELECT_DOCUMENTINFO_WHERE_PKS_IN = "SELECT documentInfo FROM DocumentInfo documentInfo WHERE DocID IN (";
	private static final String _SQL_COUNT_DOCUMENTINFO = "SELECT COUNT(documentInfo) FROM DocumentInfo documentInfo";
	private static final String _ORDER_BY_ENTITY_ALIAS = "documentInfo.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DocumentInfo exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(DocumentInfoPersistenceImpl.class);
}