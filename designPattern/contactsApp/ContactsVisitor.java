package designPattern.designPattern.contactsApp;

public interface ContactsVisitor {
    public void visit(CreateContact createContact, Contact contact, User user);
    public void visit(ViewContact viewContact, User user);

    public void visit(DeleteContact deleteContact,int id, User user);
}
