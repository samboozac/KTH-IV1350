package controller;

/**
 * A general exception to thrown when any operation fails. Standard process.
 */
public class OperationFailedException extends Exception {

    /**
     * Error if an operation fails.
     * @param errorMsg
     */
    public OperationFailedException(String errorMsg){
        super(errorMsg);
    }
}
