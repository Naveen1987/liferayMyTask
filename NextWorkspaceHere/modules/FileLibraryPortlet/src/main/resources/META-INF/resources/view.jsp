<%@page import="com.liferay.portal.kernel.lock.DuplicateLockException"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.io.File"%>
<%@page import="com.liferay.portal.kernel.util.FileUtil"%>
<%@page import="com.liferay.portal.kernel.service.ImageLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileVersion"%>
<%@page import="com.liferay.dynamic.data.mapping.kernel.DDMFormFieldValue"%>
<%@page import="com.liferay.dynamic.data.mapping.kernel.DDMFormField"%>
<%@page import="com.liferay.document.library.kernel.store.DLStoreUtil"%>
<%@page import="com.liferay.dynamic.data.mapping.kernel.StorageEngineManagerUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntryMetadata"%>
<%@page import="com.liferay.document.library.kernel.util.DLUtil"%>
<%@page import="com.liferay.dynamic.data.mapping.kernel.DDMFormValues"%>
<%@page import="java.util.Map"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryMetadataLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileVersion"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileVersionServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalService"%>
<%@page import="com.liferay.dynamic.data.mapping.kernel.DDMStructureManagerUtil"%>
<%@page import="com.liferay.dynamic.data.mapping.kernel.DDMStructure"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryTypeLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntryType"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.repository.model.Folder"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolderConstants"%>

<%@page import="com.demo.filelib.model.*"%>
<%@ include file="/init.jsp" %>
<table width="100%" style="color:#1500DC;border-collapse: separate; border-spacing: 5px ;border-color:whilte">

<%
long FOLDER_ID = 0;
long repositoryId = themeDisplay.getScopeGroupId();
long parentFolderId = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
List<Folder> lFolder = DLAppServiceUtil.getFolders(repositoryId, parentFolderId);
for (Folder folder : lFolder)
{
	if(folder.getName().equals("Student Documents")){
		List<FileEntry> fl=DLAppServiceUtil.getFileEntries(repositoryId, folder.getFolderId());
		for(FileEntry fn:fl){
			
			%>
			<tr>
			<%
			//out.println(DLAppLocalServiceUtil.getFileEntry(fn.getFileEntryId()).getTitle());
			//if(fn.getFileName().equals("codefinder.PNG")){
				DLFileEntry dlFileEntry = DLFileEntryLocalServiceUtil.fetchDLFileEntry(fn.getFileEntryId());
				FileVersion fileVersion = fn.getLatestFileVersion();
				String urlthumbnail= DLUtil.getPreviewURL(fn, fileVersion, themeDisplay, "");
				String Url=DLUtil.getDownloadURL(fn, fileVersion, themeDisplay, "");
		        long size=(long)Math.round(((double)fn.getSize())/1024);
		        List<DDMStructure> ddmStructures = dlFileEntry.getDLFileEntryType().getDDMStructures();
				for(DDMStructure d:ddmStructures){
					//out.println("["+d.getStructureId()+":"+d.getName()+":"+d.getFieldNames()+"]");
					DLFileEntryMetadata fileEntryMetadata = DLFileEntryMetadataLocalServiceUtil
			                .getFileEntryMetadata(d.getStructureId(),fileVersion.getFileVersionId());
					DDMFormValues vals = StorageEngineManagerUtil.getDDMFormValues(fileEntryMetadata.getDDMStorageId());
					List<DDMFormFieldValue> fieldValueList = vals.getDDMFormFieldValues(); 
					for(DDMFormFieldValue fieldVal : fieldValueList){
						//out.println(fieldVal.getName()+":"+fieldVal.getValue().getString(locale));
						%>
				
				<td style="padding: 5px;background-color:#6DA3D5;">
				<%=fieldVal.getValue().getString(locale)%>
				</td>
						<%
					}
				}
%>
				<td style="padding: 5px;background-color:#6DA3D5;">
				<%=fn.getFileName()%>
				</td>
				
				<td style="padding: 5px;background-color:#6DA3D5;"><%=fn.getMimeType()%></td>
				<td style="padding: 5px;background-color:#6DA3D5;"><a href="<%=Url%>" style="color:white"> <%=fn.getFileName()%> preview</a></td>
				<td style="padding: 5px;background-color:#6DA3D5;">
				<a href="<%=Url%>" style="color:white"> 
				<%--<img src="<%=urlthumbnail%>" width=20 height=20/> --%>
				<%--<%=fn.getFileName()%> --%>
				<%
				String extension="alledit";
				if(new FileServiceFileLib().finder(fn.getExtension())){
					extension=fn.getExtension();
				}
				
				%>
				<img src="<%=renderRequest.getContextPath()%>/images/<%=extension%>-icon-48x48.png" width="40" height="40"/>
				<%=size%> KB
				</a>
				</td>
				<td style="padding: 5px;background-color:#6DA3D5;">
				<%=fn.getFileEntryId()+""%>
				</td>
				
				</tr>
				<%
				
			
		//	}
		}
	}
}

