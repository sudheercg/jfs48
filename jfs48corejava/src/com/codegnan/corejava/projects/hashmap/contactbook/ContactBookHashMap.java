package com.codegnan.corejava.projects.hashmap.contactbook;

import java.util.HashMap;
import java.util.Scanner;

/**
 * ContactBook using HashMap.
 * Faster lookup by name.
 */
public class ContactBookHashMap {
    
    private HashMap<String, Contact> contacts;
    
    /**
     * Constructor initializes empty HashMap.
     */
    public ContactBookHashMap() {
        contacts = new HashMap<String, Contact>();
    }
    
    /**
     * Adds a new contact.
     */
    public void addContact(Contact contact) {
        String name = contact.getName();
        
        if (contacts.containsKey(name)) {
            System.out.println("⚠ Contact with name '" + name + "' already exists!");
            System.out.print("Do you want to update? (yes/no): ");
        } else {
            contacts.put(name, contact);
            System.out.println("✓ Contact added successfully!");
        }
    }
    
    /**
     * Displays all contacts.
     */
    public void displayAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found!");
        } else {
            System.out.println("\n===== ALL CONTACTS =====");
            int count = 1;
            for (String name : contacts.keySet()) {
                System.out.println("\nContact " + count + ":");
                contacts.get(name).displayContact();
                count++;
            }
        }
    }
    
    /**
     * Searches for contact by name (faster with HashMap).
     */
    public void searchByName(String name) {
        if (contacts.containsKey(name)) {
            System.out.println("\n===== SEARCH RESULT =====");
            contacts.get(name).displayContact();
        } else {
            System.out.println("✗ No contact found with name: " + name);
        }
    }
    
    /**
     * Updates contact information.
     */
    public void updateContact(String name, String newPhone, String newEmail) {
        if (contacts.containsKey(name)) {
            Contact contact = contacts.get(name);
            contact.setPhoneNumber(newPhone);
            contact.setEmail(newEmail);
            System.out.println("✓ Contact updated successfully!");
        } else {
            System.out.println("✗ Contact not found!");
        }
    }
    
    /**
     * Deletes a contact.
     */
    public void deleteContact(String name) {
        if (contacts.containsKey(name)) {
            contacts.remove(name);
            System.out.println("✓ Contact deleted successfully!");
        } else {
            System.out.println("✗ Contact not found!");
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
        ContactBookHashMap contactBook = new ContactBookHashMap();
        
        boolean running = true;
        
        while (running) {
            System.out.println("\n===== CONTACTBOOK V2 (HashMap) =====");
            System.out.println("1. Add Contact");
            System.out.println("2. Display All Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Update Contact");
            System.out.println("5. Delete Contact");
            System.out.println("6. Total Contacts");
            System.out.println("7. Exit");
            System.out.println("====================================");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            if (choice == 1) {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                
                System.out.print("Enter phone: ");
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
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        contactBook.searchByName(name);
                    } else {
                        if (choice == 4) {
                            System.out.print("Enter name: ");
                            String name = scanner.nextLine();
                            
                            System.out.print("Enter new phone: ");
                            String phone = scanner.nextLine();
                            
                            System.out.print("Enter new email: ");
                            String email = scanner.nextLine();
                            
                            contactBook.updateContact(name, phone, email);
                        } else {
                            if (choice == 5) {
                                System.out.print("Enter name to delete: ");
                                String name = scanner.nextLine();
                                contactBook.deleteContact(name);
                            } else {
                                if (choice == 6) {
                                    System.out.println("Total: " + 
                                                     contactBook.getTotalContacts());
                                } else {
                                    if (choice == 7) {
                                        System.out.println("Goodbye!");
                                        running = false;
                                    } else {
                                        System.out.println("Invalid choice!");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
        scanner.close();
    }
}
