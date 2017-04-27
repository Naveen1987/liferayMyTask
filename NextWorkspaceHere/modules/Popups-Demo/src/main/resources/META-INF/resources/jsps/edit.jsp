<%@page import="com.employee.service.EmployeeeLocalServiceUtil"%>
<%@page import="com.employee.model.Employeee"%>
<%@ include file="/init.jsp" %>
<portlet:renderURL var="editCancelURL">
         <portlet:param name="mvcPath" value="/jsps/NewFile.jsp" />
</portlet:renderURL>
<portlet:actionURL name="edit" var="editEmp">
<portlet:param name="mvcPath" value="/jsps/NewFile.jsp"/>
</portlet:actionURL>
<%
long eid=Long.valueOf(request.getParameter("employeeId"));
Employeee e=EmployeeeLocalServiceUtil.getEmployeee(eid);
%>
<aui:form action="${editEmp}" method="post">
<aui:input name="eid" value="<%=e.getEid()+"" %>" readonly="true">
<aui:validator name="required" />
</aui:input>
<aui:input name="empName" label="Employee Name" value="<%=e.getEname()+"" %>" id="empName">
<aui:validator name="required" />
</aui:input>
<aui:input name="empSal" label="Employee Salary" value="<%=String.valueOf(e.getEsal()) %>" id="empSal">
<aui:validator name="required" />
</aui:input>
<!-- It will not create button -->
<!-- <aui:input name="" type="submit" value="Add Employee"></aui:input> -->
<table>
<tr><td><aui:button type="submit" value="Edit Employee" /></td><td><a class="btn btn-success"  href="${editCancelURL}">Cancel</a></td></tr>
</table>
</aui:form>
