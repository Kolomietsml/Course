package Controller;

import View.View;

import java.util.Scanner;

public class InputVerificationController {
    private View view;
    private Scanner scanner;

    public InputVerificationController(View view, Scanner scanner) {
        this.view = view;
        this.scanner = scanner;
    }

    public String checkInput (String message, String regex) {
        String res;
        view.printInputMessage(message);
        while ( !(scanner.hasNext() && (res = scanner.next()).matches(regex))){
            view.printErrorMessage(message);
        }
        return res;
    }
}
