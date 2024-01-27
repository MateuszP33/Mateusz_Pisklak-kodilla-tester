package com.kodilla.bank.homework;

import com.kodilla.basic_assertion.Calculator;

public class Bank {
    private CashMachine[] allCashMachines;
    private int size;

    public Bank() {
        this.allCashMachines = new CashMachine[0];
        this.size = 0;
    }

    public void addCashMachine(CashMachine cashMachine) {
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(allCashMachines, 0, newTab, 0, allCashMachines.length);
        newTab[this.size - 1] = cashMachine;
        this.allCashMachines = newTab;
    }

    public CashMachine[] getAllCashMachines() {
        return allCashMachines;
    }

    public int balance() {
        int sum = 0;
        for (int i = 0; i < this.allCashMachines.length; i++) {
            int c = allCashMachines[i].getBalance();
            sum += c;
        }
        return sum;
    }

    public int depositNumber() {
        int depoSum = 0;
        for (int i = 0; i < allCashMachines.length; i++) {
            depoSum = depoSum + allCashMachines[i].getDepositTransactions();
        }
        return depoSum;
    }

    public int withdrawnNumber() {
        int withSum = 0;
        for (int i = 0; i < allCashMachines.length; i++) {
            withSum = withSum + allCashMachines[i].getWithdrawnTransactions();
        }
        return withSum;
    }

    public double depositAverage() {
        int sum = 0;
        for (int i = 0; i < allCashMachines.length; i++) {
            for (int j = 0; j < allCashMachines[i].getTransactions().length; j++) {
                if (allCashMachines[i].getTransactions()[j] > 0) {
                    sum = sum + allCashMachines[i].getTransactions()[j];
                }
            }
        }
        if (withdrawnNumber() > 0) {
            return (double) sum / depositNumber();
        } else {
            return 0;
        }
    }

    public double withdrawnAverage() {
        int sum = 0;
        for (int i = 0; i < allCashMachines.length; i++) {
            for (int j = 0; j < allCashMachines[i].getTransactions().length; j++) {
                if (allCashMachines[i].getTransactions()[j] < 0) {
                    sum = sum + allCashMachines[i].getTransactions()[j];
                }
            }
        }
        if (withdrawnNumber() > 0) {
            return (double) sum / withdrawnNumber();
        } else {
            return 0;
        }
    }
}
