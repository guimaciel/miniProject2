package labs.miniProject2;

import java.util.ArrayList;

public class ContactList {
    private ArrayList<Contact> contactList;

    public ContactList() {
        this.contactList = populateList();
    }

    public ArrayList<Contact> populateList() {
        ArrayList<Contact> populated = new ArrayList<Contact>();
        Contact c;

        c = new Contact("Cathy Rosemary","1234567890");
        populated.add(c);

        c = new Contact("Scott Calixta","1234567891");
        populated.add(c);

        c = new Contact("Sigmund Crofton","1234567892");
        populated.add(c);

        c = new Contact("Philip Edna","1234567893");
        populated.add(c);

        c = new Contact("Guilherme Almeida","0987654321");
        populated.add(c);


        return populated;
    }

    public void add(Contact c) {
        this.contactList.add(c);
    }

    public void printList() {
        for ( int i = 0 ; i < this.contactList.size() ; i++ ) {
            System.out.println(i + ": " + this.contactList.get(i));
        }
    }

    public Contact contactByIndex(int index) {
        if (index > this.contactList.size()) {
            return null;
        }
        Contact c = this.contactList.get(index);

        return c;
    }

    public int findContactByName(String name) {
        for (int i = 0 ; i<contactList.size() ; i++) {
            if (contactList.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public int findContactByMobile(String mobile) {
        for (int i = 0 ; i<contactList.size() ; i++) {
            if (contactList.get(i).getMobile().equals(mobile)) {
                return i;
            }
        }
        return -1;
    }

    public void removeContact(int index) {
        contactList.remove(index);
    }
}
