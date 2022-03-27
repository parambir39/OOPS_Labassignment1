package com.greatlearning.superHRTechAdmin;

public class AdminDepartment extends SuperDepartment {

	String DepartmentName() {
		return "Admin Department ";
	}
	String GetTodaysWork() {
		return "Complete your documents Submission";
	}
	String GetWorkDeadline() {
		return "Complete by EOD ";
	}


	}



/**Admin department will contain 3 methods of return type String and will not accept any parameter
        i)  departmentName 
       ii)  getTodaysWork  
       iii) getWorkDeadline
       
departmentName will return “ Admin Department “
getTodaysWork will return “Complete your documents Submission”
getWorkDeadline will return “ Complete by EOD “
**/