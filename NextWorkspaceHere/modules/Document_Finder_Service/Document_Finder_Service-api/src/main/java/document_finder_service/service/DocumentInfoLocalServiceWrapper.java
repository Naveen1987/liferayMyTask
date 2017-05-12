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

package document_finder_service.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DocumentInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see DocumentInfoLocalService
 * @generated
 */
@ProviderType
public class DocumentInfoLocalServiceWrapper implements DocumentInfoLocalService,
	ServiceWrapper<DocumentInfoLocalService> {
	public DocumentInfoLocalServiceWrapper(
		DocumentInfoLocalService documentInfoLocalService) {
		_documentInfoLocalService = documentInfoLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _documentInfoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _documentInfoLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _documentInfoLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _documentInfoLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _documentInfoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the document info to the database. Also notifies the appropriate model listeners.
	*
	* @param documentInfo the document info
	* @return the document info that was added
	*/
	@Override
	public document_finder_service.model.DocumentInfo addDocumentInfo(
		document_finder_service.model.DocumentInfo documentInfo) {
		return _documentInfoLocalService.addDocumentInfo(documentInfo);
	}

	/**
	* Creates a new document info with the primary key. Does not add the document info to the database.
	*
	* @param DocID the primary key for the new document info
	* @return the new document info
	*/
	@Override
	public document_finder_service.model.DocumentInfo createDocumentInfo(
		long DocID) {
		return _documentInfoLocalService.createDocumentInfo(DocID);
	}

	/**
	* Deletes the document info from the database. Also notifies the appropriate model listeners.
	*
	* @param documentInfo the document info
	* @return the document info that was removed
	*/
	@Override
	public document_finder_service.model.DocumentInfo deleteDocumentInfo(
		document_finder_service.model.DocumentInfo documentInfo) {
		return _documentInfoLocalService.deleteDocumentInfo(documentInfo);
	}

	/**
	* Deletes the document info with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param DocID the primary key of the document info
	* @return the document info that was removed
	* @throws PortalException if a document info with the primary key could not be found
	*/
	@Override
	public document_finder_service.model.DocumentInfo deleteDocumentInfo(
		long DocID) throws com.liferay.portal.kernel.exception.PortalException {
		return _documentInfoLocalService.deleteDocumentInfo(DocID);
	}

	@Override
	public document_finder_service.model.DocumentInfo fetchDocumentInfo(
		long DocID) {
		return _documentInfoLocalService.fetchDocumentInfo(DocID);
	}

	/**
	* Returns the document info with the primary key.
	*
	* @param DocID the primary key of the document info
	* @return the document info
	* @throws PortalException if a document info with the primary key could not be found
	*/
	@Override
	public document_finder_service.model.DocumentInfo getDocumentInfo(
		long DocID) throws com.liferay.portal.kernel.exception.PortalException {
		return _documentInfoLocalService.getDocumentInfo(DocID);
	}

	/**
	* Updates the document info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param documentInfo the document info
	* @return the document info that was updated
	*/
	@Override
	public document_finder_service.model.DocumentInfo updateDocumentInfo(
		document_finder_service.model.DocumentInfo documentInfo) {
		return _documentInfoLocalService.updateDocumentInfo(documentInfo);
	}

	/**
	* Returns the number of document infos.
	*
	* @return the number of document infos
	*/
	@Override
	public int getDocumentInfosCount() {
		return _documentInfoLocalService.getDocumentInfosCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _documentInfoLocalService.getOSGiServiceIdentifier();
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
		return _documentInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link document_finder_service.model.impl.DocumentInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _documentInfoLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link document_finder_service.model.impl.DocumentInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _documentInfoLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the document infos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link document_finder_service.model.impl.DocumentInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of document infos
	* @param end the upper bound of the range of document infos (not inclusive)
	* @return the range of document infos
	*/
	@Override
	public java.util.List<document_finder_service.model.DocumentInfo> getDocumentInfos(
		int start, int end) {
		return _documentInfoLocalService.getDocumentInfos(start, end);
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
		return _documentInfoLocalService.dynamicQueryCount(dynamicQuery);
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
		return _documentInfoLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public DocumentInfoLocalService getWrappedService() {
		return _documentInfoLocalService;
	}

	@Override
	public void setWrappedService(
		DocumentInfoLocalService documentInfoLocalService) {
		_documentInfoLocalService = documentInfoLocalService;
	}

	private DocumentInfoLocalService _documentInfoLocalService;
}