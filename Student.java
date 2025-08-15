package Project_3;
import java.util.ArrayList;
import java.util.List;
//import Project_3.Course.Student;
public class Student extends Person implements Registrable{
	private List<Course> registeredCourses;

    public Student(String id, String name) {
        super(id, name);
        registeredCourses = new ArrayList<>();
    }

    @Override
    public void registerCourse(Course course) throws CourseAlreadyRegisteredException {
        if (registeredCourses.contains(course)) {
            throw new CourseAlreadyRegisteredException("Already registered for: " + course.getCourseName());
        }
        registeredCourses.add(course);
    }

    @Override
    public void dropCourse(Course course) throws CourseNotFoundException {
        if (!registeredCourses.contains(course)) {
            throw new CourseNotFoundException("Course not found in registration: " + course.getCourseName());
        }
        registeredCourses.remove(course);
    }
    
    public List<Course> getRegisteredCourses() {
        return registeredCourses;
    }


}
