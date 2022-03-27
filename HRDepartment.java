package com.greatlearning.superHRTechAdmin;

public class HRDepartment extends SuperDepartment {
	String DepartmentName() {
		return "Hr Department";
	}
	String GetTodaysWork() {
		return "Fill today’s worksheet and mark your attendance";
	}
	String GetWorkDeadline() {
		return "Complete by EOD ";
	}
	String DoActivity() {
		return "team Lunch";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/** Hr department will contain 4 methods of return type String and will not accept any parameter
i)  departmentName 
ii)  getTodaysWork  
iii) getWorkDeadline
iv) doActivity

departmentName will return “ Hr Department “
getTodaysWork will return  “ Fill today’s worksheet and mark your attendance”
getWorkDeadline will return “ Complete by EOD “
doActivity “team Lunch”
**/