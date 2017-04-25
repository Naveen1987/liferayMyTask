package com.demo.wrap;

import com.employee.service.EmployeeeLocalServiceWrapper;

import com.liferay.portal.kernel.service.ServiceWrapper;

import org.osgi.service.component.annotations.Component;

/**
 * @author Administrator
 */
@Component(
	immediate = true,
	property = {
	},
	service = ServiceWrapper.class
)
public class FirstServiceWarapper extends EmployeeeLocalServiceWrapper {

	public FirstServiceWarapper() {
		super(null);
	}
	
	@Override
	public int getEmployeeesCount() {
		System.out.println("=============My Service===============");
		return super.getEmployeeesCount();
	}

}