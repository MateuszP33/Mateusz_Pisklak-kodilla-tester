package com.kodilla.bank.homework;

import com.kodilla.basic_assertion.Calculator;

public class CashMachine {
    private int[] transactions;
    private int size;

    public CashMachine() {
        this.transactions = new int[0];
        this.size = 0;
    }
    public void add(int transaction) {
            this.size++;
            int[] newTab = new int[this.size];
            System.arraycopy(transactions, 0, newTab, 0, transactions.length);
            if (transaction !=0)
            newTab[this.size - 1] = transaction;
            this.transactions = newTab;
    }

    public int[] getTransactions() {
        return transactions;
    }

    public int getBalance() {
        int sum = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            sum += this.transactions[i];
        }
        return sum;
    }

    public int transactionNumber() {
        return transactions.length;
    }

    public int getDepositTransactions() {
        int count = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > 0) {
                count++;
            }
        }
        return count;
    }

    public int getWithdrawnTransactions() {
        int count = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] < 0) {
                count++;
            }
        }
        return count;
    }
}
