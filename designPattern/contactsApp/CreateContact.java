package designPattern.designPattern.contactsApp;

public class CreateContact implements ContactsService{

    public Contact contact;

    public User user;

    CreateContact(Contact contact, User user) {
        this.contact = contact;
        this.user = user;
    }
    @Override
    public void accept(ContactsVisitor contactsVisitor) {
        contactsVisitor.visit(this, this.contact,this.user);
    }
}
