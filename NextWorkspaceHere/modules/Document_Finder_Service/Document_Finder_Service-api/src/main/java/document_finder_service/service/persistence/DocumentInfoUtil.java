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

package document_finder_service.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import document_finder_service.model.DocumentInfo;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the document info service. This utility wraps {@link document_finder_service.service.persistence.impl.DocumentInfoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DocumentInfoPersistence
 * @see document_finder_service.service.persistence.impl.DocumentInfoPersistenceImpl
 * @generated
 */
@ProviderType
public class DocumentInfoUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(DocumentInfo documentInfo) {
		getPersistence().clearCache(documentInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<DocumentInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DocumentInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DocumentInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<DocumentInfo> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static DocumentInfo update(DocumentInfo documentInfo) {
		return getPersistence().update(documentInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static DocumentInfo update(DocumentInfo documentInfo,
		ServiceContext serviceContext) {
		return getPersistence().update(documentInfo, serviceContext);
	}

	/**
	* Caches the document info in the entity cache if it is enabled.
	*
	* @param documentInfo the document info
	*/
	public static void cacheResult(DocumentInfo documentInfo) {
		getPersistence().cacheResult(documentInfo);
	}

	/**
	* Caches the document infos in the entity cache if it is enabled.
	*
	* @param documentInfos the document infos
	*/
	public static void cacheResult(List<DocumentInfo> documentInfos) {
		getPersistence().cacheResult(documentInfos);
	}

	/**
	* Creates a new document info with the primary key. Does not add the document info to the database.
	*
	* @param DocID the primary key for the new document info
	* @return the new document info
	*/
	public static DocumentInfo create(long DocID) {
		return getPersistence().create(DocID);
	}

	/**
	* Removes the document info with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param DocID the primary key of the document info
	* @return the document info that was removed
	* @throws NoSuchDocumentInfoException if a document info with the primary key could not be found
	*/
	public static DocumentInfo remove(long DocID)
		throws document_finder_service.exception.NoSuchDocumentInfoException {
		return getPersistence().remove(DocID);
	}

	public static DocumentInfo updateImpl(DocumentInfo documentInfo) {
		return getPersistence().updateImpl(documentInfo);
	}

	/**
	* Returns the document info with the primary key or throws a {@link NoSuchDocumentInfoException} if it could not be found.
	*
	* @param DocID the primary key of the document info
	* @return the document info
	* @throws NoSuchDocumentInfoException if a document info with the primary key could not be found
	*/
	public static DocumentInfo findByPrimaryKey(long DocID)
		throws document_finder_service.exception.NoSuchDocumentInfoException {
		return getPersistence().findByPrimaryKey(DocID);
	}

	/**
	* Returns the document info with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param DocID the primary key of the document info
	* @return the document info, or <code>null</code> if a document info with the primary key could not be found
	*/
	public static DocumentInfo fetchByPrimaryKey(long DocID) {
		return getPersistence().fetchByPrimaryKey(DocID);
	}

	public static java.util.Map<java.io.Serializable, DocumentInfo> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the document infos.
	*
	* @return the document infos
	*/
	public static List<DocumentInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the document infos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DocumentInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of document infos
	* @param end the upper bound of the range of document infos (not inclusive)
	* @return the range of document infos
	*/
	public static List<DocumentInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the document infos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DocumentInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of document infos
	* @param end the upper bound of the range of document infos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of document infos
	*/
	public static List<DocumentInfo> findAll(int start, int end,
		OrderByComparator<DocumentInfo> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the document infos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DocumentInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of document infos
	* @param end the upper bound of the range of document infos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of document infos
	*/
	public static List<DocumentInfo> findAll(int start, int end,
		OrderByComparator<DocumentInfo> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the document infos from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of document infos.
	*
	* @return the number of document infos
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static DocumentInfoPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<DocumentInfoPersistence, DocumentInfoPersistence> _serviceTracker =
		ServiceTrackerFactory.open(DocumentInfoPersistence.class);
}