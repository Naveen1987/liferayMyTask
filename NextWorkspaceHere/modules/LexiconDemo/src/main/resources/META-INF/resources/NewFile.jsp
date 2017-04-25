<%@ include file="/init.jsp" %>
<portlet:actionURL name="addEmp" var="addEmpURL">
<portlet:param name="mvcPath" value="/views/addEmployee.jsp"/>
</portlet:actionURL>

<aui:form action="">
<aui:input name="empName" label="Employee Name"></aui:input>
<aui:input name="empSal" label="Employee Salary"></aui:input>
<!-- It will not create button -->
<!-- <aui:input name="" type="submit" value="Add Employee"></aui:input> -->
<aui:button type="submit" value="Add Employee" />
</aui:form>