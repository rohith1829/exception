package exception.renewal;

public class PolicyRenewal {
    private boolean isExpired;
    private boolean paymentPending;
    private boolean isCompliant;

    public PolicyRenewal(boolean isExpired, boolean paymentPending, boolean isCompliant) {
        this.isExpired = isExpired;
        this.paymentPending = paymentPending;
        this.isCompliant = isCompliant;
    }

    public void renewPolicy() throws PolicyExpiredException, PaymentPendingException, NonComplianceException {
        if (isExpired) {
            throw new PolicyExpiredException("Policy has already expired. Renewal not possible.");
        }
        if (paymentPending) {
            throw new PaymentPendingException("Pending payments must be cleared before renewal.");
        }
        if (!isCompliant) {
            throw new NonComplianceException("Policyholder is not compliant with renewal terms.");
        }

        System.out.println("✅ Policy renewed successfully!");
    }
}