%>
</table>
<%!
private String getIconFile(String ext,File []files){
	return null;
}
%>
<%--
In this context new chnages here

long FOLDER_ID = 0;
long repositoryId = themeDisplay.getScopeGroupId();
long parentFolderId = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
List<Folder> lFolder = DLAppServiceUtil.getFolders(repositoryId, parentFolderId);
for (Folder folder : lFolder)
{
	
	out.println("Folder name->"+folder.getName());
	List<FileEntry> fl=DLAppServiceUtil.getFileEntries(repositoryId, folder.getFolderId());
	for(FileEntry fn:fl){
		DLFileEntry dlFileEntry = DLFileEntryLocalServiceUtil.fetchDLFileEntry(fn.getFileEntryId());
		//DLFileVersion dl=DLFileVersionServiceUtil.getLatestFileVersion(fn.getFileEntryId());
		List<DDMStructure> ddmStructures = dlFileEntry.getDLFileEntryType().getDDMStructures();
		for(DDMStructure d:ddmStructures){
			out.println("["+d.getStructureId()+":"+d.getName()+":"+d.getFieldNames()+"]");
			FileVersion fileVersion = fn.getLatestFileVersion();
			DLFileEntryMetadata fileEntryMetadata = DLFileEntryMetadataLocalServiceUtil
	                .getFileEntryMetadata(d.getStructureId(),fileVersion.getFileVersionId());
			DDMFormValues vals = StorageEngineManagerUtil.getDDMFormValues(fileEntryMetadata.getDDMStorageId());
			List<DDMFormFieldValue> fieldValueList = vals.getDDMFormFieldValues(); 
			for(DDMFormFieldValue fieldVal : fieldValueList){
				out.println(fieldVal.getName()+":"+fieldVal.getValue().getString(locale));
				out.println(fn.getIcon());
				out.println(DLUtil.getDownloadURL(fn, fileVersion, themeDisplay, ""));
				
			//out.println("DDFORM Field Name =["+fieldVal.getName()+"]");
			//DDMFormField fml = fieldVal.getDDMFormField();
			//out.println("DDFORM Field Value =["+fieldVal.getValue().getString(locale)+"]");

			}
		}
		
		
	}
} 

 --%>

<%--
for help

