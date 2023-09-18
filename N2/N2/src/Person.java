import java.util.List;

public class Person {
    private String firstName;
    private String secondName;
    private List<Contacts> contacts;

    public Person(String firstName, String secondName, List<Contacts> contacts) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.contacts = contacts;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public List<Contacts> getContacts() {
        return contacts;
    }

    public void addContact(Contacts contact) {
        contacts.add(contact);
    }
}
