package exception.policy;

public class Main {
    public static void main(String[] args) {
        // Sample test cases
        PolicyApplication app1 = new PolicyApplication(25, true, true);
        PolicyApplication app2 = new PolicyApplication(16, true, true);  // Invalid age
        PolicyApplication app3 = new PolicyApplication(30, false, true); // Poor driving history
        PolicyApplication app4 = new PolicyApplication(40, true, false); // Health issue

        process(app1);
        process(app2);
        process(app3);
        process(app4);
    }

    // Method to process applications and handle exceptions
    public static void process(PolicyApplication app) {
        try {
            app.processApplication();
        } catch (InvalidAgeException | PoorDrivingRecordException | HealthIssueException e) {
            System.out.println("Application Rejected ❌ Reason: " + e.getMessage());
            // Log the error (for simplicity, printing stack trace here)
            e.printStackTrace();
        }
    }
}
