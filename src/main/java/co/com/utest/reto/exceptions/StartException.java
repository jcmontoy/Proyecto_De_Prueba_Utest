package co.com.utest.reto.exceptions;

public class StartException extends AssertionError {

    private static final long serialVersionUID = 1l;
    public static final String MESSAGE_PAGE_NOT_LOAD = "The page could not loaded";

    public StartException(String message, Throwable cause) {
        super(message, cause);
    }
}
