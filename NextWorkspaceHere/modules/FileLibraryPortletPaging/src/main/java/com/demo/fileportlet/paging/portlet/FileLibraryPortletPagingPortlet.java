package com.demo.fileportlet.paging.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import com.demo.filelib.model.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.osgi.service.component.annotations.Component;

/**
 * @author Administrator
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=Naveen Apps",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=FileLibraryPortletPaging Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class FileLibraryPortletPagingPortlet extends MVCPortlet {
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
				super.doView(renderRequest, renderResponse);
	}
	
	
}