import java.util.ArrayList;

public class Course {
    // Private attributes
    private String courseCode;
    private String courseName;
    private int maximumCapacity;
    private ArrayList<Student> enrolledStudents;
    private ArrayList<Student> waitlist;   // Used for odd student ID extension

    // Constructor
    public Course(String courseCode, String courseName, int maximumCapacity) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.maximumCapacity = maximumCapacity;
        this.enrolledStudents = new ArrayList<>();
        this.waitlist = new ArrayList<>();

    }

    // Getters and setters
    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    public void setMaximumCapacity(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public ArrayList<Student> getWaitlist() {
        return waitlist;
    }





    // Display course details
    public void displayCourseDetails() {
        System.out.println("Course Code      : " + courseCode);
        System.out.println("Course Name      : " + courseName);
        System.out.println("Maximum Capacity : " + maximumCapacity);
        System.out.println("Currently Enrolled: " + enrolledStudents.size());
    }

    // Check if course has space
    public boolean hasAvailableSeat() {
        return enrolledStudents.size() < maximumCapacity;
    }

    // Add student to enrolled list
    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }

    // Add student to waitlist (odd ID extension)
    public void addToWaitlist(Student student) {
        waitlist.add(student);
    }

    // Display waitlist
    public void displayWaitlist() {
        System.out.println("Waitlist for " + courseName + ":");
        if (waitlist.isEmpty()) {
            System.out.println("No students in waitlist.");
        } else {
            for (Student s : waitlist) {
                System.out.println("- " + s.getName() + " (" + s.getStudentId() + ")");
            }
        }
    }
}