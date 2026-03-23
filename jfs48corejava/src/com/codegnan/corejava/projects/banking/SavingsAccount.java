package com.codegnan.corejava.projects.banking;
/**
 * Savings Account - basic account with interest.
 * No transfer or bill payment.
 */
public class SavingsAccount extends Account {
    private double interestRate;
    private double minimumBalance;
    
    // Constructor
    public SavingsAccount(String accountNumber, String accountHolderName,
                         double initialBalance, double interestRate, 
                         double minimumBalance) {
        super(accountNumber, accountHolderName, initialBalance, "Savings Account");
        this.interestRate = interestRate;
        this.minimumBalance = minimumBalance;
    }
    
    // Override abstract methods
    @Override
    public double calculateInterest() {
        return getBalance() * (interestRate / 100);
    }
    
    @Override
    public double getMinimumBalance() {
        return minimumBalance;
    }
    
    // Savings-specific method
    public void addInterest() {
        double interest = calculateInterest();
        setBalance(getBalance() + interest);
        System.out.println("Interest Added: $" + interest);
        System.out.println("New Balance: $" + getBalance());
    }
    
    // Override displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}