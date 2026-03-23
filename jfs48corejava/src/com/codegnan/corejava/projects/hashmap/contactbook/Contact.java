package com.codegnan.corejava.projects.hashmap.contactbook;

/**
 * Contact class representing a single contact.
 */
public class Contact {
    
    private String name;
    private String phoneNumber;
    private String email;
    
    /**
     * Constructor to initialize contact.
     */
    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    
    // Getters
    public String getName() {
        return name;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public String getEmail() {
        return email;
    }
    
    // Setters
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * Displays contact information.
     */
    public void displayContact() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("------------------------");
    }
    
    @Override
    public String toString() {
        return "Contact{name='" + name + "', phone='" + phoneNumber + 
               "', email='" + email + "'}";
    }
}

