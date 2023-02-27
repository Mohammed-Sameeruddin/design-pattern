package designPattern.designPattern.contactsApp;

public class ViewContact implements ContactsService{

    public User user;

    ViewContact(User user) {
        this.user = user;
    }
    @Override
    public void accept(ContactsVisitor contactsVisitor) {
        contactsVisitor.visit(this, user);
    }
}
