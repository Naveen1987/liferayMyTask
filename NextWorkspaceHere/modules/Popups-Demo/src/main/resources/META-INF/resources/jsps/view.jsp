<%@ include file="/init.jsp" %>
<liferay-ui:success key="add" message="Record Added successfully!"/>

<portlet:actionURL name="showEmp" var="showEmpURL">
<portlet:param name="mvcPath" value="/jsps/listOfAll.jsp"/>
</portlet:actionURL>
<aui:button  value="List Only" onClick="${showEmpURL}" />

<portlet:renderURL var="viewURL">
<portlet:param name="mvcPath" value="/jsps/NewFile.jsp"/>
</portlet:renderURL>
<aui:button  value="List With Edit & Delete" onClick="${viewURL}" />

<portlet:renderURL var="addURL">
<portlet:param name="mvcPath" value="/jsps/add.jsp"/>
</portlet:renderURL>
<aui:button  value="New Employee" onClick="${addURL}" />