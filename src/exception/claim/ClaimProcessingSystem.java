package exception.claim;

public class ClaimProcessingSystem {
	private int claimAmount;
	private String startDate,endDate;
	public ClaimProcessingSystem(int claimAmount, String startDate, String endDate) {
		
		this.claimAmount = claimAmount;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public void processClaim(int amount,String date) {
		if(amount<0)
			throw new InvalidClaimAmountException("Negative amount ");
		
		if(amount>claimAmount)
			throw new InvalidClaimAmountException("Amount is greater than claim amount");
		if(date.compareTo(startDate)<0 || date.compareTo(endDate)>0)
			throw new FraudulentClaimException("Claim date is outside policy coverage period.");
        System.out.println("Claim of ₹" + amount + " on " + date + " approved ✅");
		
	}
	
}
