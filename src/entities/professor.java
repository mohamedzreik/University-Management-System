package entities;

import enums.CourseLevel;

import java.util.Objects;

public class professor extends person {
    private String professorId, department, specialization;
    int yearsOfExperience;
    double salary;

    public professor() {
    }

    public professor(String firstName, String lastName, String email, String address, int age, String professorId, String department, String specialization, int yearsOfExperience, double salary) {
        super(firstName, lastName, email, address, age);
        this.professorId = professorId;
        this.department = department;
        this.specialization = specialization;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    public professor(String firstName, String lastName, String email, String professorId, String department, String specialization, int yearsOfExperience, double salary) {
        super(firstName, lastName, email);
        this.professorId = professorId;
        this.department = department;
        this.specialization = specialization;
    }

    public String getRole() {
        return "Professor";
    }

    public String getUniqueId() {
        return professorId;
    }


    public String getProfessorId() {
        return professorId;
    }

    public void setProfessorId(String professorId) {
        this.professorId = professorId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double calculateAnnualSalary() {
        return salary * 12;
    }

    public boolean canTeachCourse(CourseLevel level) {
        switch (level) {
            case BEGINNER:
                return true;
            case INTERMEDIATE:
                return this.yearsOfExperience >= 2;
            case ADVANCED:
                return this.yearsOfExperience >= 5;
            case GRADUATE:
                return this.yearsOfExperience >= 8;
            default:
                return false;
        }
    }


    @Override
    public String toString() {
        return "professor{" +
                "professorId='" + professorId + '\'' +
                ", department='" + department + '\'' +
                ", specialization='" + specialization + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                ", salary=" + salary +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof professor professor)) return false;
        if (!super.equals(o)) return false;
        return getYearsOfExperience() == professor.getYearsOfExperience() && Double.compare(getSalary(), professor.getSalary()) == 0 && Objects.equals(getProfessorId(), professor.getProfessorId()) && Objects.equals(getDepartment(), professor.getDepartment()) && Objects.equals(getSpecialization(), professor.getSpecialization());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getProfessorId(), getDepartment(), getSpecialization(), getYearsOfExperience(), getSalary());
    }
}