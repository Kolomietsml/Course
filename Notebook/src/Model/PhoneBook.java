package Model;

import Model.Contact;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List <Contact> contacts;

    public PhoneBook() {
        this.contacts = new ArrayList<>();
    }

    public boolean add(Contact contact){
        return contacts.add(contact);
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Model.PhoneBook{" +
                "contacts=" + contacts +
                '}';
    }
}
