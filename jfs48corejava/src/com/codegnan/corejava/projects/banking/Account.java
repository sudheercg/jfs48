package com.codegnan.corejava.projects.banking;
/**
 * Abstract Account class.
 */
public abstract class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;
    
    // Constructor
    public Account(String accountNumber, String accountHolderName, 
                  double initialBalance, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        this.accountType = accountType;
    }
    
    // Abstract method - calculate interest
    public abstract double calculateInterest();
    
    // Abstract method - get minimum balance
    public abstract double getMinimumBalance();
    
    // Concrete method - deposit
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount! Deposit failed.");
        } else {
            balance = balance + amount;
            System.out.println("Deposited: $" + amount);
            System.out.println("New Balance: $" + balance);
        }
    }
    
    // Concrete method - withdraw with validation
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount!");
            return false;
        } else {
            double minBalance = getMinimumBalance();
            double balanceAfterWithdrawal = balance - amount;
            
            if (amount > balance) {
                System.out.println("Insufficient balance!");
                System.out.println("Available: $" + balance);
                return false;
            } else {
                if (balanceAfterWithdrawal < minBalance) {
                    System.out.println("Cannot withdraw! Minimum balance requirement.");
                    System.out.println("Required: $" + minBalance);
                    System.out.println("Balance after withdrawal: $" + balanceAfterWithdrawal);
                    return false;
                } else {
                    balance = balanceAfterWithdrawal;
                    System.out.println("Withdrawn: $" + amount);
                    System.out.println("New Balance: $" + balance);
                    return true;
                }
            }
        }
    }
    
    // Concrete method - display info
    public void displayInfo() {
        System.out.println("=== Account Information ===");
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
        System.out.println("Minimum Balance: $" + getMinimumBalance());
    }
    
    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public String getAccountHolderName() {
        return accountHolderName;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public String getAccountType() {
        return accountType;
    }
    
    // Protected setter (for child classes)
    protected void setBalance(double balance) {
        this.balance = balance;
    }
}