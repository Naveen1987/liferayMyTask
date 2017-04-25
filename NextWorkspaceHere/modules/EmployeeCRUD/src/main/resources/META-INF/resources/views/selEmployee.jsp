<%@ include file="/init.jsp" %>
<%@page import="java.util.*,com.employee.model.Employeee" %>
<%
List<Employeee> em = (List<Employeee>) request.getAttribute("employees");
pageContext.setAttribute("em", em);
//response.getWriter().print(em);
%>
<div class="table-responsive">
    <table class="table">
    <tr><td>Employee ID</td> <td>Employee Name</td> <td>Employee Salary</td></tr>
  <c:forEach items="${em}" var="item">
  <tr>
  <td><c:out value="${item.eid}"/></td>
  <td><c:out value="${item.ename}"/></td>
  <td><c:out value="${item.esal}"/></td>
  </tr>
  </c:forEach>
    </table>
</div>
<portlet:renderURL var="serEmpURL">
<portlet:param name="mvcPath" value="/views/view.jsp"/>
</portlet:renderURL>
<a class="btn btn-success"  href="${serEmpURL}">Back</a>