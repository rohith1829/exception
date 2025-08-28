package exception.policy;

public class PolicyApplication {
    private int age;
    private boolean goodDrivingHistory;
    private boolean goodHealth;

    public PolicyApplication(int age, boolean goodDrivingHistory, boolean goodHealth) {
        this.age = age;
        this.goodDrivingHistory = goodDrivingHistory;
        this.goodHealth = goodHealth;
    }

    // Validation methods
    public void validateAge() throws InvalidAgeException {
        if (age < 18 || age > 70) {
            throw new InvalidAgeException("Age " + age + " is not eligible for insurance.");
        }
    }

    public void validateDrivingHistory() throws PoorDrivingRecordException {
        if (!goodDrivingHistory) {
            throw new PoorDrivingRecordException("Applicant has a poor driving record.");
        }
    }

    public void validateHealth() throws HealthIssueException {
        if (!goodHealth) {
            throw new HealthIssueException("Applicant has health issues.");
        }
    }

    // Main validation process
    public void processApplication() throws InvalidAgeException, PoorDrivingRecordException, HealthIssueException {
        validateAge();
        validateDrivingHistory();
        validateHealth();
        System.out.println("Application Approved ✅");
    }
}
