package org.example;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setFirstName("Alice");
        person1.setSecondName("Smith");
        person1.addContact(new Contact("Alice's Contact 1", "alice@email.com", "123-456-7890"));
        person1.addContact(new Contact("Alice's Contact 2", "alice2@email.com", "987-654-3210"));

        Person person2 = new Person();
        person2.setFirstName("Bob");
        person2.setSecondName("Johnson");
        person2.addContact(new Contact("Bob's Contact 1", "bob@email.com", "111-222-3333"));
        person2.addContact(new Contact("Bob's Contact 2", "bob2@email.com", "444-555-6666"));

        Person person3 = new Person();
        person3.setFirstName("Charlie");
        person3.setSecondName("Brown");
        person3.addContact(new Contact("Charlie's Contact 1", "charlie@email.com", "777-888-9999"));
        person3.addContact(new Contact("Charlie's Contact 2", "charlie2@email.com", "000-111-2222"));

        // Ausgabe der Personen und Kontakte auf der Konsole
        System.out.println("Person 1:");
        System.out.println("Name: " + person1.getFirstName() + " " + person1.getSecondName());
        System.out.println("Contacts:");
        for (Contact contact : person1.getContacts()) {
            System.out.println("  " + contact.getName() + ", Email: " + contact.getEmail() + ", Phone: " + contact.getPhoneNumber());
        }

    }
}