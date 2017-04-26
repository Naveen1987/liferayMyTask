<%@ include file="/init.jsp" %>



<p>
<portlet:renderURL var="addEmpURL">
<portlet:param name="mvcPath" value="/views/addEmployee.jsp"/>
</portlet:renderURL>
<aui:button onClick="${addEmpURL}" value="Add Employee"></aui:button>

<portlet:actionURL name="selEmp" var="selEmpURL">
<portlet:param name="mvcPath" value="/views/selEmployee.jsp"/>
</portlet:actionURL>
<aui:button onClick="${selEmpURL}" value="Select Employees"></aui:button>

<portlet:renderURL var="serEmpURL">
<portlet:param name="mvcPath" value="/views/serEmployee.jsp"/>
</portlet:renderURL>
<aui:button onClick="${serEmpURL}" value="Search Employee"></aui:button>

</p>