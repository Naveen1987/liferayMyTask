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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the DocumentInfo service. Represents a row in the &quot;FOO_DocumentInfo&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see DocumentInfoModel
 * @see document_finder_service.model.impl.DocumentInfoImpl
 * @see document_finder_service.model.impl.DocumentInfoModelImpl
 * @generated
 */
@ImplementationClassName("document_finder_service.model.impl.DocumentInfoImpl")
@ProviderType
public interface DocumentInfo extends DocumentInfoModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link document_finder_service.model.impl.DocumentInfoImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<DocumentInfo, Long> DOC_ID_ACCESSOR = new Accessor<DocumentInfo, Long>() {
			@Override
			public Long get(DocumentInfo documentInfo) {
				return documentInfo.getDocID();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<DocumentInfo> getTypeClass() {
				return DocumentInfo.class;
			}
		};
}