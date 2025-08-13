package utils;

public class SystemConfig {

    // Private fields
    private String universityName;
    private String academicYear;
    private int maxStudentsPerCourse;
    private double minimumGpaForGraduation;


    private SystemConfig() {
        loadDefaultConfig();
    }


    private static class ConfigHolder {
        private static final SystemConfig INSTANCE = new SystemConfig();
    }
    public static SystemConfig getInstance() {
        return ConfigHolder.INSTANCE;
    }

    private void loadDefaultConfig() {
        this.universityName = "Tech University";
        this.academicYear = "2024-2025";
        this.maxStudentsPerCourse = 30;
        this.minimumGpaForGraduation = 2.0;
    }

    public boolean validateConfig() {
        return universityName != null && !universityName.trim().isEmpty() &&
                academicYear != null && !academicYear.trim().isEmpty() &&
                maxStudentsPerCourse > 0 && maxStudentsPerCourse <= 100 &&
                minimumGpaForGraduation >= 0.0 && minimumGpaForGraduation <= 4.0;
    }
    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public int getMaxStudentsPerCourse() {
        return maxStudentsPerCourse;
    }

    public void setMaxStudentsPerCourse(int maxStudentsPerCourse) {
        this.maxStudentsPerCourse = maxStudentsPerCourse;
    }

    public double getMinimumGpaForGraduation() {
        return minimumGpaForGraduation;
    }

    public void setMinimumGpaForGraduation(double minimumGpaForGraduation) {
        this.minimumGpaForGraduation = minimumGpaForGraduation;
    }
}
