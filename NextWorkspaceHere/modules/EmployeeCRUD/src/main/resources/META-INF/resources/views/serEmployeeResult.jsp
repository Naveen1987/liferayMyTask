<%@page import="com.employee.model.Employeee"%>
<%@ include file="/init.jsp" %>
<portlet:renderURL var="serEmpURL">
<portlet:param name="mvcPath" value="/views/serEmployee.jsp"/>
</portlet:renderURL>


<%
Object e=request.getAttribute("emp");
if(e==null){
	%>
	<div class="alert alert-danger">
   	Sorry! No Record Found.
	</div>
	<%
}
	else{
	Employeee em=(Employeee)e;
	pageContext.setAttribute("em", em);
	//response.getWriter().println(em);
	%>
	<form>
	<div class="table-responsive">
    <table class="table">
    <tr><td>Employee ID</td> <td>Employee Name</td> <td>Employee Salary</td><td>Action</td></tr>
    <tr>
    <td><c:out value="${em.eid}"/></td>
    <td><c:out value="${em.ename}"/></td>
   <td><c:out value="${em.esal}"/></td>
   <td>
   <div class="btn-group dropdown">
    <button class="btn btn-primary dropdown-toggle" data-toggle="dropdown" type="button">
       Action <span class="caret"></span>
    </button>
    <ul class="dropdown-menu">
<portlet:actionURL var="editEmpURL" name="selectForEmp">
<portlet:param name="mvcPath" value="/views/editEmployee.jsp"/>
<portlet:param name="eid" value="<%=em.getEid()+""%>"/>
</portlet:actionURL> 
        <li><a href="${editEmpURL}">Edit</a></li>
        <li class="divider"></li>
        
<portlet:actionURL var="delEmpURL" name="selectForEmp">
<portlet:param name="mvcPath" value="/views/delEmployee.jsp"/>
<portlet:param name="eid" value="<%=em.getEid()+""%>"/>
</portlet:actionURL>
       <li><a href="${delEmpURL}">Delete</a></li>
    </ul>
</div>
   </td>
   </tr>
   </table>
   </div>
	<%
	}
%>
<a class="btn btn-success"  href="${serEmpURL}">Search Again</a>
