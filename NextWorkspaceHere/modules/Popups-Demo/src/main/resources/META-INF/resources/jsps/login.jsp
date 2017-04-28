<%@ include file="/init.jsp" %>
<portlet:actionURL var="loginAction"> 
 </portlet:actionURL> 
 <div id="fm"> <form name="form" id="form" action="<%=loginAction %>" method="POST"> 
 <aui:input name="name" type="text" /> 
 <aui:input name="password" type="password">
 </aui:input> 
 <aui:button name="submit" type="Submit" value="SUBMIT" /> 
<aui:button name="cancel" type="button" value="CANCEL" /> 
 </form> </div> <!-- For Closing -->
 <aui:script use="aui-base">
 A.one('#<portlet:namespace/>cancel').on('click', function(event) 
		 {  alert("first"); 
		 var data = ''; 
		 Liferay.Util.getOpener().<portlet:namespace/>closeYourPopUp(data, '<portlet:namespace/>dialog');
		 });
 </aui:script> 
		 