package integration;

public class DatabaseConnectionFailureException extends Exception {
    public DatabaseConnectionFailureException(String errorMsg) {
        super(errorMsg);
    }
}
