package designPattern.designPattern.contactsApp;

import java.util.ArrayList;

public class Main {

    public static void main(String ...args){
        User user = new User(101, "James", new ArrayList<>());
        Contact myContact1 = new Contact(1, "Smith", "540-230-897");

        ContactsVisitor contactsVisitor = new ContactsVisitorImpl();

        ContactsService createContact = new CreateContact(myContact1,user);
        ContactsService viewContact = new ViewContact(user);
        ContactsService deleteContact = new DeleteContact(1,user);

        createContact.accept(contactsVisitor);
        viewContact.accept(contactsVisitor);
        deleteContact.accept(contactsVisitor);
        viewContact.accept(contactsVisitor);
    }
}
