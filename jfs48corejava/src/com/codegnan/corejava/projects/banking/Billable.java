package com.codegnan.corejava.projects.banking;
/**
 * Billable interface - accounts that can pay bills.
 */
public interface Billable {
    boolean payBill(String billType, double amount);
    String[] getSupportedBills();
    double getTotalBillsPaid();
}

/**
 * Premium Account - all features with higher limits.
 */

