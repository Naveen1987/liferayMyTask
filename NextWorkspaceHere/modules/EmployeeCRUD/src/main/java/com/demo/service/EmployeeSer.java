package com.demo.service;

import java.util.List;

import com.employee.model.Employeee;
import com.employee.service.EmployeeeLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;

public class EmployeeSer {
public void save(String ename,long esal)
{
//	Employeee e=EmployeeeLocalServiceUtil.createEmployeee(EmployeeeLocalServiceUtil.getEmployeeesCount()+1);
	Employeee e=EmployeeeLocalServiceUtil.createEmployeee(CounterLocalServiceUtil.increment());
	e.setEname(ename);
	e.setEsal(esal);
	//EmployeeeLocalServiceUtil.updateEmployeee(e);
	EmployeeeLocalServiceUtil.addEmployeee(e);
}
public void update(long eid,String ename,long esal) throws PortalException
{
	Employeee e=EmployeeeLocalServiceUtil.getEmployeee(eid);
	e.setEname(ename);
	e.setEsal(esal);
	EmployeeeLocalServiceUtil.updateEmployeee(e);
}
public Employeee select(long eid) 
{
	Employeee e=null;
	try {
		e = EmployeeeLocalServiceUtil.getEmployeee(eid);
		} catch (PortalException e1) {}
	return e;
}
public List<Employeee> selectAll(){
	List<Employeee> l=EmployeeeLocalServiceUtil.getEmployeees(0,EmployeeeLocalServiceUtil.getEmployeeesCount());
	return l;
}
}
