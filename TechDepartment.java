package com.greatlearning.superHRTechAdmin;

public class TechDepartment extends SuperDepartment{
	String DepartmentName() {
		return "Tech Department";
	}
	String GeTodaysWork()
	{
		return "Complete coding of module 1";
	}
	
	String GetWorkDeadline() {
		return "Complete by EOD";
	}
	
	String GetTechStackInformation() {
		return "core Java";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/**Tech department will contain 4 methods of return type String and will not accept any parameter
i)  departmentName 
ii)  getTodaysWork  
iii) getWorkDeadline
iv) getTechStackInformation

departmentName will return “ Tech Department “
getTodaysWork will return  “ Complete coding of module 1”
getWorkDeadline will return “ Complete by EOD “
getTechStackInformation will return “core Java”
**/