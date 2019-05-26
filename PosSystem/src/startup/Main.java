package startup;

import controller.Controller;
import view.ErrorMessageHandler;
import view.View;

public class Main {

    /**
     * Main method, execute the program.
     * @param args
     */
    public static void main(String[] args) {
        Controller controller = new Controller();
        ErrorMessageHandler errorMessageHandler = new ErrorMessageHandler();
        View view = new View(controller, errorMessageHandler);
        view.sampleExecution();
    }
}
