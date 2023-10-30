
import java.util.ArrayList;


public class Person {
    private String firstName;
    private String secondName;
    private ArrayList<Contact> contacts;

    public Person() {
        this.contacts = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void addContact(Contact contact){
        contacts.add(contact);
    }

    public ArrayList<Contact> getContacts(){
        return contacts;
    }
}
