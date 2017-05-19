<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@ include file="/init.jsp" %>
<%@page import="com.demo.filelib.model.*"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>



<style>

.tableForMedia {
    color:white;border-collapse: separate;font-family: Lucida Bright, Lucida, serif;  border-spacing: 5px ;border-color:whilte
}

.tdformedia{
   padding: 5px;background-color:#4da6ff;
}
.thformedia{
 padding: 5px;background-color:#002db3;
}
.spanLanguageDesign{
    margin: auto;
    width: 50%;
    padding: 3px;
    color: white;
    bakground-color:#000066;
    font-weight: bold;
   
}

</style>

<div style="width:100%; overflow:auto;">
<table width="100%" class="tableForMedia">
 <tr>
    <th class="thformedia">COD</th>
    <th class="thformedia">TITOLO</th>
    <th class="thformedia">Dimensioni</th>
    <th class="thformedia">LINGUA</th>
</tr>

<%--This is new format --%>
<%
String cod="",titolo="",lingua="";
FileServiceFileLib fsfl=new FileServiceFileLib();
List<FileLibInfo> records=fsfl.getRecords("Regolamento", themeDisplay,locale);
for(FileLibInfo record:records){
	for(Map.Entry<String,String> entry:record.getFields().entrySet()){
		if(entry.getKey().equalsIgnoreCase("cod")){
			cod=entry.getValue().toString();
		}
		else if(entry.getKey().equalsIgnoreCase("titolo")){
			titolo=entry.getValue().toString();
		}
		else if(entry.getKey().equalsIgnoreCase("lingua")){
			lingua=entry.getValue().toString();
		}
	}
	%>
	<tr>
	<td class="tdformedia"><%=cod%></td>
	<td width="60%" class="tdformedia"><%=titolo %></td>
	<td class="tdformedia">
	<table width="100%">
	<tr><td>
	<aui:a href="<%=record.getDownloadUrl()%>" style="color:white;text-decoration:none;">
    <img src="<%=renderRequest.getContextPath()%>/images/<%=record.getImageName()%>" width="25" height="30"/>
	<%=record.getSize()%>
    </aui:a>
    </td>
    <td align="right">
    <aui:button value="View" onClick='<%="openLiferayPopUP(\'"+record.getMime()+"\',\'"+record.getDownloadUrl() +"\',\'"+record.getFileuuid()+"\',\'"+record.getFileEntryId()+"\',);"%>'>
    </aui:button>
	</td>
	</tr>
	</table>
	</td>
	<td class="tdformedia"><span class="spanLanguageDesign"><%=lingua%></span></td>
	</tr>
	<%--For viewer --%>
	
	<%
}

%>

<%-- --%>
<portlet:renderURL var="docURL"  windowState="<%=LiferayWindowState.POP_UP.toString()%>">
	<portlet:param name="mvcPath" value="/pdViewer.jsp" />
</portlet:renderURL>
<aui:script> 
function openLiferayPopUP(mime,url,uuid,fileid)
{  
	alert(url);
		
}

</aui:script>

<!-- For Closing --> 
<%--This is Old data --%>
<%--  
<%
FileServiceFileLib fsfl=new FileServiceFileLib();
List<FileLibInfo> records=fsfl.getRecords("Student Documents", themeDisplay,locale);
%>
<%
for(FileLibInfo record:records){
%>
	<tr>
	<td class="tdformedia"><%=record.getFileEntryId()%></td>
	<td class="tdformedia"><%=record.getFileName()%></td>
	<td class="tdformedia"><%=record.getFileVersion()%></td>
	<td class="tdformedia"><%=record.getMime()%></td>
	<td class="tdformedia"><%=record.getExtension()%></td>
	<td class="tdformedia"><%=record.getImageName()%></td>
	<%
	String cod,titolo,rev,lingua;
	for(Map.Entry<String,String> entry:record.getFields().entrySet()){
	%>
	<td class="tdformedia">
	<%=entry.getValue()%>
	</td>
	<%
	}
	%>	
	<td class="tdformedia">
	<a href="<%=record.getDownloadUrl()%>" style="color:white"> 
	<img src="<%=renderRequest.getContextPath()%>/images/<%=record.getImageName()%>" width="25" height="30"/>
	<%=record.getSize()%>
	</a>
	</td>
				
	</tr>
	<%
}
%>
--%>
</table>
</div>

