package entities;

import enums.CourseLevel;
import interfaces.printable;

import java.util.Objects;

public final class Course implements printable {
    private final String courseId;
    private final String courseName;
    private final CourseLevel level;
    private final int creditHours;
    private final String description;
    private final String professorId;
    private final int maxStudents;
    private int currentEnrollment;

    public Course(String courseId, String courseName, CourseLevel level,
                  int creditHours, String description, String professorId, int maxStudents) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.level = level;
        this.creditHours = creditHours;
        this.description = description;
        this.professorId = professorId;
        this.maxStudents = maxStudents;
        this.currentEnrollment = 0; // Start with no students enrolled
    }


    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public CourseLevel getLevel() {
        return level;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public String getDescription() {
        return description;
    }

    public String getProfessorId() {
        return professorId;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public int getCurrentEnrollment() {
        return currentEnrollment;
    }

    @Override
    public void printDetails() {
        System.out.println("Course ID: " + this.courseId);
        System.out.println("Course Name: " + this.courseName);
        System.out.println("Course Level: " + this.level);
        System.out.println("Credit Hours: " + this.creditHours);
        System.out.println("Description: " + this.description);
        System.out.println("Professor ID: " + this.professorId);
        System.out.println("Max Students: " + this.maxStudents);
        System.out.println("Current Enrollment: " + this.currentEnrollment);

    }


    @Override
    public String getFormattedInfo() {
        return this.courseName + " " + this.level;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Course course)) return false;
        return getCreditHours() == course.getCreditHours() && getMaxStudents() == course.getMaxStudents() && getCurrentEnrollment() == course.getCurrentEnrollment() && Objects.equals(getCourseId(), course.getCourseId()) && Objects.equals(getCourseName(), course.getCourseName()) && getLevel() == course.getLevel() && Objects.equals(getDescription(), course.getDescription()) && Objects.equals(getProfessorId(), course.getProfessorId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCourseId(), getCourseName(), getLevel(), getCreditHours(), getDescription(), getProfessorId(), getMaxStudents(), getCurrentEnrollment());
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", level=" + level +
                ", creditHours=" + creditHours +
                ", description='" + description + '\'' +
                ", professorId='" + professorId + '\'' +
                ", maxStudents=" + maxStudents +
                ", currentEnrollment=" + currentEnrollment +
                '}';
    }
    public boolean enrollStudent(){
        if(this.currentEnrollment < this.maxStudents){
            this.currentEnrollment++;
            return true;
        }
        else return false;
    }

    public boolean withdrawStudents(){
        if(this.currentEnrollment > 0){
            this.currentEnrollment--;
            return true;
        }else return false;
    }
    public boolean isFull(){
        if(this.currentEnrollment >= this.maxStudents) return true;
        else return false;
    }
    public boolean hasSpace(){
        if(this.currentEnrollment < this.maxStudents) return true;
        else return false;
    }

}
