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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import document_finder_service.exception.NoSuchDocumentInfoException;

import document_finder_service.model.DocumentInfo;

/**
 * The persistence interface for the document info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see document_finder_service.service.persistence.impl.DocumentInfoPersistenceImpl
 * @see DocumentInfoUtil
 * @generated
 */
@ProviderType
public interface DocumentInfoPersistence extends BasePersistence<DocumentInfo> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DocumentInfoUtil} to access the document info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the document info in the entity cache if it is enabled.
	*
	* @param documentInfo the document info
	*/
	public void cacheResult(DocumentInfo documentInfo);

	/**
	* Caches the document infos in the entity cache if it is enabled.
	*
	* @param documentInfos the document infos
	*/
	public void cacheResult(java.util.List<DocumentInfo> documentInfos);

	/**
	* Creates a new document info with the primary key. Does not add the document info to the database.
	*
	* @param DocID the primary key for the new document info
	* @return the new document info
	*/
	public DocumentInfo create(long DocID);

	/**
	* Removes the document info with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param DocID the primary key of the document info
	* @return the document info that was removed
	* @throws NoSuchDocumentInfoException if a document info with the primary key could not be found
	*/
	public DocumentInfo remove(long DocID) throws NoSuchDocumentInfoException;

	public DocumentInfo updateImpl(DocumentInfo documentInfo);

	/**
	* Returns the document info with the primary key or throws a {@link NoSuchDocumentInfoException} if it could not be found.
	*
	* @param DocID the primary key of the document info
	* @return the document info
	* @throws NoSuchDocumentInfoException if a document info with the primary key could not be found
	*/
	public DocumentInfo findByPrimaryKey(long DocID)
		throws NoSuchDocumentInfoException;

	/**
	* Returns the document info with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param DocID the primary key of the document info
	* @return the document info, or <code>null</code> if a document info with the primary key could not be found
	*/
	public DocumentInfo fetchByPrimaryKey(long DocID);

	@Override
	public java.util.Map<java.io.Serializable, DocumentInfo> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the document infos.
	*
	* @return the document infos
	*/
	public java.util.List<DocumentInfo> findAll();

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
	public java.util.List<DocumentInfo> findAll(int start, int end);

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
	public java.util.List<DocumentInfo> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DocumentInfo> orderByComparator);

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
	public java.util.List<DocumentInfo> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DocumentInfo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the document infos from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of document infos.
	*
	* @return the number of document infos
	*/
	public int countAll();
}