package Q1;

public class InvalidCreditException extends Exception {
    public InvalidCreditException(String message) {
        super(message);
    }
}

class CreditLimitExceededException extends Exception {
    public CreditLimitExceededException(String message) {
        super(message);
    }
}