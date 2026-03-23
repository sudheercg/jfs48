package com.codegnan.corejava.projects.hashmap.contactbook;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ContactBook using ArrayList.
 * Stores and manages contacts in an ArrayList.
 */
public class ContactBookArrayList {
    
    private ArrayList<Contact> contacts;
    
    /**
     * Constructor initializes empty contact list.
     */
    public ContactBookArrayList() {
        contacts = new ArrayList<Contact>();
    }
    
    /**
     * Adds a new contact to the book.
     */
    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("✓ Contact added successfully!");
    }
    
    /**
     * Displays all contacts.
     */
    public void displayAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found!");
        } else {
            System.out.println("\n===== ALL CONTACTS =====");
            for (int i = 0; i < contacts.size(); i++) {
                System.out.println("\nContact " + (i + 1) + ":");
                contacts.get(i).displayContact();
            }
        }
    }
    
    /**
     * Searches for contact by name.
     */
    public void searchByName(String name) {
        boolean found = false;
        
        System.out.println("\n===== SEARCH RESULTS =====");
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                contact.displayContact();
                found = true;
            } else {
                // continue searching
            }
        }
        
        if (!found) {
            System.out.println("No contact found with name: " + name);
        } else {
            // found and displayed
        }
    }
    
    /**
     * Returns total number of contacts.
     */
    public int getTotalContacts() {
        return contacts.size();
    }
    
    /**
     * Main method to demonstrate ContactBook.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactBookArrayList contactBook = new ContactBookArrayList();
        
        boolean running = true;
        
        while (running) {
            System.out.println("\n===== CONTACTBOOK MENU =====");
            System.out.println("1. Add Contact");
            System.out.println("2. Display All Contacts");
            System.out.println("3. Search Contact by Name");
            System.out.println("4. Total Contacts");
            System.out.println("5. Exit");
            System.out.println("============================");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            if (choice == 1) {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                
                System.out.print("Enter phone number: ");
                String phone = scanner.nextLine();
                
                System.out.print("Enter email: ");
                String email = scanner.nextLine();
                
                Contact contact = new Contact(name, phone, email);
                contactBook.addContact(contact);
                
            } else {
                if (choice == 2) {
                    contactBook.displayAllContacts();
                } else {
                    if (choice == 3) {
                        System.out.print("Enter name to search: ");
                        String name = scanner.nextLine();
                        contactBook.searchByName(name);
                    } else {
                        if (choice == 4) {
                            System.out.println("Total contacts: " + 
                                             contactBook.getTotalContacts());
                        } else {
                            if (choice == 5) {
                                System.out.println("Thank you for using ContactBook!");
                                running = false;
                            } else {
                                System.out.println("Invalid choice!");
                            }
                        }
                    }
                }
            }
        }
        
        scanner.close();
    }
}

