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

package document_finder_service.model;

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
 * This class is a wrapper for {@link DocumentInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DocumentInfo
 * @generated
 */
@ProviderType
public class DocumentInfoWrapper implements DocumentInfo,
	ModelWrapper<DocumentInfo> {
	public DocumentInfoWrapper(DocumentInfo documentInfo) {
		_documentInfo = documentInfo;
	}

	@Override
	public Class<?> getModelClass() {
		return DocumentInfo.class;
	}

	@Override
	public String getModelClassName() {
		return DocumentInfo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("DocID", getDocID());
		attributes.put("DocName", getDocName());
		attributes.put("DocGen", getDocGen());
		attributes.put("DocFee", getDocFee());
		attributes.put("DocSize", getDocSize());
		attributes.put("DocPreUrl", getDocPreUrl());
		attributes.put("DocDownUrl", getDocDownUrl());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long DocID = (Long)attributes.get("DocID");

		if (DocID != null) {
			setDocID(DocID);
		}

		String DocName = (String)attributes.get("DocName");

		if (DocName != null) {
			setDocName(DocName);
		}

		String DocGen = (String)attributes.get("DocGen");

		if (DocGen != null) {
			setDocGen(DocGen);
		}

		Integer DocFee = (Integer)attributes.get("DocFee");

		if (DocFee != null) {
			setDocFee(DocFee);
		}

		String DocSize = (String)attributes.get("DocSize");

		if (DocSize != null) {
			setDocSize(DocSize);
		}

		String DocPreUrl = (String)attributes.get("DocPreUrl");

		if (DocPreUrl != null) {
			setDocPreUrl(DocPreUrl);
		}

		String DocDownUrl = (String)attributes.get("DocDownUrl");

		if (DocDownUrl != null) {
			setDocDownUrl(DocDownUrl);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _documentInfo.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _documentInfo.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _documentInfo.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _documentInfo.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<document_finder_service.model.DocumentInfo> toCacheModel() {
		return _documentInfo.toCacheModel();
	}

	@Override
	public document_finder_service.model.DocumentInfo toEscapedModel() {
		return new DocumentInfoWrapper(_documentInfo.toEscapedModel());
	}

	@Override
	public document_finder_service.model.DocumentInfo toUnescapedModel() {
		return new DocumentInfoWrapper(_documentInfo.toUnescapedModel());
	}

	@Override
	public int compareTo(
		document_finder_service.model.DocumentInfo documentInfo) {
		return _documentInfo.compareTo(documentInfo);
	}

	/**
	* Returns the doc fee of this document info.
	*
	* @return the doc fee of this document info
	*/
	@Override
	public int getDocFee() {
		return _documentInfo.getDocFee();
	}

	@Override
	public int hashCode() {
		return _documentInfo.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _documentInfo.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new DocumentInfoWrapper((DocumentInfo)_documentInfo.clone());
	}

	/**
	* Returns the doc down url of this document info.
	*
	* @return the doc down url of this document info
	*/
	@Override
	public java.lang.String getDocDownUrl() {
		return _documentInfo.getDocDownUrl();
	}

	/**
	* Returns the doc gen of this document info.
	*
	* @return the doc gen of this document info
	*/
	@Override
	public java.lang.String getDocGen() {
		return _documentInfo.getDocGen();
	}

	/**
	* Returns the doc name of this document info.
	*
	* @return the doc name of this document info
	*/
	@Override
	public java.lang.String getDocName() {
		return _documentInfo.getDocName();
	}

	/**
	* Returns the doc pre url of this document info.
	*
	* @return the doc pre url of this document info
	*/
	@Override
	public java.lang.String getDocPreUrl() {
		return _documentInfo.getDocPreUrl();
	}

	/**
	* Returns the doc size of this document info.
	*
	* @return the doc size of this document info
	*/
	@Override
	public java.lang.String getDocSize() {
		return _documentInfo.getDocSize();
	}

	@Override
	public java.lang.String toString() {
		return _documentInfo.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _documentInfo.toXmlString();
	}

	/**
	* Returns the doc ID of this document info.
	*
	* @return the doc ID of this document info
	*/
	@Override
	public long getDocID() {
		return _documentInfo.getDocID();
	}

	/**
	* Returns the primary key of this document info.
	*
	* @return the primary key of this document info
	*/
	@Override
	public long getPrimaryKey() {
		return _documentInfo.getPrimaryKey();
	}

	@Override
	public void persist() {
		_documentInfo.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_documentInfo.setCachedModel(cachedModel);
	}

	/**
	* Sets the doc down url of this document info.
	*
	* @param DocDownUrl the doc down url of this document info
	*/
	@Override
	public void setDocDownUrl(java.lang.String DocDownUrl) {
		_documentInfo.setDocDownUrl(DocDownUrl);
	}

	/**
	* Sets the doc fee of this document info.
	*
	* @param DocFee the doc fee of this document info
	*/
	@Override
	public void setDocFee(int DocFee) {
		_documentInfo.setDocFee(DocFee);
	}

	/**
	* Sets the doc gen of this document info.
	*
	* @param DocGen the doc gen of this document info
	*/
	@Override
	public void setDocGen(java.lang.String DocGen) {
		_documentInfo.setDocGen(DocGen);
	}

	/**
	* Sets the doc ID of this document info.
	*
	* @param DocID the doc ID of this document info
	*/
	@Override
	public void setDocID(long DocID) {
		_documentInfo.setDocID(DocID);
	}

	/**
	* Sets the doc name of this document info.
	*
	* @param DocName the doc name of this document info
	*/
	@Override
	public void setDocName(java.lang.String DocName) {
		_documentInfo.setDocName(DocName);
	}

	/**
	* Sets the doc pre url of this document info.
	*
	* @param DocPreUrl the doc pre url of this document info
	*/
	@Override
	public void setDocPreUrl(java.lang.String DocPreUrl) {
		_documentInfo.setDocPreUrl(DocPreUrl);
	}

	/**
	* Sets the doc size of this document info.
	*
	* @param DocSize the doc size of this document info
	*/
	@Override
	public void setDocSize(java.lang.String DocSize) {
		_documentInfo.setDocSize(DocSize);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_documentInfo.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_documentInfo.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_documentInfo.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_documentInfo.setNew(n);
	}

	/**
	* Sets the primary key of this document info.
	*
	* @param primaryKey the primary key of this document info
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_documentInfo.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_documentInfo.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DocumentInfoWrapper)) {
			return false;
		}

		DocumentInfoWrapper documentInfoWrapper = (DocumentInfoWrapper)obj;

		if (Objects.equals(_documentInfo, documentInfoWrapper._documentInfo)) {
			return true;
		}

		return false;
	}

	@Override
	public DocumentInfo getWrappedModel() {
		return _documentInfo;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _documentInfo.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _documentInfo.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_documentInfo.resetOriginalValues();
	}

	private final DocumentInfo _documentInfo;
}