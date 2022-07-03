package com.gl.departmentService;
//creating an parent class called SuperDepartment
public class SuperDepartment {
/*departmentName will return “ Super Department “
getTodaysWork will return  “ No Work as of now”
getWorkDeadline will return “ Nil “
isTodayAHoliday will return “ Today is not a holiday”
*/
	
	public static char[] isTodayAHoliday;
	public SuperDepartment()
	{
		
	}
	
	//creating four methods  1.departmentName(), 2. getTodayWork(), 3.getWorkDeadline(), 4.isTodayAHoliday()
	public String departmentName()
	{
		return "Super Department";
	}
	public String getTodayWork()
	{
		return "No work as of now";
	}
	public String getWorkDeadline()
	{
		return "Nil";
	}
	public String isTodayAHoliday()
	{
		return "Today is not a holiday";
	}
	
}
