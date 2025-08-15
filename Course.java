package Project_3;

public class Course {
	
    private String courseId;
    private String courseName;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Course) {
            Course other = (Course) obj;
            return this.courseId.equals(other.courseId);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return courseId.hashCode();
    }

    @Override
    public String toString() {
        return courseId + ": " + courseName;
    }

}
