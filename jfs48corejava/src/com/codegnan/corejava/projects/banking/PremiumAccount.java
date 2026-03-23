package com.codegnan.corejava.projects.banking;
public class PremiumAccount extends Account implements Transferable, Billable {
    private double interestRate;
    private int transferCount;
    private double totalBillsPaid;
    
    // Constructor
    public PremiumAccount(String accountNumber, String accountHolderName,
                         double initialBalance, double interestRate) {
        super(accountNumber, accountHolderName, initialBalance, "Premium Account");
        this.interestRate = interestRate;
        this.transferCount = 0;
        this.totalBillsPaid = 0.0;
    }
    
    // Override abstract methods
    @Override
    public double calculateInterest() {
        return getBalance() * (interestRate / 100);
    }
    
    @Override
    public double getMinimumBalance() {
        return 10000.0; // High minimum balance
    }
    
    // Premium-specific method
    public void addInterest() {
        double interest = calculateInterest();
        setBalance(getBalance() + interest);
        System.out.println("Premium Interest Added: $" + interest);
        System.out.println("New Balance: $" + getBalance());
    }
    
    // Implement Transferable interface
    @Override
    public boolean transferTo(Account destination, double amount) {
        if (amount <= 0) {
            System.out.println("Invalid transfer amount!");
            return false;
        } else {
            if (amount > 100000) {
                System.out.println("Transfer limit exceeded! Max $100,000");
                return false;
            } else {
                if (withdraw(amount)) {
                    destination.deposit(amount);
                    transferCount = transferCount + 1;
                    System.out.println("Premium Transfer successful!");
                    return true;
                } else {
                    return false;
                }
            }
        }
    }
    
    @Override
    public String getTransferLimit() {
        return "$100,000 per transaction (Premium)";
    }
    
    @Override
    public int getTransferCount() {
        return transferCount;
    }
    
    // Implement Billable interface
    @Override
    public boolean payBill(String billType, double amount) {
        // Premium account supports all bill types
        if (amount <= 0) {
            System.out.println("Invalid bill amount!");
            return false;
        } else {
            if (withdraw(amount)) {
                totalBillsPaid = totalBillsPaid + amount;
                System.out.println("Premium Bill Payment successful!");
                System.out.println("Bill Type: " + billType);
                return true;
            } else {
                return false;
            }
        }
    }
    
    @Override
    public String[] getSupportedBills() {
        return new String[]{"All Bills Supported"};
    }
    
    @Override
    public double getTotalBillsPaid() {
        return totalBillsPaid;
    }
    
    // Override displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Transfer Count: " + transferCount);
        System.out.println("Total Bills Paid: $" + totalBillsPaid);
    }
}