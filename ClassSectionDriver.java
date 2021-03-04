/*************************************************************************
* Name: HW 6 Classes And Objects
* File: ClassSectionDriver.java
* Author: Milo Osterman
* Date: 3/4/2021
* Prompt: 
* 
* You will write a Java class to represent a class section like our very own CIS 131. This class
* has a number of data members (aka instance variables, aka properties aka attributes) which
* we all know so well from looking at class schedules on the Pima web site:
* 
* 1. CRN, like 20008
* 2. Department code, like CIS
* 3. Course number, like 131
* 4. Instructional mode, like online, on-ground or hybrid
* 5. Meeting days (on-ground and hybrid only, otherwise “N/A”)
* 6. Meeting times (on-ground and hybrid only, otherwise “N/A”)
* 7. Capacity (maximum number of students who can enroll in it)
* 8. Enrollment (number of students actually enrolled in it)
* 9. Instructor’s ID number
* 
*************************************************************************/

public class ClassSectionDriver {

	public static void main(String[] args) {
		
		//Create two ClassSection objects
		ClassSection sectionObj1 = new ClassSection(); //Invokes default constructor
		ClassSection sectionObj2 = new ClassSection(12345, "PHI", 101, "In-person", "MWF", "2:30-4:30", 50, 43, 8693);
		
		//Use objects setter methods to assign values to its attributes
		sectionObj1.setCrnNum(20008);
		sectionObj1.setDeptCode("CIS");
		sectionObj1.setCourseNum(131);
		sectionObj1.setInstructionMode("Online");
		sectionObj1.setMeetingDays("N/A");
		sectionObj1.setMeetingTimes("N/A");
		sectionObj1.setCapacity(30);
		sectionObj1.setEnrollment(30);
		sectionObj1.setInstructorId(666);
		
		//Display the String returned by toString of ClassSection object
		System.out.println(sectionObj1.toString());
		
		//Display string of second ClassSection object
		System.out.println(sectionObj2.toString());
		
	}

}
