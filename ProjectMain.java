package Project_3;

import java.util.Scanner;

//import Project_3.Course.Student;

public class ProjectMain {
	public static void main(String[] args) {
		RegistrationManager manager = new RegistrationManager();

        // Create courses
        Course java = new Course("C101", "Java Programming");
        Course python = new Course("C102", "Python Programming");

        manager.addCourse(java);
        manager.addCourse(python);

        // Create student
        Student student1 = new Student("S001", "Alice");
        manager.addStudent(student1);
        Student student2 = new Student("S002", "Scott");
        manager.addStudent(student2);
        try {
            // Register courses
            student1.registerCourse(java);
            student1.registerCourse(python);
            // Attempt duplicate registration
            student1.registerCourse(java); // This will throw an exception
        } catch (CourseAlreadyRegisteredException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            // Drop a course
            student1.dropCourse(java);
            // Try dropping again to cause exception
            student1.dropCourse(java); // This will throw an exception
        } catch (CourseNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Display registered courses
        System.out.println("Courses registered by " + student1.getName() + ":");
        for (Course c : student1.getRegisteredCourses()) {
            System.out.println(c);
        }
    }


}
