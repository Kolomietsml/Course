import java.util.Scanner;
import java.util.regex.Matcher;

/**
 The class in which data entry is controlled
 */

public class Controller {
    private View view;
    private Model model;
    private Scanner scanner;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
        scanner = new Scanner(System.in);
    }

    public void start() {
        PhoneBook phoneBook = new PhoneBook();
        String exit = "";
        while (!exit.equals("e")) {
            Contact contact = new Contact();
            addSurname(contact);
            addNickname(contact);
            addEmail(contact);
            view.printMessage(View.EXIT);
            exit = scanner.next();
        }
        view.printMessage(View.ALL_CONTACTS + " " + phoneBook.toString());
    }

    public void addSurname(Contact contact) {
        view.printMessage(View.ENTER_SURNAME);
        String surname = scanner.next();
        Matcher m = MyPattern.SURNAME_PATTERN.matcher(surname);
        if (m.matches() == false) {
            view.printMessage(View.ERROR);
            addSurname(contact);
        } else {
            contact.setSurname(surname);
        }
    }

    public void addNickname(Contact contact) {
        view.printMessage(View.ENTER_NICKNAME);
        String nickname = scanner.next();
        Matcher m = MyPattern.NICKNAME_PATTERN.matcher(nickname);
        if (m.matches() == false){
            view.printMessage(View.ERROR);
            addNickname(contact);
        } else {
            contact.setNickname(nickname);
        }
    }

    public void addEmail(Contact contact) {
        view.printMessage(View.ENTER_EMAIL);
        String email = scanner.next();
        Matcher m = MyPattern.EMAIL_PATTERN.matcher(email);
        if (m.matches() == false){
            view.printMessage(View.ERROR);
            addEmail(contact);
        } else {
            contact.setEmail(email);
        }
    }
}
