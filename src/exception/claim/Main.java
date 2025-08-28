package exception.claim;

public class Main {
public static void main(String[] args) {
	ClaimProcessingSystem cps=new ClaimProcessingSystem(200000, "2023-01-01", "2025-01-01");
	process(cps, 100000, "2024-01-01");
	process(cps, 1000000, "2024-01-01");
	process(cps, -100000, "2024-01-01");
	process(cps, 100000, "2026-01-01");
}
public static void process(ClaimProcessingSystem cps,int amount,String date) {
	try {
		cps.processClaim(amount, date);
	} catch (InvalidClaimAmountException | FraudulentClaimException e) {
        System.out.println(" Claim rejected: " + e.getMessage());

	}
}
public static void notifyClaimsDept(String reason ,int amount,String date) {
	System.out.println(" Notification sent to Claims Department: " 
            + reason + " | Claim Amount: ₹" + amount + " | Date: " + date);
}
}
