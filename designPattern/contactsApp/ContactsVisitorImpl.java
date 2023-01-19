package designPattern.designPattern.contactsApp;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ContactsVisitorImpl implements ContactsVisitor{
    @Override
    public void visit(CreateContact createContact, Contact contact, User user) {
        // save contact to database
        System.out.println("Creating Contacts");
        ArrayList<Contact> contacts = user.getContacts();
        contacts.add(contact);
        user.setContacts(contacts);
        System.out.println("Contact Created");
    }

    @Override
    public void visit(ViewContact viewContact, User user) {
        // fetch the contacts
        System.out.println("View All Contacts");
        if(user.getContacts().isEmpty()){
            System.out.println("No Contacts");
        } else {
            user.getContacts().stream().forEach(contact -> System.out.println(contact.getId() + " " + contact.getName() + " " + contact.getPhone()));
        }
    }

    @Override
    public void visit(DeleteContact deleteContact, int id, User user) {
        // delete the contact with id:id
        System.out.println("Deleting contact with id: " + id);
        ArrayList<Contact> contacts = user.getContacts();
        contacts = (ArrayList<Contact>) contacts.stream().filter(contact-> contact.getId() != id).collect(Collectors.toList());
        user.setContacts(contacts);
        System.out.println("Contact Deleted");
    }
}
