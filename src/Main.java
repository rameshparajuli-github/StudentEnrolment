import java.util.ArrayList;
// Main class - demonstrates the Student Enrolment System
public class Main {
    public static void main(String[] args) {

        // Create students
        Student student1 = new Student("S101", "Ramesh Parajuli", "ramesh@email.com");
        Student student2 = new Student("S102", "Sita Sharma", "sita@email.com");
        Student student3 = new Student("S103", "Hari Thapa", "hari@email.com");

        // Create courses
        Course course1 = new Course("IT101", "Introduction to Programming", 2);
        Course course2 = new Course("IT201", "Object Oriented Programming", 1);

        // Display students details
        System.out.println(" STUDENT INFORMATION ");
        student1.displayStudentInfo();
// Add a separator line in displayStudentInfo()
        System.out.println("------------------------------");;
        student2.displayStudentInfo();
// Add a separator line in displayStudentInfo()
        System.out.println("------------------------------");

        // Display courses details
        System.out.println(" COURSE DETAILS ");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
        System.out.println();

        // Store enrolments Arraylist
        ArrayList<Enrolment> enrolments = new ArrayList<>();




        Enrolment e1 = Enrolment.createEnrolment(student1, course1, "2026-04-19");
        Enrolment e2 = Enrolment.createEnrolment(student2, course1, "2026-04-19");

        if (e1 != null) enrolments.add(e1);
        if (e2 != null) enrolments.add(e2);



        // Waitlist ODD STUDENT ID EXTENSION

        System.out.println(" WAITLIST SYSTEM ");
        Enrolment e3 = Enrolment.createEnrolmentWithWaitlist(student3, course1, "2026-04-19");
        if (e3 != null) enrolments.add(e3);

        course1.displayWaitlist();


        }
    }
