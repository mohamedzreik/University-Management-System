package entities;

import enums.GradeType;
import enums.StudentStatus;
import interfaces.enrollable;

import java.util.Objects;



public class Student extends person implements enrollable {


    private String studentid;
    StudentStatus status;
    double gpa;
    int creditHours;
    String major;


    public Student() {
    };
    public void addCreditHours(int hours){
        this.creditHours += hours;
    }


    public void UpdateGpa(double gpa){
        this.gpa = gpa;
    }

    public boolean canGraduate(){
        if(creditHours <= 120 && gpa >= 2.0) return true;
        else return false;
    }
    public Student(String firstName, String lastName, String email, String address, int age, String studentid, StudentStatus status, double gpa, int creditHours, String major) {
        super(firstName, lastName, email, address, age);
        this.studentid = studentid;
        this.status = status;
        this.gpa = gpa;
        this.creditHours = creditHours;
        this.major = major;
    }

    public Student(String firstName, String lastName, String email, String major) {
        super(firstName, lastName, email);
        this.major = major;
    }

    @Override
    public String getUniqueId() {
        return studentid;
    }


    @Override
    public String getRole() {
        return "Student";
    }

    public Student(String firstName, String lastName, String email, String address, int age) {
        super(firstName, lastName, email, address, age);
    }

    @Override
    public boolean canEnroll() {
    return this.status == StudentStatus.ACTIVE;
    }
    @Override
    public void enroll() {

            if(this.status == StudentStatus.INACTIVE){
                this.status = StudentStatus.ACTIVE;
            }
        }

        public void printdetails(){
            System.out.println(this.getFirstName() + " " + this.getLastName() + " " + this.getStudentid() + " " + this.getAge() + " " + this.getMajor());
        }

    @Override
    public void withdraw() {

        this.status = StudentStatus.INACTIVE;

    }

    @Override
    public StudentStatus getEnrollmentStatus() {
        return this.status;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public StudentStatus getStatus() {
        return status;
    }

    public void setStatus(StudentStatus status) {
        this.status = status;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }


    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "studentid='" + studentid + '\'' +
                ", status=" + status +
                ", gpa=" + gpa +
                ", creditHours=" + creditHours +
                ", major='" + major + '\'' +
                '}';
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getStudentid(), getStatus(), getGpa(), getCreditHours(), getMajor());
    }



    public class Contactinfo{

        String emergencyContactName;
        String emergencyContactPhone;
        String address;

        public Contactinfo(String emergencyContactName, String emergencyContactPhone, String address) {
            this.emergencyContactName = emergencyContactName;
            this.emergencyContactPhone = emergencyContactPhone;
            this.address = address;
        }

        public String getEmergencyContactName() {
            return emergencyContactName;
        }

        public void setEmergencyContactName(String emergencyContactName) {
            this.emergencyContactName = emergencyContactName;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getEmergencyContactPhone() {
            return emergencyContactPhone;
        }

        public void setEmergencyContactPhone(String emergencyContactPhone) {
            this.emergencyContactPhone = emergencyContactPhone;
        }

        public String getStudentInfo(){
            return "Parent Name :" + emergencyContactName + "\n" + "Parent Phone Number :" + emergencyContactPhone + "\n" + "Address :" + address;
        }
    }





public static class AcademicRecord{

        String semester , courseName ;
        int grade , creditHours ;
        public AcademicRecord(String semester, String courseName, int grade, int creditHours) {
            this.semester = semester;
            this.courseName = courseName;
            this.grade = grade;
            this.creditHours = creditHours;
        }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


    public double calculateGradePoints(){
            return creditHours * GradeType.getGradeByScore(grade).getGpaPoints();
    }





}





























}
