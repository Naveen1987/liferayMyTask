<%@ include file="/init.jsp" %>

<portlet:actionURL name="showEmp" var="showEmpURL">
<portlet:param name="mvcPath" value="/jsps/listOfAll.jsp"/>
</portlet:actionURL>
<aui:button  value="List of All Employees" onClick="${showEmpURL}" />

<portlet:renderURL var="viewURL">
<portlet:param name="mvcPath" value="/jsps/NewFile.jsp"/>
</portlet:renderURL>
<aui:button  value="New File" onClick="${viewURL}" />