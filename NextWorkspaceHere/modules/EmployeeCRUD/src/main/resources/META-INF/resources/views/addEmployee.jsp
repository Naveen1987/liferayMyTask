<%@ include file="/init.jsp" %>
<%--After successfully insert --%>
<liferay-ui:success key="success" message="Record saved successfully!"/>


<portlet:actionURL name="addEmp" var="addEmpURL">
<portlet:param name="mvcPath" value="/views/addEmployee.jsp"/>
</portlet:actionURL>
<portlet:renderURL var="viewURL">
<portlet:param name="mvcPath" value="/views/view.jsp"/>
</portlet:renderURL>

<aui:form action="${addEmpURL}">
<aui:input name="empName" label="Employee Name" value="" id="empName">
<aui:validator name="required" />
</aui:input>
<aui:input name="empSal" label="Employee Salary" value="" id="empSal">
<aui:validator name="required" />
</aui:input>
<!-- It will not create button -->
<!-- <aui:input name="" type="submit" value="Add Employee"></aui:input> -->
<table>
<tr><td><aui:button type="submit" value="Add Employee" /></td><td><a class="btn btn-success"  href="${viewURL}">Back</a></td></tr>
</table>
 
</aui:form>
<script>
 AUI().use('node', function(A){
   A.one('#<portlet:namespace/>empName').set('value', ""); 
   A.one('#<portlet:namespace/>empSal').set('value', ""); 
 });
</script>

