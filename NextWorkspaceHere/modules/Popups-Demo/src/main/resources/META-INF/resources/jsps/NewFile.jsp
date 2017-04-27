<%@page import="com.employee.service.EmployeeeLocalServiceUtil"%>
<%@ include file="/init.jsp" %>

<liferay-ui:success key="edit" message="Record Edited successfully!"/>
<liferay-ui:success key="delete" message="Record Deleted successfully!"/>


<liferay-portlet:renderURL varImpl="viewURL">
<portlet:param name="mvcPath" value="/jsps/NewFile.jsp"/>
</liferay-portlet:renderURL>

<liferay-ui:search-container delta="2" iteratorURL="<%= viewURL%>">
	<liferay-ui:search-container-results>
	<%
	results=EmployeeeLocalServiceUtil.getEmployeees(searchContainer.getStart(), searchContainer.getEnd());
	total=EmployeeeLocalServiceUtil.getEmployeeesCount();
	searchContainer.setResults(results);
	searchContainer.setTotal(total);
	%>
	</liferay-ui:search-container-results>
		<liferay-ui:search-container-row
		className="com.employee.model.Employeee"
		modelVar="aEmployeeeModel">
	
		<liferay-ui:search-container-column-text property="eid"  name="EID"/>

		<liferay-ui:search-container-column-text property="ename" name="ENAME"/>

		<liferay-ui:search-container-column-text property="esal" name="ESALARY" />
		<liferay-ui:search-container-column-text name="Action">
		<liferay-ui:icon-menu>
     	<portlet:renderURL var="editSurveyURL">
         <portlet:param name="mvcPath" value="/jsps/edit.jsp" />
        <portlet:param name="employeeId" value="<%=String.valueOf(aEmployeeeModel.getEid())%>" />
     	</portlet:renderURL>
   		 <%--  <liferay-ui:icon image="edit" message="EDIT"
         url="<%=editSurveyURL.toString()%>" /> --%>
         <%--Or --%>
         <liferay-ui:icon image="edit" message="EDIT"
         url="${editSurveyURL}" />
     <portlet:actionURL name="delete" var="deleteSurveyAction">
         <portlet:param name="employeeId"
            value="<%=String.valueOf(aEmployeeeModel.getEid())%>" />
         <portlet:param name="mvcPath" value="/jsps/NewFile.jsp"/>   
    </portlet:actionURL>
    <%-- <liferay-ui:icon image="delete" message="DELETE"
        url="<%=deleteSurveyAction.toString()%>" /> --%>
        <%--Or --%>
        <liferay-ui:icon image="delete" message="DELETE"
        url="${deleteSurveyAction}" />
</liferay-ui:icon-menu>
		</liferay-ui:search-container-column-text>		
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>