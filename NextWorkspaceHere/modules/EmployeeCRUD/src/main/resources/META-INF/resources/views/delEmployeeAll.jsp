<%@page import="com.employee.model.Employeee"%>
<%@ include file="/init.jsp" %>


<h1>Delete Page</h1>
<portlet:actionURL var="serEmpURL" name="selEmp">
<portlet:param name="mvcPath" value="/views/selEmployee.jsp"/> 
</portlet:actionURL>
<%
Employeee e=(Employeee)request.getAttribute("employee");
%>

<portlet:actionURL var="delEmpURL" name="delEmpAll">
<portlet:param name="mvcPath" value="/views/selEmployee.jsp"/>
</portlet:actionURL>

<aui:form action="${delEmpURL}">
<aui:input readonly="true" name="empId" label="Employee ID"  value="<%=e.getEid()+"" %>" id="empId">

</aui:input>
<aui:input readonly="true" name="empName" label="Employee Name" value="<%=e.getEname()+"" %>" id="empName">

</aui:input>
<aui:input readonly="true" name="empSal" label="Employee Salary" value="<%=e.getEsal()+"" %>" id="empSal">

</aui:input>
<!-- It will not create button -->
<!-- <aui:input name="" type="submit" value="Add Employee"></aui:input> -->
<table>
<tr><td><aui:button type="submit" value="Delete" /></td><td><a class="btn btn-success"  href="${serEmpURL}">Cancel</a></td></tr>
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
