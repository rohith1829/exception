package exception.premium;

public class CalculationException extends RuntimeException {
    public CalculationException(String message) {
        super(message);
    }
}