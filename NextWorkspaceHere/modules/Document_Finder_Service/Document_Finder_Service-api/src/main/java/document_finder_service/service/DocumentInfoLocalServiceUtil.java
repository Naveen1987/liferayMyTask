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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for DocumentInfo. This utility wraps
 * {@link document_finder_service.service.impl.DocumentInfoLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see DocumentInfoLocalService
 * @see document_finder_service.service.base.DocumentInfoLocalServiceBaseImpl
 * @see document_finder_service.service.impl.DocumentInfoLocalServiceImpl
 * @generated
 */
@ProviderType
public class DocumentInfoLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link document_finder_service.service.impl.DocumentInfoLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the document info to the database. Also notifies the appropriate model listeners.
	*
	* @param documentInfo the document info
	* @return the document info that was added
	*/
	public static document_finder_service.model.DocumentInfo addDocumentInfo(
		document_finder_service.model.DocumentInfo documentInfo) {
		return getService().addDocumentInfo(documentInfo);
	}

	/**
	* Creates a new document info with the primary key. Does not add the document info to the database.
	*
	* @param DocID the primary key for the new document info
	* @return the new document info
	*/
	public static document_finder_service.model.DocumentInfo createDocumentInfo(
		long DocID) {
		return getService().createDocumentInfo(DocID);
	}

	/**
	* Deletes the document info from the database. Also notifies the appropriate model listeners.
	*
	* @param documentInfo the document info
	* @return the document info that was removed
	*/
	public static document_finder_service.model.DocumentInfo deleteDocumentInfo(
		document_finder_service.model.DocumentInfo documentInfo) {
		return getService().deleteDocumentInfo(documentInfo);
	}

	/**
	* Deletes the document info with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param DocID the primary key of the document info
	* @return the document info that was removed
	* @throws PortalException if a document info with the primary key could not be found
	*/
	public static document_finder_service.model.DocumentInfo deleteDocumentInfo(
		long DocID) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteDocumentInfo(DocID);
	}

	public static document_finder_service.model.DocumentInfo fetchDocumentInfo(
		long DocID) {
		return getService().fetchDocumentInfo(DocID);
	}

	/**
	* Returns the document info with the primary key.
	*
	* @param DocID the primary key of the document info
	* @return the document info
	* @throws PortalException if a document info with the primary key could not be found
	*/
	public static document_finder_service.model.DocumentInfo getDocumentInfo(
		long DocID) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getDocumentInfo(DocID);
	}

	/**
	* Updates the document info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param documentInfo the document info
	* @return the document info that was updated
	*/
	public static document_finder_service.model.DocumentInfo updateDocumentInfo(
		document_finder_service.model.DocumentInfo documentInfo) {
		return getService().updateDocumentInfo(documentInfo);
	}

	/**
	* Returns the number of document infos.
	*
	* @return the number of document infos
	*/
	public static int getDocumentInfosCount() {
		return getService().getDocumentInfosCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
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
	public static java.util.List<document_finder_service.model.DocumentInfo> getDocumentInfos(
		int start, int end) {
		return getService().getDocumentInfos(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static DocumentInfoLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<DocumentInfoLocalService, DocumentInfoLocalService> _serviceTracker =
		ServiceTrackerFactory.open(DocumentInfoLocalService.class);
}