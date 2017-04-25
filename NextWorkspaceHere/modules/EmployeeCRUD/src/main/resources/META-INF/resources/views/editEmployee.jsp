<%@ include file="/init.jsp" %>
<h1>Hello this me edit</h1>
<portlet:renderURL var="serEmpURL">
<portlet:param name="mvcPath" value="/views/serEmployee.jsp"/>
</portlet:renderURL>
<%=request.getParameter("employee")%>
<a class="btn btn-success"  href="${serEmpURL}">Back</a>