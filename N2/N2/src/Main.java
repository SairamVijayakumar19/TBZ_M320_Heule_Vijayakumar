import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Contacts> contactsList1 = new ArrayList<>();
        contactsList1.add(new Contacts("Sairam Vijayakumar", "sairam@example.com", 97086656));
        contactsList1.add(new Contacts("Loris", "Loris.@example.com", 12345678));
        Person person1 = new Person("Sairam", "Vijayakumar", contactsList1);

        List<Contacts> contactsList2 = new ArrayList<>();
        contactsList2.add(new Contacts("Loris Di Leo", "loris@example.com", 987654321));
        contactsList2.add(new Contacts("Dominic", "dominic@example.com", 87654321));
        Person person2 = new Person("Loris", "Di Leo", contactsList2);

        List<Contacts> contactsList3 = new ArrayList<>();
        contactsList3.add(new Contacts("Dominic Heule", "Dominic@example.com", 867564456));
        contactsList3.add(new Contacts("Sairam", "sairam@example.com", 76543456));
        Person person3 = new Person("Dominic", "Heule", contactsList3);

        displayPerson(person1);
        displayPerson(person2);
        displayPerson(person3);
    }

    public static void displayPerson(Person person) {
        System.out.println("Name: " + person.getFirstName() + " " + person.getSecondName());
        System.out.println("Contacts:");
        for (Contacts contact : person.getContacts()) {
            System.out.println("Email: " + contact.getEmail());
            System.out.println("Telefonnummer: " + contact.getPhoneNumber());
        }
        System.out.println();
    }
}