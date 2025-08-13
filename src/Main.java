import Generics.Container;
import entities.Course;
import entities.Student;
import entities.professor;
import enums.CourseLevel;
import enums.GradeType;
import enums.StudentStatus;
import utils.IDGenerator;
import utils.SystemConfig;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.println("=== University Management System ===");
        SystemConfig config = SystemConfig.getInstance();
        System.out.println("System Configuration:");
        System.out.println("University: " + config.getUniversityName());
        System.out.println("Academic Year: " + config.getAcademicYear());
        System.out.println("Max Students Per Course: " + config.getMaxStudentsPerCourse());
        System.out.println("Minimum GPA for Graduation: " + config.getMinimumGpaForGraduation());
        System.out.println();

        System.out.println("=== Creating Students ===");
        Student alice = new Student("Alice", "Johnson", "alice@email.com", IDGenerator.generateStudentId());
        Student bob = new Student("Bob", "Smith", "bob@email.com", IDGenerator.generateStudentId());
        System.out.println("Student Created: " + alice.getStudentid() + " - " + alice.getFullName() + " (" + alice.getMajor() + ")");
        System.out.println("Student Created: " + bob.getStudentid() + " - " + bob.getFullName() + " (" + bob.getMajor() + ")");
        System.out.println();

        System.out.println("=== Creating Professors ===");
        professor prof = new professor("Dr. Jane", "Wilson", "jane@email.com", IDGenerator.generateProfessorId(), "Computer Science", "AI", 10, 75000);
        System.out.println("Professor Created: " + prof.getUniqueId() + " - " + prof.getFullName() + " (" + prof.getDepartment() + ", " + prof.getYearsOfExperience() + " years)");
        System.out.println();

        System.out.println("=== Creating Courses ===");
        Course course = new Course(IDGenerator.generateCourseId(), "Data Structures", CourseLevel.INTERMEDIATE, 3, "Introduction to data structures", prof.getUniqueId(), 30);
        System.out.println("Course Created: " + course.getCourseId() + " - " + course.getCourseName() + " (" + course.getLevel() + ", " + course.getCreditHours() + " credits)");
        System.out.println();

        System.out.println("=== Enrollment Testing ===");
        boolean enrollResult = course.enrollStudent();
        System.out.println("Enrolling Alice in Data Structures... " + (enrollResult ? "Success!" : "Failed!"));
        System.out.println("Current enrollment: " + course.getCurrentEnrollment() + "/" + course.getMaxStudents());
        System.out.println();

        System.out.println("=== Grade Testing ===");
        GradeType grade1 = GradeType.getGradeByScore(95);
        GradeType grade2 = GradeType.getGradeByScore(82);
        System.out.println("Score 95 = Grade " + grade1.getLetterGrade() + " (" + grade1.getGpaPoints() + " GPA points)");
        System.out.println("Score 82 = Grade " + grade2.getLetterGrade() + " (" + grade2.getGpaPoints() + " GPA points)");
        System.out.println();

        System.out.println("=== Testing Singleton ===");
        SystemConfig config1 = SystemConfig.getInstance();
        SystemConfig config2 = SystemConfig.getInstance();
        System.out.println("Config Instance 1: SystemConfig@" + Integer.toHexString(config1.hashCode()));
        System.out.println("Config Instance 2: SystemConfig@" + Integer.toHexString(config2.hashCode()));
        System.out.println("Same instance: " + (config1 == config2));
    }
}