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

package document_finder_service.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import document_finder_service.model.DocumentInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing DocumentInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see DocumentInfo
 * @generated
 */
@ProviderType
public class DocumentInfoCacheModel implements CacheModel<DocumentInfo>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DocumentInfoCacheModel)) {
			return false;
		}

		DocumentInfoCacheModel documentInfoCacheModel = (DocumentInfoCacheModel)obj;

		if (DocID == documentInfoCacheModel.DocID) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, DocID);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{DocID=");
		sb.append(DocID);
		sb.append(", DocName=");
		sb.append(DocName);
		sb.append(", DocGen=");
		sb.append(DocGen);
		sb.append(", DocFee=");
		sb.append(DocFee);
		sb.append(", DocSize=");
		sb.append(DocSize);
		sb.append(", DocPreUrl=");
		sb.append(DocPreUrl);
		sb.append(", DocDownUrl=");
		sb.append(DocDownUrl);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DocumentInfo toEntityModel() {
		DocumentInfoImpl documentInfoImpl = new DocumentInfoImpl();

		documentInfoImpl.setDocID(DocID);

		if (DocName == null) {
			documentInfoImpl.setDocName(StringPool.BLANK);
		}
		else {
			documentInfoImpl.setDocName(DocName);
		}

		if (DocGen == null) {
			documentInfoImpl.setDocGen(StringPool.BLANK);
		}
		else {
			documentInfoImpl.setDocGen(DocGen);
		}

		documentInfoImpl.setDocFee(DocFee);

		if (DocSize == null) {
			documentInfoImpl.setDocSize(StringPool.BLANK);
		}
		else {
			documentInfoImpl.setDocSize(DocSize);
		}

		if (DocPreUrl == null) {
			documentInfoImpl.setDocPreUrl(StringPool.BLANK);
		}
		else {
			documentInfoImpl.setDocPreUrl(DocPreUrl);
		}

		if (DocDownUrl == null) {
			documentInfoImpl.setDocDownUrl(StringPool.BLANK);
		}
		else {
			documentInfoImpl.setDocDownUrl(DocDownUrl);
		}

		documentInfoImpl.resetOriginalValues();

		return documentInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		DocID = objectInput.readLong();
		DocName = objectInput.readUTF();
		DocGen = objectInput.readUTF();

		DocFee = objectInput.readInt();
		DocSize = objectInput.readUTF();
		DocPreUrl = objectInput.readUTF();
		DocDownUrl = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(DocID);

		if (DocName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DocName);
		}

		if (DocGen == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DocGen);
		}

		objectOutput.writeInt(DocFee);

		if (DocSize == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DocSize);
		}

		if (DocPreUrl == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DocPreUrl);
		}

		if (DocDownUrl == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DocDownUrl);
		}
	}

	public long DocID;
	public String DocName;
	public String DocGen;
	public int DocFee;
	public String DocSize;
	public String DocPreUrl;
	public String DocDownUrl;
}