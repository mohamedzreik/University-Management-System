package interfaces;

import enums.StudentStatus;

public interface enrollable {

    boolean canEnroll();
    void enroll();
    void withdraw();
    StudentStatus getEnrollmentStatus();


}
