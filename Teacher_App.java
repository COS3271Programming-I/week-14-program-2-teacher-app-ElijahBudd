package myProjects;

import java.util.ArrayList;

public class Teacher_App {
	public static void main (String[] args){
		
		// Instantiate people
		Teacher t1 = new Teacher();
		t1.firstName = "Jim";
		t1.lastName = "Smith";
		t1.age = 46;
		t1.subject = "English";
		t1.employeeId = "5532";
		
		Teacher t2 = new Teacher();
		t2.firstName = "Samantha";
		t2.lastName = "Gauff";
		t2.age = 58;
		t2.subject = "Software Engineering";
		t2.employeeId = "3209";
		
		Student s1 = new Student();
		s1.firstName = "Keith";
		s1.lastName = "Lamar";
		s1.age = 20;
		s1.major = "Communications";
		s1.classRank = "Sophmore";
		s1.studentEmail = "klamar@students.unwsp.edu";
		
		Student s2 = new Student();
		s2.firstName = "Wyatt";
		s2.lastName = "Witner";
		s2.age = 18;
		s2.major = "Computer Science";
		s2.classRank = "Freshman";
		s2.studentEmail = "WWitner@students.unwsp.edu";
		
		Person p1 = new Person();
		p1.firstName = "Ben";
		p1.lastName = "Limbherg";
		p1.age = 25;
		
		Person p2 = new Person();
		p2.firstName = "Ted";
		p2.lastName = "Ford";
		p2.age = 28;
		
		// Collect into a list
		ArrayList<Person> people = new ArrayList<>();
		people.add(t1);
		people.add(t2);
		people.add(s1);
		people.add(s2);
		people.add(p1);
		people.add(p2);
		
		// Print people
		System.out.println("___People___");
		for (int i = 0; i < people.size(); i++) {
            Person p = people.get(i);
            String label = getLabel(p);
            System.out.println("Person " + (i + 1) + ": "
                    + p.firstName + " " + p.lastName
                    + ", age " + p.age
                    + label);
        }
		
		System.out.println("");
		
		// Demo call the subclass specific methods
		System.out.println("---Activity Demo---");
		t1.teach();
		s2.eat();
		p1.sayGreeting();
		t2.gradeAssignments();
	}
	
	// Returns role suffix or empty string for a normal person
	private static String getLabel(Person p) {
        if (p instanceof Teacher) {
            Teacher t = (Teacher) p;
            return ", teacher (" + t.subject + ")";
        } else if (p instanceof Student) {
            Student s = (Student) p;
            return ", student (" + s.classRank + ")";
        }
        return "";
    }
}
