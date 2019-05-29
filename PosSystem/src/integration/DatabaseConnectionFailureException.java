package integration;

/**
 * Exception to be thrown when the 'database' is not accessible. Standard process.
 */
public class DatabaseConnectionFailureException extends Exception {

    /**
     * Error if connection to DB failed.
     * @param errorMsg
     */
    public DatabaseConnectionFailureException(String errorMsg) {
        super(errorMsg);
    }
}
