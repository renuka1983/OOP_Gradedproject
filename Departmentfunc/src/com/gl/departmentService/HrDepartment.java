package com.gl.departmentService;


public class HrDepartment extends SuperDepartment {
	
	public HrDepartment()
	{
		
		
	}
	
	@Override
	public String departmentName()
	{
		return "Hr Department";
	}
	@Override
	public String getTodayWork()
	{
		return "Fill today’s worksheet and mark your attendance";
	}
	@Override
	public String getWorkDeadline()
	{
		return "Complete by EOD";
	}
	public String doActivity()
	{
		return "team Lunch";
	}
	

}
