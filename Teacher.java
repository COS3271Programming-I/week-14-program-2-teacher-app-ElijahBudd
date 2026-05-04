package myProjects;

public class Teacher extends Person {

	String subject;
	String employeeId;
	
	void teach() {
        System.out.println(firstName + " Speaks up and begins teaching " + subject + ".");
    }
 
    void gradeAssignments() {
        System.out.println(firstName + " sits down and grades some assignments for " + subject + ".");
    }
}
