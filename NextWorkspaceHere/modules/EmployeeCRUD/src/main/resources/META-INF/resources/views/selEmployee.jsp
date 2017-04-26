<%@ include file="/init.jsp" %>
<%@page import="java.util.*,com.employee.model.Employeee" %>


<liferay-ui:success key="delete" message="Record Deleted successfully!"/>
<liferay-ui:success key="edit" message="Record Updated successfully!"/>


<%
List<Employeee> em = (List<Employeee>) request.getAttribute("employees");
pageContext.setAttribute("em", em);
//response.getWriter().print(em);
%>
<div class="table-responsive">
    <table class="table">
    <tr><td>Employee ID</td> <td>Employee Name</td> <td>Employee Salary</td><td>Action</td></tr>
  <c:forEach items="${em}" var="item">
  <tr>
  <td><c:out value="${item.eid}"/>
      <c:set var="primKey" value="${item.eid}"></c:set>
  </td>
  <td><c:out value="${item.ename}"/></td>
  <td><c:out value="${item.esal}"/></td>
  
   <td>
   <div class="btn-group dropdown">
    <button class="btn btn-primary dropdown-toggle" data-toggle="dropdown" type="button">
       Action <span class="caret"></span>
    </button>
    <ul class="dropdown-menu">
<portlet:actionURL var="editEmpURL" name="selectForEmpAll">
<portlet:param name="mvcPath" value="/views/editEmployeeAll.jsp"/>
<portlet:param name="eid" value="<%=pageContext.getAttribute("primKey")+""%>"/>
</portlet:actionURL> 
        <li><a href="${editEmpURL}">Edit</a></li>
        <li class="divider"></li>
        
<portlet:actionURL var="delEmpURL" name="selectForEmpAll">
<portlet:param name="mvcPath" value="/views/delEmployeeAll.jsp"/>
<portlet:param name="eid" value="<%=pageContext.getAttribute("primKey")+""%>"/>
</portlet:actionURL>
       <li><a href="${delEmpURL}">Delete</a></li>
    </ul>
</div>
   </td>
  
  </tr>
  </c:forEach>
    </table>
</div>
<portlet:renderURL var="serEmpURL">
<portlet:param name="mvcPath" value="/views/view.jsp"/>
</portlet:renderURL>
<a class="btn btn-success"  href="${serEmpURL}">Back</a>