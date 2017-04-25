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

package com.employee.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EmployeeeLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeeLocalService
 * @generated
 */
@ProviderType
public class EmployeeeLocalServiceWrapper implements EmployeeeLocalService,
	ServiceWrapper<EmployeeeLocalService> {
	public EmployeeeLocalServiceWrapper(
		EmployeeeLocalService employeeeLocalService) {
		_employeeeLocalService = employeeeLocalService;
	}

	/**
	* Adds the employeee to the database. Also notifies the appropriate model listeners.
	*
	* @param employeee the employeee
	* @return the employeee that was added
	*/
	@Override
	public com.employee.model.Employeee addEmployeee(
		com.employee.model.Employeee employeee) {
		return _employeeeLocalService.addEmployeee(employeee);
	}

	/**
	* Creates a new employeee with the primary key. Does not add the employeee to the database.
	*
	* @param eid the primary key for the new employeee
	* @return the new employeee
	*/
	@Override
	public com.employee.model.Employeee createEmployeee(long eid) {
		return _employeeeLocalService.createEmployeee(eid);
	}

	/**
	* Deletes the employeee from the database. Also notifies the appropriate model listeners.
	*
	* @param employeee the employeee
	* @return the employeee that was removed
	*/
	@Override
	public com.employee.model.Employeee deleteEmployeee(
		com.employee.model.Employeee employeee) {
		return _employeeeLocalService.deleteEmployeee(employeee);
	}

	/**
	* Deletes the employeee with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param eid the primary key of the employeee
	* @return the employeee that was removed
	* @throws PortalException if a employeee with the primary key could not be found
	*/
	@Override
	public com.employee.model.Employeee deleteEmployeee(long eid)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _employeeeLocalService.deleteEmployeee(eid);
	}

	@Override
	public com.employee.model.Employeee fetchEmployeee(long eid) {
		return _employeeeLocalService.fetchEmployeee(eid);
	}

	/**
	* Returns the employeee with the primary key.
	*
	* @param eid the primary key of the employeee
	* @return the employeee
	* @throws PortalException if a employeee with the primary key could not be found
	*/
	@Override
	public com.employee.model.Employeee getEmployeee(long eid)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _employeeeLocalService.getEmployeee(eid);
	}

	/**
	* Updates the employeee in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param employeee the employeee
	* @return the employeee that was updated
	*/
	@Override
	public com.employee.model.Employeee updateEmployeee(
		com.employee.model.Employeee employeee) {
		return _employeeeLocalService.updateEmployeee(employeee);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _employeeeLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _employeeeLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _employeeeLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _employeeeLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _employeeeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of employeees.
	*
	* @return the number of employeees
	*/
	@Override
	public int getEmployeeesCount() {
		return _employeeeLocalService.getEmployeeesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _employeeeLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _employeeeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.employee.model.impl.EmployeeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _employeeeLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.employee.model.impl.EmployeeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _employeeeLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the employeees.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.employee.model.impl.EmployeeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employeees
	* @param end the upper bound of the range of employeees (not inclusive)
	* @return the range of employeees
	*/
	@Override
	public java.util.List<com.employee.model.Employeee> getEmployeees(
		int start, int end) {
		return _employeeeLocalService.getEmployeees(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _employeeeLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _employeeeLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public EmployeeeLocalService getWrappedService() {
		return _employeeeLocalService;
	}

	@Override
	public void setWrappedService(EmployeeeLocalService employeeeLocalService) {
		_employeeeLocalService = employeeeLocalService;
	}

	private EmployeeeLocalService _employeeeLocalService;
}