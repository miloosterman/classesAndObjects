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

public class ClassSection {
	
	//Data members
	private int crnNum;
	private String deptCode;
	private int courseNum;
	private String instructionMode;
	private String meetingDays;
	private String meetingTimes;
	private int capacity;
	private int enrollment;
	private int instructorId;
	
	//Constructors
	ClassSection(){ 
		setCrnNum(0);
		setDeptCode("");
		setCourseNum(0);
		setInstructionMode("");
		setMeetingDays("");
		setMeetingTimes("");
		setCapacity(0);
		setEnrollment(0);
		setInstructorId(0);
		
	}
	
	
	ClassSection(int crnNum, String deptCode, int courseNum, String instructionMode,
			String meetingDays, String meetingTimes, int capacity, int enrollment, int instructorId){
		setCrnNum(crnNum);
		setDeptCode(deptCode);
		setCourseNum(courseNum);
		setInstructionMode(instructionMode);
		setMeetingDays(meetingDays);
		setMeetingTimes(meetingTimes);
		setCapacity(capacity);
		setEnrollment(enrollment);
		setInstructorId(instructorId);
		
	}
	
	//Setters and getters
	void setCrnNum(int crnNum) {
		this.crnNum = crnNum;
		
	}
	
	
	int getCrnNum() {
		return crnNum;
		
	}
	
	
	void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
		
	}
	
	
	String getDeptCode() {
		return deptCode;
		
	}
	
	
	void setCourseNum(int courseNum) {
		this.courseNum = courseNum;
		
	}
	
	
	int getCourseNum() {
		return courseNum;
		
	}
	
	
	void setInstructionMode(String instructionMode) {
		this.instructionMode = instructionMode;
		
	}
	
	
	String getInstructionMode() {
		return instructionMode;
		
	}
	
	
	void setMeetingDays(String meetingDays) {
		this.meetingDays = meetingDays;
		
	}
	
	
	String getMeetingDays() {
		return meetingDays;
		
	}
	
	
	void setMeetingTimes(String meetingTimes) {
		this.meetingTimes = meetingTimes;
		
	}
	
	
	String getMeetingTimes() {
		return meetingTimes;
		
	}
	
	
	void setCapacity(int capacity) {
		this.capacity = capacity;
		
	}
	
	
	int getCapacity() {
		return capacity;
	}
	
	
	void setEnrollment(int enrollment) {
		this.enrollment = enrollment;
		
	}
	
	
	int getEnrollment() {
		return enrollment;
		
	}
	
	
	void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
		
	}
	
	
	int getInstructorId() {
		return instructorId;
		
	}
	
	//toString method to convert data members of ClassSection object to one string with labels
	public String toString() {
		return ("CRN                  : " + crnNum + "\n" +
				"Department           : " + deptCode + "\n" +
				"Course number        : " + courseNum + "\n" +
				"Instructional mode   : " + instructionMode + "\n" +
				"Meeting days         : " + meetingDays + "\n" +
				"Meeting times        : " + meetingTimes + "\n" +
				"Capacity             : " + capacity + "\n" +
				"Enrollment           : " + enrollment + "\n" +
				"Instructor's ID      : " + instructorId + "\n");
	}

}
