package Model;

import Model.Entity.Contact;
import Model.Entity.NotUniqueNicknameException;
import Model.Entity.VirtualDB;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private Contact contact;
    private List<Contact> contacts;

    public Model() {
        contacts = new ArrayList<>();
        contacts.add(VirtualDB.FIRST_CONTACT.getContact());
        contacts.add(VirtualDB.SECOND_CONTACT.getContact());
        contacts.add(VirtualDB.THIRD_CONTACT.getContact());
    }

    public boolean addToContacts(Contact contact) throws NotUniqueNicknameException {
        for (Contact c : contacts){
            if (contact.getNickname().equals(c.getNickname())){
                throw new NotUniqueNicknameException("NotUniqueNicknameException", contact.getNickname());
            }
        }
        return contacts.add(contact);
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}
