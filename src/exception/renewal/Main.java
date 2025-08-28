package exception.renewal;


public class Main {
    public static void main(String[] args) {
        // Test Case 1: Expired policy
        PolicyRenewal policy1 = new PolicyRenewal(true, false, true);
        processRenewal(policy1);

        // Test Case 2: Payment pending
        PolicyRenewal policy2 = new PolicyRenewal(false, true, true);
        processRenewal(policy2);

        // Test Case 3: Non-compliance
        PolicyRenewal policy3 = new PolicyRenewal(false, false, false);
        processRenewal(policy3);

        // Test Case 4: Successful renewal
        PolicyRenewal policy4 = new PolicyRenewal(false, false, true);
        processRenewal(policy4);
    }

    private static void processRenewal(PolicyRenewal policy) {
        try {
            policy.renewPolicy();
        } catch (PolicyExpiredException | PaymentPendingException | NonComplianceException e) {
            System.out.println("❌ Renewal Failed: " + e.getMessage());
            e.printStackTrace(); // For logging/debugging
        }
    }
}
