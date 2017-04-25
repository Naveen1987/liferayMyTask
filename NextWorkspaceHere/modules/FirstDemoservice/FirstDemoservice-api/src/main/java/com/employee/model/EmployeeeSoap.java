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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.employee.service.http.EmployeeeServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.employee.service.http.EmployeeeServiceSoap
 * @generated
 */
@ProviderType
public class EmployeeeSoap implements Serializable {
	public static EmployeeeSoap toSoapModel(Employeee model) {
		EmployeeeSoap soapModel = new EmployeeeSoap();

		soapModel.setEid(model.getEid());
		soapModel.setEname(model.getEname());
		soapModel.setEsal(model.getEsal());

		return soapModel;
	}

	public static EmployeeeSoap[] toSoapModels(Employeee[] models) {
		EmployeeeSoap[] soapModels = new EmployeeeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EmployeeeSoap[][] toSoapModels(Employeee[][] models) {
		EmployeeeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EmployeeeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EmployeeeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EmployeeeSoap[] toSoapModels(List<Employeee> models) {
		List<EmployeeeSoap> soapModels = new ArrayList<EmployeeeSoap>(models.size());

		for (Employeee model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EmployeeeSoap[soapModels.size()]);
	}

	public EmployeeeSoap() {
	}

	public long getPrimaryKey() {
		return _eid;
	}

	public void setPrimaryKey(long pk) {
		setEid(pk);
	}

	public long getEid() {
		return _eid;
	}

	public void setEid(long eid) {
		_eid = eid;
	}

	public String getEname() {
		return _ename;
	}

	public void setEname(String ename) {
		_ename = ename;
	}

	public long getEsal() {
		return _esal;
	}

	public void setEsal(long esal) {
		_esal = esal;
	}

	private long _eid;
	private String _ename;
	private long _esal;
}