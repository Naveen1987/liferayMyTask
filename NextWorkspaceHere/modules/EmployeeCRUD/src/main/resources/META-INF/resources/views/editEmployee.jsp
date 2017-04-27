<%@page import="com.employee.model.Employeee"%>
<%@ include file="/init.jsp" %>
<h1>Edit Page</h1>
<portlet:renderURL var="serEmpURL">
<portlet:param name="mvcPath" value="/views/serEmployee.jsp"/>
</portlet:renderURL>
<%
Employeee e=(Employeee)request.getAttribute("employee");
%>

<portlet:actionURL var="editEmpURL" name="editEmp">
<portlet:param name="eid" value="<%=e.getEid()+""%>"/>
<portlet:param name="mvcPath" value="/views/serEmployeeResult.jsp"/>
</portlet:actionURL>

<aui:form action="${editEmpURL}">
<aui:input name="empName" label="Employee Name" value="<%=e.getEname()+"" %>" id="empName">
<aui:validator name="required" />
</aui:input>
<aui:input name="empSal" label="Employee Salary" value="<%=e.getEsal()+"" %>" id="empSal">
<aui:validator name="required" />
</aui:input>
<!-- It will not create button -->
<!-- <aui:input name="" type="submit" value="Add Employee"></aui:input> -->
<table>
<tr><td><aui:button name="edit-popup"  id="edit-popup" type="submit" value="Edit" /></td><td><a class="btn btn-success"  href="${serEmpURL}">Cancel</a></td></tr>
</table>
 
</aui:form>

<%--
<script>
 AUI().use('node', function(A){
   A.one('#<portlet:namespace/>empName').set('value', ""); 
   A.one('#<portlet:namespace/>empSal').set('value', ""); 
 });
</script>
 --%>

<%--<a class="btn btn-success"  href="${serEmpURL}">Back</a> --%>
