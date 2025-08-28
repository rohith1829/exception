package exception.premium;

public class Main {
    public static void main(String[] args) {
        PremiumCalculator calculator = new PremiumCalculator();

        // Test cases
        testPremium(calculator, "life", 25, null, null);      // Life insurance
        testPremium(calculator, "health", null, "poor", null); // Health insurance
        testPremium(calculator, "vehicle", null, null, "car"); // Vehicle insurance
        testPremium(calculator, "vehicle", null, null, null);  // Missing data
        testPremium(calculator, "life", -5, null, null);       // Invalid calculation
    }

    private static void testPremium(PremiumCalculator calculator, String policyType, Integer age,
                                    String healthCondition, String vehicleType) {
        try {
            double premium = calculator.calculatePremium(policyType, age, healthCondition, vehicleType);
            System.out.println("✅ Premium for " + policyType + " policy: ₹" + premium);
        } catch (DataNotFoundException e) {
            System.out.println("❌ Data Error: " + e.getMessage());
            e.printStackTrace();
        } catch (CalculationException e) {
            System.out.println("❌ Calculation Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
