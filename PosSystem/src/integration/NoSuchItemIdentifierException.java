package integration;

/**
 * Exception to be thrown when an itemID is not found in the catalog. Standard process.
 */
public class NoSuchItemIdentifierException extends Exception{

    /**
     * Error if an itemID was not found.
     * @param errorMsg
     */
    public NoSuchItemIdentifierException(String errorMsg){
        super(errorMsg);
    }
}
