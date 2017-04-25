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

package com.employee.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Employeee}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Employeee
 * @generated
 */
@ProviderType
public class EmployeeeWrapper implements Employeee, ModelWrapper<Employeee> {
	public EmployeeeWrapper(Employeee employeee) {
		_employeee = employeee;
	}

	@Override
	public Class<?> getModelClass() {
		return Employeee.class;
	}

	@Override
	public String getModelClassName() {
		return Employeee.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("eid", getEid());
		attributes.put("ename", getEname());
		attributes.put("esal", getEsal());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long eid = (Long)attributes.get("eid");

		if (eid != null) {
			setEid(eid);
		}

		String ename = (String)attributes.get("ename");

		if (ename != null) {
			setEname(ename);
		}

		Long esal = (Long)attributes.get("esal");

		if (esal != null) {
			setEsal(esal);
		}
	}

	@Override
	public Employeee toEscapedModel() {
		return new EmployeeeWrapper(_employeee.toEscapedModel());
	}

	@Override
	public Employeee toUnescapedModel() {
		return new EmployeeeWrapper(_employeee.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _employeee.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _employeee.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _employeee.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _employeee.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Employeee> toCacheModel() {
		return _employeee.toCacheModel();
	}

	@Override
	public int compareTo(Employeee employeee) {
		return _employeee.compareTo(employeee);
	}

	@Override
	public int hashCode() {
		return _employeee.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _employeee.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new EmployeeeWrapper((Employeee)_employeee.clone());
	}

	/**
	* Returns the ename of this employeee.
	*
	* @return the ename of this employeee
	*/
	@Override
	public java.lang.String getEname() {
		return _employeee.getEname();
	}

	@Override
	public java.lang.String toString() {
		return _employeee.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _employeee.toXmlString();
	}

	/**
	* Returns the eid of this employeee.
	*
	* @return the eid of this employeee
	*/
	@Override
	public long getEid() {
		return _employeee.getEid();
	}

	/**
	* Returns the esal of this employeee.
	*
	* @return the esal of this employeee
	*/
	@Override
	public long getEsal() {
		return _employeee.getEsal();
	}

	/**
	* Returns the primary key of this employeee.
	*
	* @return the primary key of this employeee
	*/
	@Override
	public long getPrimaryKey() {
		return _employeee.getPrimaryKey();
	}

	@Override
	public void persist() {
		_employeee.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_employeee.setCachedModel(cachedModel);
	}

	/**
	* Sets the eid of this employeee.
	*
	* @param eid the eid of this employeee
	*/
	@Override
	public void setEid(long eid) {
		_employeee.setEid(eid);
	}

	/**
	* Sets the ename of this employeee.
	*
	* @param ename the ename of this employeee
	*/
	@Override
	public void setEname(java.lang.String ename) {
		_employeee.setEname(ename);
	}

	/**
	* Sets the esal of this employeee.
	*
	* @param esal the esal of this employeee
	*/
	@Override
	public void setEsal(long esal) {
		_employeee.setEsal(esal);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_employeee.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_employeee.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_employeee.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_employeee.setNew(n);
	}

	/**
	* Sets the primary key of this employeee.
	*
	* @param primaryKey the primary key of this employeee
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_employeee.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_employeee.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EmployeeeWrapper)) {
			return false;
		}

		EmployeeeWrapper employeeeWrapper = (EmployeeeWrapper)obj;

		if (Objects.equals(_employeee, employeeeWrapper._employeee)) {
			return true;
		}

		return false;
	}

	@Override
	public Employeee getWrappedModel() {
		return _employeee;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _employeee.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _employeee.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_employeee.resetOriginalValues();
	}

	private final Employeee _employeee;
}