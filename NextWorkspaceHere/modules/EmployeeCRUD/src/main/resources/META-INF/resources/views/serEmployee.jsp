<%@page import="com.employee.model.Employeee"%>
<%@ include file="/init.jsp" %>
<portlet:actionURL name="serEmp" var="serEmpURL">
<portlet:param name="mvcPath" value="/views/serEmployeeResult.jsp"/>
</portlet:actionURL>
<portlet:renderURL var="viewURL">
<portlet:param name="mvcPath" value="/views/view.jsp"/>
</portlet:renderURL>
<liferay-ui:success key="delete" message="Record Deleted successfully!"/>
<liferay-ui:success key="edit" message="Record Updated successfully!"/>

<aui:form action="${serEmpURL}">
<aui:input name="eid" type="text" label="Please Enter Eployee ID">
<aui:validator name="required" />
</aui:input>
<table>
<tr>
<td><aui:button type="submit" value="Search" /></td><td><td><a class="btn btn-success"  href="${viewURL}">Back</a></td></td>
</tr>
</table>
</aui:form>
<script>
 AUI().use('node', function(A){
   A.one('#<portlet:namespace/>eid').set('value', ""); 
 });
</script>