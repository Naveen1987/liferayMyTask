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

package com.employee.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.employee.model.Employeee;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Employeee in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Employeee
 * @generated
 */
@ProviderType
public class EmployeeeCacheModel implements CacheModel<Employeee>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EmployeeeCacheModel)) {
			return false;
		}

		EmployeeeCacheModel employeeeCacheModel = (EmployeeeCacheModel)obj;

		if (eid == employeeeCacheModel.eid) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, eid);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{eid=");
		sb.append(eid);
		sb.append(", ename=");
		sb.append(ename);
		sb.append(", esal=");
		sb.append(esal);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Employeee toEntityModel() {
		EmployeeeImpl employeeeImpl = new EmployeeeImpl();

		employeeeImpl.setEid(eid);

		if (ename == null) {
			employeeeImpl.setEname(StringPool.BLANK);
		}
		else {
			employeeeImpl.setEname(ename);
		}

		employeeeImpl.setEsal(esal);

		employeeeImpl.resetOriginalValues();

		return employeeeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		eid = objectInput.readLong();
		ename = objectInput.readUTF();

		esal = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(eid);

		if (ename == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ename);
		}

		objectOutput.writeLong(esal);
	}

	public long eid;
	public String ename;
	public long esal;
}