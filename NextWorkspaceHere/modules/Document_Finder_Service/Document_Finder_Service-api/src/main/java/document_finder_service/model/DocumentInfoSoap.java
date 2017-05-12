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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class DocumentInfoSoap implements Serializable {
	public static DocumentInfoSoap toSoapModel(DocumentInfo model) {
		DocumentInfoSoap soapModel = new DocumentInfoSoap();

		soapModel.setDocID(model.getDocID());
		soapModel.setDocName(model.getDocName());
		soapModel.setDocGen(model.getDocGen());
		soapModel.setDocFee(model.getDocFee());
		soapModel.setDocSize(model.getDocSize());
		soapModel.setDocPreUrl(model.getDocPreUrl());
		soapModel.setDocDownUrl(model.getDocDownUrl());

		return soapModel;
	}

	public static DocumentInfoSoap[] toSoapModels(DocumentInfo[] models) {
		DocumentInfoSoap[] soapModels = new DocumentInfoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DocumentInfoSoap[][] toSoapModels(DocumentInfo[][] models) {
		DocumentInfoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DocumentInfoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DocumentInfoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DocumentInfoSoap[] toSoapModels(List<DocumentInfo> models) {
		List<DocumentInfoSoap> soapModels = new ArrayList<DocumentInfoSoap>(models.size());

		for (DocumentInfo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DocumentInfoSoap[soapModels.size()]);
	}

	public DocumentInfoSoap() {
	}

	public long getPrimaryKey() {
		return _DocID;
	}

	public void setPrimaryKey(long pk) {
		setDocID(pk);
	}

	public long getDocID() {
		return _DocID;
	}

	public void setDocID(long DocID) {
		_DocID = DocID;
	}

	public String getDocName() {
		return _DocName;
	}

	public void setDocName(String DocName) {
		_DocName = DocName;
	}

	public String getDocGen() {
		return _DocGen;
	}

	public void setDocGen(String DocGen) {
		_DocGen = DocGen;
	}

	public int getDocFee() {
		return _DocFee;
	}

	public void setDocFee(int DocFee) {
		_DocFee = DocFee;
	}

	public String getDocSize() {
		return _DocSize;
	}

	public void setDocSize(String DocSize) {
		_DocSize = DocSize;
	}

	public String getDocPreUrl() {
		return _DocPreUrl;
	}

	public void setDocPreUrl(String DocPreUrl) {
		_DocPreUrl = DocPreUrl;
	}

	public String getDocDownUrl() {
		return _DocDownUrl;
	}

	public void setDocDownUrl(String DocDownUrl) {
		_DocDownUrl = DocDownUrl;
	}

	private long _DocID;
	private String _DocName;
	private String _DocGen;
	private int _DocFee;
	private String _DocSize;
	private String _DocPreUrl;
	private String _DocDownUrl;
}