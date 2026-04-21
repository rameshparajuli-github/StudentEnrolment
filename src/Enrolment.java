import java.util.ArrayList;
// Enrolment class - links a Student to a Course with waitlist feature
public class Enrolment {
    // Private attributes
    private Student student;
    private Course course;
    private String enrolmentDate;

    // Constructor
    public Enrolment(Student student, Course course, String enrolmentDate) {
        this.student = student;
        this.course = course;
        this.enrolmentDate = enrolmentDate;
    }

    // Getters and setters
    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }
    public void setCourse(Course course) {
        this.course = course;
    }

    public String getEnrolmentDate() {
        return enrolmentDate;
    }
    public void setEnrolmentDate(String enrolmentDate) {
        this.enrolmentDate = enrolmentDate;
    }

    // Basic enrolment creation
    public static Enrolment createEnrolment(Student student, Course course, String enrolmentDate) {
        if (course.hasAvailableSeat()) {
            course.addStudent(student);
            return new Enrolment(student, course, enrolmentDate);
        } else {
            System.out.println("Enrolment failed: Course is full for " + course.getCourseName());
            return null;
        }
    }

    // ODD student ID extension: Waitlist system
    public static Enrolment createEnrolmentWithWaitlist(Student student, Course course, String enrolmentDate) {
        if (course.hasAvailableSeat()) {
            course.addStudent(student);
            return new Enrolment(student, course, enrolmentDate);
        } else {
            System.out.println("Course is full. " + student.getName() + " has been added to the waitlist.");
            course.addToWaitlist(student);
            return null;
        }
    }

    // Display enrolment details
    public void displayEnrolmentDetails() {
        System.out.println("Student ID     : " + student.getStudentId());
        System.out.println("Student Name   : " + student.getName());
        System.out.println("Course Code    : " + course.getCourseCode());
        System.out.println("Course Name    : " + course.getCourseName());
        System.out.println("Enrolment Date : " + enrolmentDate);
    }
}