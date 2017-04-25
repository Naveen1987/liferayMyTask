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

package com.employee.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.employee.model.Employeee;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the employeee service. This utility wraps {@link com.employee.service.persistence.impl.EmployeeePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeePersistence
 * @see com.employee.service.persistence.impl.EmployeeePersistenceImpl
 * @generated
 */
@ProviderType
public class EmployeeeUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Employeee employeee) {
		getPersistence().clearCache(employeee);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Employeee> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Employeee> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Employeee> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Employeee> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Employeee update(Employeee employeee) {
		return getPersistence().update(employeee);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Employeee update(Employeee employeee,
		ServiceContext serviceContext) {
		return getPersistence().update(employeee, serviceContext);
	}

	/**
	* Caches the employeee in the entity cache if it is enabled.
	*
	* @param employeee the employeee
	*/
	public static void cacheResult(Employeee employeee) {
		getPersistence().cacheResult(employeee);
	}

	/**
	* Caches the employeees in the entity cache if it is enabled.
	*
	* @param employeees the employeees
	*/
	public static void cacheResult(List<Employeee> employeees) {
		getPersistence().cacheResult(employeees);
	}

	/**
	* Creates a new employeee with the primary key. Does not add the employeee to the database.
	*
	* @param eid the primary key for the new employeee
	* @return the new employeee
	*/
	public static Employeee create(long eid) {
		return getPersistence().create(eid);
	}

	/**
	* Removes the employeee with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param eid the primary key of the employeee
	* @return the employeee that was removed
	* @throws NoSuchEmployeeeException if a employeee with the primary key could not be found
	*/
	public static Employeee remove(long eid)
		throws com.employee.exception.NoSuchEmployeeeException {
		return getPersistence().remove(eid);
	}

	public static Employeee updateImpl(Employeee employeee) {
		return getPersistence().updateImpl(employeee);
	}

	/**
	* Returns the employeee with the primary key or throws a {@link NoSuchEmployeeeException} if it could not be found.
	*
	* @param eid the primary key of the employeee
	* @return the employeee
	* @throws NoSuchEmployeeeException if a employeee with the primary key could not be found
	*/
	public static Employeee findByPrimaryKey(long eid)
		throws com.employee.exception.NoSuchEmployeeeException {
		return getPersistence().findByPrimaryKey(eid);
	}

	/**
	* Returns the employeee with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param eid the primary key of the employeee
	* @return the employeee, or <code>null</code> if a employeee with the primary key could not be found
	*/
	public static Employeee fetchByPrimaryKey(long eid) {
		return getPersistence().fetchByPrimaryKey(eid);
	}

	public static java.util.Map<java.io.Serializable, Employeee> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the employeees.
	*
	* @return the employeees
	*/
	public static List<Employeee> findAll() {
		return getPersistence().findAll();
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
	public static List<Employeee> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<Employeee> findAll(int start, int end,
		OrderByComparator<Employeee> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<Employeee> findAll(int start, int end,
		OrderByComparator<Employeee> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the employeees from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of employeees.
	*
	* @return the number of employeees
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static EmployeeePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<EmployeeePersistence, EmployeeePersistence> _serviceTracker =
		ServiceTrackerFactory.open(EmployeeePersistence.class);
}