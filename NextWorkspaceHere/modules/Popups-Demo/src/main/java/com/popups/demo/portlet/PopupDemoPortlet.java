package com.popups.demo.portlet;
import com.employee.model.Employeee;
import com.employee.service.EmployeeeLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author Administrator
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=Naveen Apps",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.add-process-action-success-action=false",
		"javax.portlet.display-name=Popups-Demo",
		"javax.portlet.init-param.template-path=/jsps/",
		"javax.portlet.init-param.view-template=/jsps/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class PopupDemoPortlet extends MVCPortlet {

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		super.doView(renderRequest, renderResponse);
	}
	
	//@ProcessAction(name="showEmp")
	 public void showEmp(ActionRequest actionRequest, ActionResponse actionResponse)
	   throws IOException, PortletException {
		List<Employeee> el=EmployeeeLocalServiceUtil.getEmployeees(0, EmployeeeLocalServiceUtil.getEmployeeesCount());
		actionRequest.setAttribute("employees", el);
		SessionMessages.add(actionRequest, "showall");
}
	 public void delete(ActionRequest actionRequest, ActionResponse actionResponse)
			   throws IOException, PortletException, PortalException {
		 System.out.println("Delete");		
		 long eid=ParamUtil.getLong(actionRequest, "employeeId");
		 System.out.println(eid);
 		 EmployeeeLocalServiceUtil.deleteEmployeee(eid);
 		 SessionMessages.add(actionRequest, "delete");
		}
	 
	 public void edit(ActionRequest actionRequest, ActionResponse actionResponse)
			   throws IOException, PortletException, PortalException {
		 System.out.println("edit");		
		 long eid=ParamUtil.getLong(actionRequest, "eid");
		 String ename=ParamUtil.getString(actionRequest, "empName");
		 long esal=ParamUtil.getLong(actionRequest, "empSal");
		 Employeee e=EmployeeeLocalServiceUtil.getEmployeee(eid);
		 e.setEname(ename);
		 e.setEsal(esal);
		 EmployeeeLocalServiceUtil.updateEmployeee(e);
		 SessionMessages.add(actionRequest, "edit");
		}
}