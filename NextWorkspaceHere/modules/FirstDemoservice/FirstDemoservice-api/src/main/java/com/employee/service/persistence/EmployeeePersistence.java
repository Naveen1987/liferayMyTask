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

import com.employee.exception.NoSuchEmployeeeException;

import com.employee.model.Employeee;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the employeee service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.employee.service.persistence.impl.EmployeeePersistenceImpl
 * @see EmployeeeUtil
 * @generated
 */
@ProviderType
public interface EmployeeePersistence extends BasePersistence<Employeee> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EmployeeeUtil} to access the employeee persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the employeee in the entity cache if it is enabled.
	*
	* @param employeee the employeee
	*/
	public void cacheResult(Employeee employeee);

	/**
	* Caches the employeees in the entity cache if it is enabled.
	*
	* @param employeees the employeees
	*/
	public void cacheResult(java.util.List<Employeee> employeees);

	/**
	* Creates a new employeee with the primary key. Does not add the employeee to the database.
	*
	* @param eid the primary key for the new employeee
	* @return the new employeee
	*/
	public Employeee create(long eid);

	/**
	* Removes the employeee with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param eid the primary key of the employeee
	* @return the employeee that was removed
	* @throws NoSuchEmployeeeException if a employeee with the primary key could not be found
	*/
	public Employeee remove(long eid) throws NoSuchEmployeeeException;

	public Employeee updateImpl(Employeee employeee);

	/**
	* Returns the employeee with the primary key or throws a {@link NoSuchEmployeeeException} if it could not be found.
	*
	* @param eid the primary key of the employeee
	* @return the employeee
	* @throws NoSuchEmployeeeException if a employeee with the primary key could not be found
	*/
	public Employeee findByPrimaryKey(long eid) throws NoSuchEmployeeeException;

	/**
	* Returns the employeee with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param eid the primary key of the employeee
	* @return the employeee, or <code>null</code> if a employeee with the primary key could not be found
	*/
	public Employeee fetchByPrimaryKey(long eid);

	@Override
	public java.util.Map<java.io.Serializable, Employeee> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the employeees.
	*
	* @return the employeees
	*/
	public java.util.List<Employeee> findAll();

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
	public java.util.List<Employeee> findAll(int start, int end);

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
	public java.util.List<Employeee> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Employeee> orderByComparator);

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
	public java.util.List<Employeee> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Employeee> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the employeees from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of employeees.
	*
	* @return the number of employeees
	*/
	public int countAll();
}