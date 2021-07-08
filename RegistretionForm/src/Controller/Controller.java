package Controller;

import Model.Entity.Contact;
import Model.Entity.NotUniqueNicknameException;
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
        Contact contact = getContact(inputToContact);
        System.out.println(contact);

    }

    public Contact getContact (InputToContact inputToContact){
        Contact contact = null;
        while (true) {
            try {
                contact = new Contact(inputToContact.getContact().getSurname(),
                        inputToContact.getContact().getNickname(),
                        inputToContact.getContact().getEmail());
                model.addToContacts(contact);
                break;
            } catch (NotUniqueNicknameException ex) {
                ex.printStackTrace();
                System.out.println("Not unique nickname " + contact.getNickname());
                inputToContact.inputContact();
            }
        }
        return contact;
    }

}
