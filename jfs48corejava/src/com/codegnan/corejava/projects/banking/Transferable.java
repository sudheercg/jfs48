package com.codegnan.corejava.projects.banking;
/*Exercise 6: Banking System with Abstract + Interface (35 minutes)
Objective: Create complete banking system using abstract classes and interfaces.
Requirements:
●	Abstract Account class
●	Transferable and Billable interfaces
●	Multiple account types with different capabilities
●	Nested if-else for validation
●	Demonstrate loose coupling
Solution:
Transferable.java (Interface)*/
/**
 * Transferable interface - accounts that can transfer money.
 */
public interface Transferable {
    boolean transferTo(Account destination, double amount);
    String getTransferLimit();
    int getTransferCount();
}

