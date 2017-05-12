<%@page import="java.util.Arrays"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="com.demo.filelib.model.*"%>
<%@ include file="/init.jsp" %>

<link href="<%=renderRequest.getContextPath()%>/css/demo_table_jui.css" rel="stylesheet" />
<link href="<%=renderRequest.getContextPath()%>/css/jquery-ui.css" rel="stylesheet" />
<link href="<%=renderRequest.getContextPath()%>/css/demo_page.css" rel="stylesheet" />

<script src="<%=renderRequest.getContextPath()%>/js/jquery.js"></script>
<script src="<%=renderRequest.getContextPath()%>/js/jquery.dataTables.js"></script>
<script>
$(document).ready(function() {
	$(".jqueryDataTable").dataTable({
		"sPaginationType" : "full_numbers",
		"bProcessing" : false,
		"bServerSide" : false,
		"sAjaxSource" : "displayData.jsp",
		"bJQueryUI" : true,
		"aoColumns" : [
            { "mData": "company" },
            { "mData": "country" },
            { "mData": "year" },
            { "mData": "revenue" }
        ]
    } ); 
} );
</script>

</head>

<body id="dt_example">
<div id="container">
<h1>jQuery DataTable plugin in Java web application</h1>
<div id="demo_jui">
	<table class="display jqueryDataTable">
	<thead>
	<tr>
		<th>Company</th>
		<th>Country</th>
		<th>Year</th>
		<th>Revenue</th>
	</tr>
	</thead>
	<tbody>
	</tbody>
	</table>
</div>
</div>
</body>
</html>


<%--
<%
FileServiceFileLib fsfl=new FileServiceFileLib();
List<FileLibInfo> records=fsfl.getRecords("Student Documents", themeDisplay,locale);
%>
<table width="100%" style="color:#1500DC;border-collapse: separate; border-spacing: 5px ;border-color:whilte">
<%
for(FileLibInfo record:records){
	%>
	<tr>
	<td style="padding: 5px;background-color:#6DA3D5;"><%=record.getFileEntryId()%></td>
	<td style="padding: 5px;background-color:#6DA3D5;"><%=record.getFileName()%></td>
	<td style="padding: 5px;background-color:#6DA3D5;"><%=record.getFileVersion()%></td>
	<td style="padding: 5px;background-color:#6DA3D5;"><%=record.getMime()%></td>
	<td style="padding: 5px;background-color:#6DA3D5;"><%=record.getExtension()%></td>
	<td style="padding: 5px;background-color:#6DA3D5;"><%=record.getImageName()%></td>
	<%
	for(Map.Entry<String,String> entry:record.getFields().entrySet()){
		%>
	<td style="padding: 5px;background-color:#6DA3D5;">
	<%=entry.getValue()%>
	</td>
	<%
	}
	%>	
	<td style="padding: 5px;background-color:#6DA3D5;">
	<a href="<%=record.getDownloadUrl()%>" style="color:white"> 
	<img src="<%=renderRequest.getContextPath()%>/images/<%=record.getImageName()%>" width="40" height="40"/>
	<%=record.getSize()%>
	</a>
	</td>
				
	</tr>
	<%
}
%>

--%>