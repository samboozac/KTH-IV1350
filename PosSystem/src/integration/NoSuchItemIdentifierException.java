package integration;

public class NoSuchItemIdentifierException extends Exception{
    public NoSuchItemIdentifierException(String errorMsg){
        super(errorMsg);
    }
}
