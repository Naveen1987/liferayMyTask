package com.demo_employee.portlet;



import com.demo.service.EmployeeSer;
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
import javax.portlet.PortletPreferences;
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
		"javax.portlet.display-name=EmployeeCRUD",
		"javax.portlet.init-param.template-path=/views/",
		"javax.portlet.init-param.view-template=/views/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class EmployeeCRUDPortlet extends MVCPortlet {
	
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
				super.doView(renderRequest, renderResponse);
	}
	
	//start
	//Here we are adding some defualt properties that will help to show
	//any where we want to show
	//with <liferay-ui:success key="success" message="Record saved successfully!"/>
	@Override
	public void processAction(
	    ActionRequest actionRequest, ActionResponse actionResponse)
	    throws IOException, PortletException {

	    PortletPreferences prefs = actionRequest.getPreferences();
	    String greeting = actionRequest.getParameter("greeting");

	    if (greeting != null) {
	        prefs.setValue("greeting", greeting);
	        prefs.store();
	    }
	    //call this line when you need greeting
	   // SessionMessages.add(actionRequest, "success");
	    super.processAction(actionRequest, actionResponse);
	}
	//end

/*
 When the annotation states
@ProcessAction(name="submitRegister")
then the method implemented should also be of same name
public void submitRegister(ActionRequest request, ActionResponse response) 
throws PortletException, IOException{
}
otherwise face this error
javax.portlet.PortletException: javax.portlet.PortletException: processAction method not implemented in liferay
* */
	@ProcessAction(name="addEmp")
	 public void addEmp(ActionRequest actionRequest, ActionResponse actionResponse)
	   throws IOException, PortletException {
		System.out.println("I got It");
		String ename=ParamUtil.getString(actionRequest,"empName");
		long esal=ParamUtil.getLong(actionRequest,"empSal");
		System.out.println(ename+" "+esal);  
		new EmployeeSer().save(ename, esal);
		//actionRequest.setAttribute("insert", "Successfully");
		//for greeting
		SessionMessages.add(actionRequest, "success");
		System.out.println("Ok");
 }
	@ProcessAction(name="selEmp")
	 public void selEmp(ActionRequest actionRequest, ActionResponse actionResponse)
	   throws IOException, PortletException {
		List<Employeee> l=new EmployeeSer().selectAll();
		actionRequest.setAttribute("employees",l);
		System.out.println("Select Employee");
//		By programming you can render on different page
//		actionResponse.setRenderParameter("jspPage", "/views/selEmployee.jsp");
}
	@ProcessAction(name="serEmp")
	 public void serEmp(ActionRequest actionRequest, ActionResponse actionResponse)
	   throws IOException, PortletException {
		long eid=ParamUtil.getLong(actionRequest, "eid");
		Employeee e=new EmployeeSer().select(eid);
		actionRequest.setAttribute("emp", e);		
}
	
	@ProcessAction(name="editEmp")
	 public void editEmp(ActionRequest actionRequest, ActionResponse actionResponse)
	   throws IOException, PortletException {
		System.out.println("I got It in edit method"+ParamUtil.getLong(actionRequest, "eid"));
		
}
	
	@ProcessAction(name="selectForEmp")
	 public void selectForEmp(ActionRequest actionRequest, ActionResponse actionResponse)
	   throws IOException, PortletException {
		long eid=ParamUtil.getLong(actionRequest, "eid");
		System.out.println("I got It in edit method"+eid);
		try {
			Employeee e=(Employeee)EmployeeeLocalServiceUtil.getEmployeee(eid);
			actionRequest.setAttribute("employee", e);
			//System.out.println(e);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
} 
	@ProcessAction(name="delEmp")
	 public void delEmp(ActionRequest actionRequest, ActionResponse actionResponse)
	   throws IOException, PortletException {
		System.out.println("I got It in del method"+ParamUtil.getLong(actionRequest, "eid"));
		
}
}