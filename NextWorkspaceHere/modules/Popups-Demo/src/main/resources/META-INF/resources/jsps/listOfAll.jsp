<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.employee.service.EmployeeeLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="java.util.*"%>
<%@page import="com.employee.model.Employeee"%>
<%@ include file="/init.jsp" %>
<%--Message area --%>
<liferay-ui:success key="showall" message="This is list of all Employee!"/>

<%-- <div class="table-responsive">
<table class="table">
<tr><td>Employee ID</td> <td>Employee Name</td><td>Employee Salary</td><td>Action</td></tr>
<c:forEach items="${el}" var="em">
<tr>
<td>
<c:out value="${em.eid}"/>
</td>
<td>
<c:out value="${em.ename}"/>
</td>
<td>
<c:out value="${em.esal}"/>
</td>
<td>
Action
</td>
</tr>
</c:forEach>
</table>
</div>--%>

<%--<portlet:renderURL var="viewURL">
<portlet:param name="mvcPath" value="/jsps/view.jsp"/>
</portlet:renderURL>  --%>


<%-- <liferay-portlet:renderURL varImpl="iteratorURL">
<portlet:param name="mvcPath" value="/jsps/listOfAll.jsp"/>
</liferay-portlet:renderURL>--%> 


 <%--Don't care about error because it injected by liferay container --%>
 <%--Note:-
 iteratorURL.setParameter("jspPage","/jsps/listOfAll.jsp"); 
 always same page not other otherwise pagination will not work
   --%>
<%
PortletURL iteratorURL = renderResponse.createRenderURL();
iteratorURL.setParameter("jspPage","/jsps/listOfAll.jsp");
%>
 
<liferay-ui:search-container iteratorURL="<%= iteratorURL %>" delta="2" emptyResultsMessage="No Record Found!!" deltaConfigurable="true" >
<liferay-ui:search-container-results>
<%--This is very inportant part so use it carefully Not access the 
parameter from request object like me 
List<Employeee> el=(List<Employeee>)request.getAttribute("employee");
It's giving me runtime exception due to scope of request so avoid this type of works
I have to replace that line with 
List<Employeee> el=(List<Employeee>)EmployeeeLocalServiceUtil.getEmployeees(0, EmployeeeLocalServiceUtil.getEmployeeesCount());
 --%>
 	<%
 	List<Employeee> el=(List<Employeee>)EmployeeeLocalServiceUtil.getEmployeees(0, EmployeeeLocalServiceUtil.getEmployeeesCount());
 	System.out.println("value:"+el);
    results=ListUtil.subList(el, searchContainer.getStart(), searchContainer.getEnd());
 	//System.out.println("Size:"+el.size());
 	//System.out.println("Start:"+searchContainer.getStart());
 	//System.out.println("End:"+searchContainer.getEnd());
 	searchContainer.setResults(results);
    searchContainer.setTotal(el.size());
    %>
</liferay-ui:search-container-results> 
<liferay-ui:search-container-row className="com.employee.model.Employeee" keyProperty="eid" modelVar="employeee">
        <liferay-ui:search-container-column-text property="eid" />
        <liferay-ui:search-container-column-text property="ename" />
        <liferay-ui:search-container-column-text property="esal" />
    	</liferay-ui:search-container-row>
    	<liferay-ui:search-iterator/>
    	<%--You can also write this its more descriptivie but optional --%>
    	<%--<liferay-ui:search-iterator searchContainer="<%= searchContainer %>" paginate="true"> --%>
</liferay-ui:search-container>

<portlet:renderURL var="backURL">
         <portlet:param name="mvcPath" value="/jsps/view.jsp" />
</portlet:renderURL>
<a class="btn btn-success" name="<portlet:namespace/>btnback">Back</a>

 