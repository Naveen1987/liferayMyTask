<%@ include file="/init.jsp" %>
<portlet:renderURL var="editCancelURL">
         <portlet:param name="mvcPath" value="/jsps/view.jsp" />
</portlet:renderURL>
<portlet:actionURL name="add" var="addEmp">
<portlet:param name="mvcPath" value="/jsps/view.jsp"/>
</portlet:actionURL>

<aui:form action="${addEmp}" method="post">
<aui:input name="empName" label="Employee Name" value="" id="empName">
<aui:validator name="required" />
</aui:input>
<aui:input name="empSal" label="Employee Salary" value="" id="empSal">
<aui:validator name="required" />
</aui:input>
<table>
<tr><td><aui:button type="submit" value="Add Employee" /></td><td><a class="btn btn-success"  href="${editCancelURL}">Cancel</a></td></tr>
</table>
</aui:form>