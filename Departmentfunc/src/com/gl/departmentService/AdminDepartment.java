package com.gl.departmentService;

public class AdminDepartment extends SuperDepartment {
	
	public AdminDepartment()
	{
		
	}
	
	@Override
	public String departmentName()
	{
		return "Admin Department";
	}
	@Override
	public String getTodayWork()
	{
		return "Complete your documents Submission";
	}
	@Override
	public String getWorkDeadline()
	{
		return "Complete by EOD ";
	}
	

}
