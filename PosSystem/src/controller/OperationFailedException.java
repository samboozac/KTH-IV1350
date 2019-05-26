package controller;

public class OperationFailedException extends Exception {
    public OperationFailedException(String errorMsg){
        super(errorMsg);
    }
}
