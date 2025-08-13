package managers;

import Generics.Container;
import entities.Course;
import enums.CourseLevel;
import interfaces.manageable;

public class CourseManager implements manageable<Course> {
    private Container<Course> courses;

    public CourseManager() {
        this.courses = new Container<>();
    }

    @Override
    public void add(Course item) {
        courses.add(item);
    }

    @Override
    public boolean remove(Course item) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).equals(item)) {
                courses.remove(item);
                return true;
            }
        }
        return false;
    }

    @Override
    public Course findById(String id) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseId().equals(id)) {
                return courses.get(i);
            }
        }
        return null;
    }

    @Override
    public int getCount() {
        return courses.size();
    }

    @Override
    public void displayAll() {
        for (int i = 0; i < courses.size(); i++) {
            courses.get(i).printDetails();
        }
    }

    public Container<Course> findByLevel(CourseLevel level) {
        Container<Course> result = new Container<>();
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getLevel() == level) {
                result.add(courses.get(i));
            }
        }
        return result;
    }

    public Container<Course> findByProfessor(String professorId) {
        Container<Course> result = new Container<>();
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getProfessorId().equals(professorId)) {
                result.add(courses.get(i));
            }
        }
        return result;
    }

    public Container<Course> getAvailableCourses() {
        Container<Course> result = new Container<>();
        for (int i = 0; i < courses.size(); i++) {
            if (!courses.get(i).isFull()) {
                result.add(courses.get(i));
            }
        }
        return result;
    }
}