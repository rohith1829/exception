package exception.renewal;

public class PolicyExpiredException extends Exception {
    public PolicyExpiredException(String message) {
        super(message);
    }
}