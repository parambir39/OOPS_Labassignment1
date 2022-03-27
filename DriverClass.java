package com.greatlearning.superHRTechAdmin;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TechDepartment objtech=new TechDepartment();
AdminDepartment objadmin=new AdminDepartment();
HRDepartment objhr= new HRDepartment();
System.out.println("Welcome to the "+objadmin.DepartmentName());
objadmin.GetTodaysWork();
objadmin.GetWorkDeadline();
objadmin.IsTodayAHoliday();

System.out.println("Welcome to the "+objhr.DepartmentName());
objhr.GetTodaysWork();
objhr.GetWorkDeadline();
objhr.DoActivity();
objhr.IsTodayAHoliday();



System.out.println("Welcome to the "+objtech.DepartmentName());
objtech.GeTodaysWork();
objtech.GetWorkDeadline();
objtech.GetTechStackInformation();
objtech.IsTodayAHoliday();


	
	}
	

}

