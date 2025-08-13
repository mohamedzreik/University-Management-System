package utils;

public final class IDGenerator {

    // Private static fields
    private static int studentIdCounter = 1000;
    private static int professorIdCounter = 2000;
    private static int courseIdCounter = 3000;

    // Private constructor to prevent instantiation
    private IDGenerator() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }

    // Generate student ID
    public static String generateStudentId() {
        return "STU" + (++studentIdCounter);
    }

    // Generate professor ID
    public static String generateProfessorId() {
        return "PROF" + (++professorIdCounter);
    }

    // Generate course ID
    public static String generateCourseId() {
        return "CRS" + (++courseIdCounter);
    }

    // Reset all counters (useful for testing)
    public static void resetCounters() {
        studentIdCounter = 1000;
        professorIdCounter = 2000;
        courseIdCounter = 3000;
    }

    // Get current counter values (for testing/debugging)
    public static int getCurrentStudentCounter() {
        return studentIdCounter;
    }

    public static int getCurrentProfessorCounter() {
        return professorIdCounter;
    }

    public static int getCurrentCourseCounter() {
        return courseIdCounter;
    }
}
