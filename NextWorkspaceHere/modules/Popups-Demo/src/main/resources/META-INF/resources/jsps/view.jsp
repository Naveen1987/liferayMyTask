<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ include file="/init.jsp" %>

<liferay-ui:success key="add" message="Record Added successfully!"/>

<portlet:actionURL name="showEmp" var="showEmpURL" windowState="<%= LiferayWindowState.POP_UP.toString()%>">
<portlet:param name="mvcPath" value="/jsps/listOfAll.jsp"/>
</portlet:actionURL>
<aui:button  value="List Only" id="btnshowEmp"/>

<portlet:renderURL var="viewURL">
<portlet:param name="mvcPath" value="/jsps/NewFile.jsp"/>
</portlet:renderURL>
<aui:button  value="List Operation" id="btnviewURL" onClick="${viewURL}" />

<portlet:renderURL var="addURL">
<portlet:param name="mvcPath" value="/jsps/add.jsp"/>
</portlet:renderURL>
<aui:button  value="New Employee" id="btnaddURL"/>



<portlet:renderURL var="loginURL" windowState="<%=LiferayWindowState.POP_UP.toString()%>">
<portlet:param name="mvcPath" value="/jsps/login.jsp" />
</portlet:renderURL>
<aui:button name="login" type="button" id="login" value="Click Here For Login" />


<aui:script use="liferay-util-window">
A.one('#<portlet:namespace/>login').on('click', function(event) {
<!-- alert("open"); -->
Liferay.Util.openWindow({
dialog: {
centered: true,
height: 500,
modal: true,
width: 500
},
id: '<portlet:namespace/>dialog',
title: 'Login',
uri: '<%=loginURL %>'
});
});
</aui:script>



<aui:script use="liferay-util-window">
A.one('#<portlet:namespace/>btnshowEmp').on('click', function(event) {
alert("open");
Liferay.Util.openWindow({
dialog: {
centered: true,
//height: 500,
modal: true,
width: 950
},
id: '<portlet:namespace/>listdialog',
title: 'Employee Information',
uri: '<%=showEmpURL%>'
});
});
</aui:script>



<!-- For Closing --> 
<aui:script> 
Liferay.provide(window,'<portlet:namespace/>closeYourPopUp', function(data, dialogId) 
		{ 
	alert("second");
	var A = AUI(); 
	var dialog = Liferay.Util.Window.getById(dialogId); 
	dialog.destroy();
	}, 
	['liferay-util-window'] 
	); 
	</aui:script>
		