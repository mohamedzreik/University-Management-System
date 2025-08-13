package enums;

public enum GradeType {
    A_PLUS(97, 100, 4.0F),
    A(93, 96, 4.0F),
    A_MINUS(90, 92, 3.7F),
    B_PLUS(87, 89, 3.3F),
    B(83, 86, 3.0F),
    B_MINUS(80, 82, 2.7F),
    C_PLUS(77, 79, 2.3F),
    C(73, 76, 2.0F),
    C_MINUS(70, 72, 1.7F),
    D(60, 69, 1.0F),
    F(0, 59, 0.0F);
    int minScore , maxScore ;
    float gpaPoints;

    GradeType(int minScore, int maxScore, float gpaPoints) {
        this.minScore = minScore;
        this.maxScore = maxScore;
        this.gpaPoints = gpaPoints;
    }

    public int getMinScore() {
        return minScore;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public float getGpaPoints() {
        return gpaPoints;
    }
public static GradeType getGradeByScore(int score){
    for(GradeType grade : values()){
        if(score >= grade.getMinScore() && score <= grade.getMaxScore())
            return grade;
    }
    return null;
}
   public String getLetterGrade(){
        switch (this){
            case A_PLUS: return "A+";
            case A: return "A";
            case A_MINUS: return "A-";
            case B_PLUS: return "B+";
            case B: return "B";
            case B_MINUS: return "B-";
            case C_PLUS: return "C+";
            case C: return "C";
            case C_MINUS: return "C-";
        }
       return "";
   }
}