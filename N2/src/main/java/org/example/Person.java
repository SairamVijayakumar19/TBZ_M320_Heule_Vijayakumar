package org.example;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Person {
    private String firstName;
    private String secondName;
    private ArrayList<Contact> contacts;

    public void addContact(Contact contact){
        contacts.add(contact);
    }

    public ArrayList<Contact> getContacts(){
        return contacts;
    }
}
