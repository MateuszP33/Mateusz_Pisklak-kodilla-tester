package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuit {
    CashMachine cashMachine = new CashMachine();

    @Test
    public void shouldAddThreeElementsToArray() {
        cashMachine.add(1500);
        cashMachine.add(0);
        cashMachine.add(2000);
        cashMachine.add(-2800);
        int[] transactions = cashMachine.getTransactions();
        assertEquals(4, transactions.length);
        assertEquals(1500, transactions[0]);
        assertEquals(-2800, transactions[3]);
    }

    @Test
    public void shouldReturnBalance() {
        cashMachine.add(1500);
        cashMachine.add(0);
        cashMachine.add(2000);
        cashMachine.add(-1400);
        double a = cashMachine.getBalance();
        assertEquals(2100, a, 0.1);
    }

    @Test
    public void shouldReturnNumberOfDepositTransaction() {
        cashMachine.add(1500);
        cashMachine.add(0);
        cashMachine.add(2000);
        cashMachine.add(-1400);
        int a = cashMachine.getDepositTransactions();
        assertEquals(2, a);
    }

    @Test
    public void shouldReturnNumberOfWithdrawTransaction() {
        cashMachine.add(1500);
        cashMachine.add(0);
        cashMachine.add(2000);
        cashMachine.add(-1400);
        int a = cashMachine.getWithdrawnTransactions();
        assertEquals(1, a);
    }
}
