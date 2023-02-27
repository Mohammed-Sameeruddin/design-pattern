package designPattern.designPattern.contactsApp;

import java.util.ArrayList;

public class User {

    public int id;
    public String name;
    public ArrayList<Contact> contacts = new ArrayList<>();

    User(int id, String name, ArrayList<Contact> contacts){
        this.id = id;
        this.name = name;
        this.contacts = contacts;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }


}
