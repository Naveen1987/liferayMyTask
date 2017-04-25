<%@ include file="/init.jsp" %>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
 <portlet:renderURL var="popupUrl" windowState="<%=LiferayWindowState.POP_UP.toString() %>">
 <portlet:param name="mvcPath" value="/NewFile.jsp"/>
</portlet:renderURL>
<aui:button name="login-popup"  id="login-popup"  value="login"> </aui:button>
 <aui:script>
 AUI().use('aui-base',
		 'liferay-util-window',
		 'aui-io-plugin-deprecated',
		 function(A){
      A.one('#<portlet:namespace/>login-popup').on('click', function(event){
      var login_popup= Liferay.Util.Window.getWindow(
                {
                    dialog: {
                        centered: true,
                        constrain2view: true,
                          modal: true,
                        resizable: false,
                        width: 475
                    }
                }).plug(A.Plugin.DialogIframe,
                     {
                     autoLoad: true,
                     iframeCssClass: 'dialog-iframe',
                     uri:'<%=popupUrl%>'
                     }).render();
    
             		 login_popup.show();
                     login_popup.titleNode.html("Add new Employee");
                    
 
     });
 });
 </aui:script>