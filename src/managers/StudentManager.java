package managers;
import Generics.Container;
import entities.Student;
import enums.StudentStatus;
import interfaces.manageable;


public class StudentManager implements manageable<Student> {
    private Container<Student> students;

    public StudentManager() {
        this.students = new Container<>();
    }

    @Override
    public void add(Student item) {
        students.add(item);
    }

    @Override
    public boolean remove(Student item) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).equals(item)) {
                students.remove(item);
                return true;
            }
        }
        return false;
    }

    @Override
    public Student findById(String id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentid().equals(id)) {
                return students.get(i);
            }
        }
        return null;
    }

    @Override
    public int getCount() {
        return students.size();
    }

    @Override
    public void displayAll() {
        for (int i = 0; i < students.size(); i++) {
            students.get(i).printdetails();
        }
    }

    public Container<Student> findByMajor(String major) {
        Container<Student> result = new Container<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getMajor().equals(major)) {
                result.add(students.get(i));
            }
        }
        return result;
    }

    public Container<Student> findByStatus(StudentStatus status) {
        Container<Student> result = new Container<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getEnrollmentStatus() == status) {
                result.add(students.get(i));
            }
        }
        return result;
    }

    public double calculateAverageGPA() {
        if (students.size() == 0) return 0.0;
        double totalGPA = 0.0;
        for (int i = 0; i < students.size(); i++) {
            totalGPA += students.get(i).getGpa();
        }
        return totalGPA / students.size();
    }

    public Container<Student> getStudentsEligibleForGraduation() {
        Container<Student> result = new Container<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).canGraduate()) {
                result.add(students.get(i));
            }
        }
        return result;
    }
}