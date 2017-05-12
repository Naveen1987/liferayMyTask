<%@page import="java.util.Arrays"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="com.demo.filelib.model.*"%>
<%@ include file="/init.jsp" %>
<%@page import="com.google.gson.*" %>
<%
response.setContentType("application/json");
// Call business service class to get list of company
List<RevenueReport> listOfCompany = BusinessService.getCompanyList();

DataTableParameters dataTableParam = new DataTableParameters();
// Set the list fetched in aaData
dataTableParam.setAaData(listOfCompany);

Gson gson = new GsonBuilder().setPrettyPrinting().create();
// Convert Java Object to Json
String json = gson.toJson(dataTableParam);

response.getWriter().print(json);
%>