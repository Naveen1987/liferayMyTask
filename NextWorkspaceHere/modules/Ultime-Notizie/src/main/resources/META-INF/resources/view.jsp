<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.blogs.kernel.model.BlogsEntry"%>
<%@page import="com.liferay.blogs.kernel.service.BlogsEntryLocalServiceUtil"%>
<%@page import="java.util.*"%>
<%@ include file="/init.jsp" %>

<%--<%=BlogsEntryLocalServiceUtil.getBlogsEntriesCount()%>--%>
<%--<%=BlogsEntryLocalServiceUtil.getBlogsEntries(0, BlogsEntryLocalServiceUtil.getBlogsEntriesCount()) %> --%>
<div style="height:100px; overflow:auto;">
<table style="border-collapse: separate; border-spacing: 5px;" width="100%">
<%--<tr>
<td>Date</td><td>Title</td>
</tr> --%>
<% 
List<BlogsEntry>lt=BlogsEntryLocalServiceUtil.getBlogsEntries(0, BlogsEntryLocalServiceUtil.getBlogsEntriesCount());
for(BlogsEntry b:lt){
	%>
	<tr>
	<td style="background-color:#70db70; font-family: Helvetica Neue,Helvetica,Arial,sans-serif;font-weight: bold; font-size: 14px; width:100px ;padding: 3px;"><%=new SimpleDateFormat("dd/MM/YYYY").format(b.getCreateDate()).toString()%></td>
	<td style="font-family: Helvetica Neue,Helvetica,Arial,sans-serif; font-size: 14px; padding: 3px;"><%=b.getTitle()%></td>
	</tr>
	<%
}
%>
</table>
</div>
