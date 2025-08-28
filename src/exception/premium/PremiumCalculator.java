package exception.premium;

public class PremiumCalculator {

    // Method to calculate premium
    public double calculatePremium(String policyType, Integer age, String healthCondition, String vehicleType)
            throws DataNotFoundException {
        
        if (policyType == null) {
            throw new DataNotFoundException("Policy type is missing.");
        }

        switch (policyType.toLowerCase()) {
            case "life":
                if (age == null) {
                    throw new DataNotFoundException("Age data is missing for life insurance.");
                }
                return calculateLifeInsurancePremium(age);

            case "health":
                if (healthCondition == null) {
                    throw new DataNotFoundException("Health condition data is missing for health insurance.");
                }
                return calculateHealthInsurancePremium(healthCondition);

            case "vehicle":
                if (vehicleType == null) {
                    throw new DataNotFoundException("Vehicle type data is missing for vehicle insurance.");
                }
                return calculateVehicleInsurancePremium(vehicleType);

            default:
                throw new DataNotFoundException("Unknown policy type: " + policyType);
        }
    }

    // Life insurance premium calculation
    private double calculateLifeInsurancePremium(int age) {
        try {
            if (age < 0) throw new CalculationException("Invalid age for premium calculation.");
            if (age < 30) return 5000;
            else if (age < 50) return 10000;
            else return 20000;
        } catch (Exception e) {
            throw new CalculationException("Error calculating life insurance premium: " + e.getMessage());
        }
    }

    // Health insurance premium calculation
    private double calculateHealthInsurancePremium(String condition) {
        try {
            if (condition.equalsIgnoreCase("good")) return 8000;
            else if (condition.equalsIgnoreCase("average")) return 12000;
            else if (condition.equalsIgnoreCase("poor")) return 20000;
            else throw new CalculationException("Unknown health condition: " + condition);
        } catch (Exception e) {
            throw new CalculationException("Error calculating health insurance premium: " + e.getMessage());
        }
    }

    // Vehicle insurance premium calculation
    private double calculateVehicleInsurancePremium(String type) {
        try {
            switch (type.toLowerCase()) {
                case "car": return 15000;
                case "bike": return 5000;
                case "truck": return 25000;
                default: throw new CalculationException("Unknown vehicle type: " + type);
            }
        } catch (Exception e) {
            throw new CalculationException("Error calculating vehicle insurance premium: " + e.getMessage());
        }
    }
}
