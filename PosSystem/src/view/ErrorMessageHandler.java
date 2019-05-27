package view;

import controller.OperationFailedException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class ErrorMessageHandler {

    /**
     * Prints error message for user.
     * @param msg
     */
    void showErrorMsg(String msg) {
        StringBuilder errorMsgBuilder = new StringBuilder();
        errorMsgBuilder.append(createTime());
        errorMsgBuilder.append(", ERROR: ");
        errorMsgBuilder.append(msg);
        System.out.println(errorMsgBuilder);
    }

    /**
     * Prints error message to Dev.
     * @param e
     */
    public void logErrorMsg(OperationFailedException e) {
        StringBuilder logMsgBuilder = new StringBuilder();
        logMsgBuilder.append(createTime());
        logMsgBuilder.append(", ERROR: ");
        logMsgBuilder.append(e.getMessage());
        System.out.println(logMsgBuilder);
        e.printStackTrace();
    }

    /**
     * Get and format current time.
     * @return
     */
    private String createTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        return now.format(formatter);
    }
}