<%
long FOLDER_ID = 0;
long repositoryId = themeDisplay.getScopeGroupId();
long parentFolderId = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
List<Folder> lFolder = DLAppServiceUtil.getFolders(repositoryId, parentFolderId);
for (Folder folder : lFolder)
{
	
	out.println("Folder name->"+folder.getName());
	List<FileEntry> fl=DLAppServiceUtil.getFileEntries(repositoryId, folder.getFolderId());
	for(FileEntry fn:fl){
		DLFileEntry dlFileEntry = DLFileEntryLocalServiceUtil.fetchDLFileEntry(fn.getFileEntryId());
		//Two get the version of file
		DLFileVersion dl=DLFileVersionServiceUtil.getLatestFileVersion(fn.getFileEntryId());
		//String stid=DLUtil.getDDMStructureKey(dlFileEntry.getDLFileEntryType());
		
		List<DDMStructure> ddmStructures = dlFileEntry.getDLFileEntryType().getDDMStructures();
		for(DDMStructure d:ddmStructures){
			out.println("["+d.getStructureId()+":"+d.getName()+":"+d.getFieldNames()+"]");
		}
		
		
 		//DDMStructure ddmStructure = ddmStructures.get(0);
 		//out.println(ddmStructure.getFieldNames());
		//out.println("\nFile name and version and structure ID:"+dl.getFileName()+"\t"+dl.getFileVersionId());
		//DLFileEntryMetadataLocalServiceUtil.getFileVersionFileEntryMetadatas(dl.getFileVersionId());
		//out.println(DLFileEntryMetadataLocalServiceUtil.getFileVersionFileEntryMetadatas(dl.getFileVersionId()));
		
		/*
		DLFileEntryMetadata fileEntryMetadata = DLFileEntryMetadataLocalServiceUtil
                .getFileEntryMetadata(ddmStructure.getStructureId(), dl.getFileEntryTypeId());
		out.println(ddmStructure.getFieldNames());
		*/

	}
	
    /* if (folder.getName().equalsIgnoreCase(FOLDER_NAME))
    {
        FOLDER_ID = folder.getFolderId();
        break;
    } */
}
%>

--%>

<%--
<aui:layout>
         <aui:column>
        <table id="selectedDocumentsTable">
        <%
        if(article!=null){
            java.util.List<FileEntryArticle> fileEntryArticleList=FileEntryArticleLocalServiceUtil.findBybyarticleId(article.getArticleId());
            
            for(FileEntryArticle currentObject:fileEntryArticleList){%>
           <tr id="<%=currentObject.getFileEntryId()%>">
            <td>
            <%=DLAppLocalServiceUtil.getFileEntry(currentObject.getFileEntryId()).getTitle()%>
            </td>
            <td>
            <a href="javascript:void(0);" onclick="removeDocument('<%=currentObject.getFileEntryId()%>');">remove</a>
            </td>
            </tr>
                
            <%
            
            
            }}%>
        </table>
       </aui:column>
    </aui:layout>
    <aui:layout>
   <aui:column>
    <liferay-ui:icon
    cssClass="modify-link"
    image="add"
    label="<%= true %>"
    message="select documents"
    url='<%="javascript:"+renderResponse.getNamespace()+"openDocumentSelector();" %>'/>
    </aui:column>
    </aui:layout>
    
    <aui:script>
var A = AUI();
 function <portlet:namespace />initEditor() {
  var content=A.one('#<portlet:namespace />artcileContent').get("value");
        return content;
    }
function saveData()
{


}

function <portlet:namespace />openDocumentSelector() {
        var url = '<portlet:renderURL windowState="<%= LiferayWindowState.POP_UP.toString() %>"><portlet:param name="mvcPath" value="/html/jsps/select_documents.jsp" /></portlet:renderURL>';
        var documentSelectorWindow = window.open(url, 'organization', 'directories=no,height=640,location=no,menubar=no,resizable=yes,scrollbars=yes,status=no,toolbar=no,width=680');
        documentSelectorWindow.focus();
    }
function removeDocument(deleteTrId){
//alert(deleteTrId);
A.one('#'+deleteTrId).remove();
}    
Liferay.provide(
        window,
        '<portlet:namespace />selectDocument',
        function(fileEntryId,fileTitle,folderId) {
            var A = AUI();
            var anchorHtml='<tr id="'+fileEntryId+'"><td>'+fileTitle+'</td><td><a href="javascript:void(0);" onclick="removeDocument('+fileEntryId+');">remove</a></td></tr>';
            A.one("#selectedDocumentsTable").append(anchorHtml)
            
        },
        ['liferay-search-container']
    );
</aui:script>
 --%>
