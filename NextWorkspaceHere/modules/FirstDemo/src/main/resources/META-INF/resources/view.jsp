<%@page import="com.employee.service.EmployeeeLocalServiceUtil"%>
<%@ include file="/init.jsp" %>

<p>
	<b><liferay-ui:message key="FirstDemo.caption"/></b>
	<%
	out.println(EmployeeeLocalServiceUtil.getEmployeeesCount());
	%>
</p>