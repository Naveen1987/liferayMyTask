
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.blogs.kernel.model.BlogsEntry"%>
<%@page import="com.liferay.blogs.kernel.service.BlogsEntryLocalServiceUtil"%>
<%@page import="java.util.*"%>
<%@ include file="/init.jsp" %>

<%--<%=BlogsEntryLocalServiceUtil.getBlogsEntriesCount()%>--%>
<%--<%=BlogsEntryLocalServiceUtil.getBlogsEntries(0, BlogsEntryLocalServiceUtil.getBlogsEntriesCount()) %> --%>

<div style="height:100px; overflow:auto;">
<table>
<tr>
<td>Date</td><td>Title</td>
</tr>
<% 
List<BlogsEntry>lt=BlogsEntryLocalServiceUtil.getBlogsEntries(0, BlogsEntryLocalServiceUtil.getBlogsEntriesCount());
for(BlogsEntry b:lt){
	%>
	<tr>
	<td><%=new SimpleDateFormat("dd/MM/YYYY").format(b.getCreateDate()).toString()%></td>
	<td><%=b.getTitle()%></td>
	</tr>
	<%
}
%>
</table>
</div>
