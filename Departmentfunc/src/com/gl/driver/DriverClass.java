package com.gl.driver;
import com.gl.departmentService.*;
public class DriverClass {
	public static void main(String args[])
	{
		SuperDepartment superDept = new SuperDepartment();

		AdminDepartment admin = new AdminDepartment();
		System.out.println("Welcome to " +admin.departmentName());
		System.out.println(admin.getTodayWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(superDept.isTodayAHoliday());
		System.out.println(" ");
		
	
		HrDepartment hr = new HrDepartment();
		System.out.println("Welcome to " +hr.departmentName());
		System.out.println(hr.getTodayWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.doActivity());
		System.out.println(superDept.isTodayAHoliday());
		System.out.println(" ");
	
		
		TechDepartment tech = new TechDepartment();
		System.out.println("Welcome to " +tech.departmentName());
		System.out.println(tech.getTodayWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(superDept.isTodayAHoliday());
		
	}
}
