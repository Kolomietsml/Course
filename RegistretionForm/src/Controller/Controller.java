package Controller;

import Model.Model;
import View.View;

import java.util.Scanner;

/**
 The class in which data entry is controlled
 */

public class Controller {
    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void startRegistration() {
        Scanner scanner = new Scanner(System.in);
        InputToContact inputToContact = new InputToContact(view, scanner);
        inputToContact.inputContact();
    }

}
