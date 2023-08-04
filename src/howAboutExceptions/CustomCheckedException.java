package howAboutExceptions;

public class CustomCheckedException extends Exception {

    private int errorCode;

    public CustomCheckedException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
