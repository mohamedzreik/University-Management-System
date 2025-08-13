package enums;

public enum StudentStatus {
    ACTIVE("Currently enrolled"),
    INACTIVE("Not currently enrolled"),
    SUSPENDED("Temporarily suspended"),
    GRADUATED("Successfully completed studies");

    private final String description;

    StudentStatus(String description) {
        this.description = description;

    }

    public String getDescription() {
        return description;
    }

    public static StudentStatus findByDescription(String description) {
        for (StudentStatus status : values()) {
            if (status.getDescription().equals(description)) {
                return status;
            }
        }
        return null;
    }

    public boolean isEligibleForEnrollment() {
        return this == INACTIVE;
    }
}