

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setFirstName("Alice");
        person1.setSecondName("Smith");
        person1.addContact(new Contact("Peter", "peter@email.com", "123"));
        person1.addContact(new Contact("Max", "max@email.com", "123"));

        Person person2 = new Person();
        person2.setFirstName("Bob");
        person2.setSecondName("Johnson");
        person2.addContact(new Contact("Bob", "bob@email.com", "123"));
        person2.addContact(new Contact("Renate", "renate@email.com", "123"));

        Person person3 = new Person();
        person3.setFirstName("James");
        person3.setSecondName("Brown");
        person3.addContact(new Contact("Dominic", "dominic@email.com", "123"));
        person3.addContact(new Contact("Sairam", "charlie2@email.com", "123"));
        
        System.out.println("Person 1:");
        System.out.println("Name: " + person1.getFirstName() + " " + person1.getSecondName());
        System.out.println("Contacts:");
        for (Contact contact : person1.getContacts()) {
            System.out.println("  " + contact.getName() + ", Email: " + contact.getEmail() + ", Phone: " + contact.getPhoneNumber());
        }

        System.out.println("----------------------------------------------------");

        System.out.println("Person 2:");
        System.out.println("Name: " + person2.getFirstName() + " " + person2.getSecondName());
        System.out.println("Contacts:");
        for (Contact contact : person2.getContacts()) {
            System.out.println("  " + contact.getName() + ", Email: " + contact.getEmail() + ", Phone: " + contact.getPhoneNumber());
        }
        System.out.println("----------------------------------------------------");

        System.out.println("Person 3:");
        System.out.println("Name: " + person3.getFirstName() + " " + person3.getSecondName());
        System.out.println("Contacts:");
        for (Contact contact : person3.getContacts()) {
            System.out.println("  " + contact.getName() + ", Email: " + contact.getEmail() + ", Phone: " + contact.getPhoneNumber());
        }

    }
}