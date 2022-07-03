package com.gl.departmentService;

public class TechDepartment extends SuperDepartment {
	public TechDepartment()
	{
		
		
	}
	
	@Override //redefining the methods already in parent class
	public String departmentName()
	{
		return "Tech Department";
	}
	@Override
	public String getTodayWork()
	{
		return "Complete coding of module 1";
	}
	@Override
	public String getWorkDeadline()
	{
		return "Complete by EOD ";
	}
	public String getTechStackInformation()
	{
		return "core Java";
	}

}
