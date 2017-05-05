<%@page import="com.employee.service.EmployeeeLocalServiceUtil"%>
<%@ include file="/init.jsp" %>
<%--<a class="mystyle">Hello My Friends</a> --%>

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
<%--Now Adding of Insert button--%>
<portlet:renderURL var="addURL">
<portlet:param name="mvcPath" value="/jsps/add.jsp"/>
</portlet:renderURL>

<liferay-ui:icon image="add"  url="${addURL}"/>

<%--this is css button to show --%>
<%--
<a class="btn btn-action btn-primary" href="${addURL}">
    <svg class="icon-monospaced lexicon-icon">
        <use xlink:href="../../images/icons/icons.svg#plus" />
    </svg>
</a>
 --%>

<%--<portlet:renderURL var="backURL">
         <portlet:param name="mvcPath" value="/jsps/view.jsp" />
</portlet:renderURL> --%>
<a class="btn btn-success" id="btnback" onClick="<portlet:namespace />closeLiferayPopUP()">Back</a>
  <script>
  function <portlet:namespace />closeLiferayPopUP()
   {  
	  alert("first"); 
      var data = ''; 
	Liferay.Util.getOpener().<portlet:namespace/>closeYourPopUp(data, '<portlet:namespace/>listEditdialog');
	}
  </script>


