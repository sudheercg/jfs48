package com.codegnan.corejava.projects.banking;
/**
 * Current Account - supports transfer and bill payment.
 */
public class CurrentAccount extends Account implements Transferable, Billable {
    private int transferCount;
    private double totalBillsPaid;
    
    // Constructor
    public CurrentAccount(String accountNumber, String accountHolderName,
                         double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance, "Current Account");
        this.transferCount = 0;
        this.totalBillsPaid = 0.0;
    }
    
    // Override abstract methods
    @Override
    public double calculateInterest() {
        return 0.0; // Current accounts don't earn interest
    }
    
    @Override
    public double getMinimumBalance() {
        return 500.0; // Minimum balance for current account
    }
    
    // Implement Transferable interface
    @Override
    public boolean transferTo(Account destination, double amount) {
        if (amount <= 0) {
            System.out.println("Invalid transfer amount!");
            return false;
        } else {
            if (amount > 50000) {
                System.out.println("Transfer limit exceeded! Max $50,000 per transaction");
                return false;
            } else {
                // Try to withdraw from this account
                if (withdraw(amount)) {
                    // Deposit to destination
                    destination.deposit(amount);
                    transferCount = transferCount + 1;
                    System.out.println("Transfer successful!");
                    System.out.println("To: " + destination.getAccountNumber());
                    return true;
                } else {
                    System.out.println("Transfer failed!");
                    return false;
                }
            }
        }
    }
    
    @Override
    public String getTransferLimit() {
        return "$50,000 per transaction";
    }
    
    @Override
    public int getTransferCount() {
        return transferCount;
    }
    
    // Implement Billable interface
    @Override
    public boolean payBill(String billType, double amount) {
        // Check if bill type is supported
        String[] supported = getSupportedBills();
        boolean isSupported = false;
        
        for (int i = 0; i < supported.length; i++) {
            if (supported[i].equals(billType)) {
                isSupported = true;
                break;
            } else {
                // continue checking
            }
        }
        
        if (!isSupported) {
            System.out.println("Bill type not supported: " + billType);
            return false;
        } else {
            if (amount <= 0) {
                System.out.println("Invalid bill amount!");
                return false;
            } else {
                // Try to withdraw amount
                if (withdraw(amount)) {
                    totalBillsPaid = totalBillsPaid + amount;
                    System.out.println("Bill paid successfully!");
                    System.out.println("Bill Type: " + billType);
                    System.out.println("Amount: $" + amount);
                    return true;
                } else {
                    System.out.println("Bill payment failed!");
                    return false;
                }
            }
        }
    }
    
    @Override
    public String[] getSupportedBills() {
        return new String[]{"Electricity", "Water", "Internet", "Phone", "Gas"};
    }
    
    @Override
    public double getTotalBillsPaid() {
        return totalBillsPaid;
    }
    
    // Override displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Transfer Count: " + transferCount);
        System.out.println("Total Bills Paid: $" + totalBillsPaid);
    }
}