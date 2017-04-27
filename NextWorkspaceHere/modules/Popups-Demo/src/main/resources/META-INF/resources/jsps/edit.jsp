<%@ include file="/init.jsp" %>
<portlet:renderURL var="editSurveyURL">
         <portlet:param name="mvcPath" value="/jsps/NewFile.jsp" />
</portlet:renderURL>
<aui:button name="name" value="Back"  onClick="${editSurveyURL}"/>