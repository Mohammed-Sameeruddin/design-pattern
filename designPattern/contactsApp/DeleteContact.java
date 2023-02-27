package designPattern.designPattern.contactsApp;

public class DeleteContact implements ContactsService{

    public int id;
    public User user;
    DeleteContact(int id, User user){
        this.id = id;
        this.user = user;
    }
    @Override
    public void accept(ContactsVisitor contactsVisitor) {
        contactsVisitor.visit(this,id,user);
    }
}
