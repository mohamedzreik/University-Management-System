package enums;

public enum CourseLevel {
    BEGINNER(1, 100, 199),
    INTERMEDIATE(2, 200, 299),
    ADVANCED(3, 300, 399),
    GRADUATE(4, 400, 499);
    int Level , minCoursenum , maxCourseNum;
    CourseLevel(int level, int minCourseNumber, int maxCourseNumber){
        this.Level = level;
        this.minCoursenum = minCourseNumber;
        this.maxCourseNum = maxCourseNumber;
    }

    public int getLevel() {
        return Level;
    }

    public int getMinCoursenum() {
        return minCoursenum;
    }

    public int getMaxCourseNum() {
        return maxCourseNum;
    }

    public static CourseLevel getCourseLevelByNumber(int courseNumber) {
        for (CourseLevel level : values()) {
            if (level.getMinCoursenum() <= courseNumber && level.getMaxCourseNum() >= courseNumber) {
                return level;
            }
        }
        return null;
    }

    public boolean isValidCourseNumber(int number) {
        for (CourseLevel level : values()) {
            if (level.getMinCoursenum() <= number && level.getMaxCourseNum() >= number) {
                return true;
            }
        }
        return false;
    }
    }




