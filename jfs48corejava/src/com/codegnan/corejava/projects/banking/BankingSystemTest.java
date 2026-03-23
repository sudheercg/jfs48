package com.codegnan.corejava.projects.banking;
public class BankingSystemTest {
    public static void main(String[] args) {
        // Create accounts
        SavingsAccount savings = new SavingsAccount("SA001", "Alice", 5000, 4.5, 1000);
        CurrentAccount current = new CurrentAccount("CA001", "Bob", 10000);
        PremiumAccount premium = new PremiumAccount("PA001", "Charlie", 50000, 6.0);
        
        // Test Savings Account
        System.out.println("=== SAVINGS ACCOUNT TEST ===");
        savings.displayInfo();
        System.out.println();
        
        savings.deposit(2000);
        savings.addInterest();
        System.out.println();
        
        // Test Current Account
        System.out.println("=== CURRENT ACCOUNT TEST ===");
        current.displayInfo();
        System.out.println();
        
        // Transfer money
        System.out.println("=== TRANSFER TEST ===");
        current.transferTo(savings, 3000);
        System.out.println();
        
        // Pay bills
        System.out.println("=== BILL PAYMENT TEST ===");
        current.payBill("Electricity", 500);
        current.payBill("Internet", 100);
        System.out.println();
        
        current.displayInfo();
        System.out.println();
        
        // Test Premium Account
        System.out.println("=== PREMIUM ACCOUNT TEST ===");
        premium.displayInfo();
        System.out.println();
        
        premium.addInterest();
        premium.transferTo(current, 5000);
        premium.payBill("Custom Bill", 1000);
        System.out.println();
        
        premium.displayInfo();
        System.out.println();
        
        // Polymorphism with interface
        System.out.println("=== POLYMORPHISM WITH INTERFACES ===");
        Transferable t1 = current;
        Transferable t2 = premium;
        
        System.out.println("Transfer Limit (Current): " + t1.getTransferLimit());
        System.out.println("Transfer Limit (Premium): " + t2.getTransferLimit());
        
        Billable b1 = current;
        Billable b2 = premium;
        
        System.out.println("Total Bills (Current): $" + b1.getTotalBillsPaid());
        System.out.println("Total Bills (Premium): $" + b2.getTotalBillsPaid());
    }
}
