package Controller;

import Model.Contact;
import View.*;

import java.util.Scanner;

public class InputToContact {
    private View view;
    private Scanner scanner;
    private Contact contact;

    public InputToContact(View view, Scanner scanner) {
        this.view = view;
        this.scanner = scanner;
        this.contact = new Contact();
    }

    public void inputContact (){
        InputVerificationController inputVerificationController = new InputVerificationController(view,scanner);
        String regexSurname, regexNickName;
        if (View.BUNDLE.getLocale().equals("ua")) {
            regexSurname = RegexContainer.REGEX_UA_SURNAME;
            regexNickName = RegexContainer.REGEX_UA_NICKNAME;
        } else {
            regexSurname = RegexContainer.REGEX_EN_SURNAME;
            regexNickName = RegexContainer.REGEX_EN_NICKNAME;
        }
        contact.setSurname(inputVerificationController.checkInput(TextConstant.ENTER_SURNAME, regexSurname));
        contact.setNickname(inputVerificationController.checkInput(TextConstant.ENTER_NICKNAME, regexNickName));
        contact.setEmail(inputVerificationController.checkInput(TextConstant.ENTER_EMAIL, RegexContainer.REGEX_EMAIL));
        view.printMessage(contact.toString());
    }


}
