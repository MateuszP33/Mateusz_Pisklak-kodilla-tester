package com.kodilla.bank.homework;

import com.kodilla.basic_assertion.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuit {
    CashMachine cashMachine1 = new CashMachine();
    CashMachine cashMachine2 = new CashMachine();
    CashMachine cashMachine3 = new CashMachine();

    Bank bank1 = new Bank();

    @Test
    public void shouldReturnBalanceOfThreeCashMachines() {
        cashMachine1.add(1200);
        cashMachine1.add(2000);
        cashMachine1.add(-1200);
        cashMachine1.add(-2500);
        cashMachine2.add(1200);
        cashMachine2.add(0);
        cashMachine2.add(-1200);
        cashMachine2.add(-2500);
        cashMachine3.add(-1500);
        cashMachine3.add(0);
        cashMachine3.add(-1800);
        cashMachine3.add(3500);
        bank1.addCashMachine(cashMachine1);
        bank1.addCashMachine(cashMachine2);
        bank1.addCashMachine(cashMachine3);
        int l = bank1.getAllCashMachines().length;
        int b = bank1.balance();
        assertEquals(-2800, b);
        assertEquals(3, l);
    }

    @Test
    public void shouldReturnOnlyDepositTransaction() {
        cashMachine1.add(1200);
        cashMachine1.add(2000);
        cashMachine1.add(-1200);
        cashMachine1.add(-2500);
        cashMachine2.add(1200);
        cashMachine2.add(0);
        cashMachine2.add(-1200);
        cashMachine2.add(-2500);
        cashMachine3.add(-1500);
        cashMachine3.add(0);
        cashMachine3.add(-1800);
        cashMachine3.add(3500);
        bank1.addCashMachine(cashMachine1);
        bank1.addCashMachine(cashMachine2);
        bank1.addCashMachine(cashMachine3);
        int l = bank1.getAllCashMachines().length;
        int b = bank1.depositNumber();
        assertEquals(4, b);
        assertEquals(3, l);
    }

    @Test
    public void shouldReturnOnlyWithdrawTransaction() {
        cashMachine1.add(1200);
        cashMachine1.add(2000);
        cashMachine1.add(-1200);
        cashMachine1.add(-2500);
        cashMachine2.add(1200);
        cashMachine2.add(0);
        cashMachine2.add(-1200);
        cashMachine2.add(-2500);
        cashMachine3.add(-1500);
        cashMachine3.add(0);
        cashMachine3.add(-1800);
        cashMachine3.add(3500);
        bank1.addCashMachine(cashMachine1);
        bank1.addCashMachine(cashMachine2);
        bank1.addCashMachine(cashMachine3);
        int l = bank1.getAllCashMachines().length;
        int b = bank1.withdrawnNumber();
        assertEquals(6, b);
        assertEquals(3, l);
    }

    @Test
    public void shouldReturnOnlyAverageOffDepositTransaction() {
        cashMachine1.add(1200);
        cashMachine1.add(2000);
        cashMachine1.add(-1200);
        cashMachine1.add(-2500);
        cashMachine2.add(1200);
        cashMachine2.add(0);
        cashMachine2.add(-1200);
        cashMachine2.add(-2500);
        cashMachine3.add(-1500);
        cashMachine3.add(0);
        cashMachine3.add(-1800);
        cashMachine3.add(3500);
        bank1.addCashMachine(cashMachine1);
        bank1.addCashMachine(cashMachine2);
        bank1.addCashMachine(cashMachine3);
        int l = bank1.getAllCashMachines().length;
        double b = bank1.depositAverage();
        assertEquals(1975, b, 0.01);
        assertEquals(3, l);
    }

    @Test
    public void shouldReturnOnlyAverageOffWithdrawTransaction() {
        cashMachine1.add(1200);
        cashMachine1.add(2000);
        cashMachine1.add(-1200);
        cashMachine1.add(-2500);
        cashMachine2.add(1200);
        cashMachine2.add(0);
        cashMachine2.add(-1200);
        cashMachine2.add(-2500);
        cashMachine3.add(-1500);
        cashMachine3.add(0);
        cashMachine3.add(-1800);
        cashMachine3.add(3500);
        bank1.addCashMachine(cashMachine1);
        bank1.addCashMachine(cashMachine2);
        bank1.addCashMachine(cashMachine3);
        int l = bank1.getAllCashMachines().length;
        double b = bank1.withdrawnAverage();
        assertEquals(-1783.33, b, 0.1);
        assertEquals(3, l);
    }

    @Test
    public void shouldReturnZeroAverageOffWithdrawTransaction() {
        cashMachine2.add(0);
        cashMachine3.add(0);
        bank1.addCashMachine(cashMachine1);
        bank1.addCashMachine(cashMachine2);
        bank1.addCashMachine(cashMachine3);
        int l = bank1.getAllCashMachines().length;
        double b = bank1.withdrawnAverage();
        assertEquals(0, b, 0.1);
        assertEquals(3, l);
    }
    @Test
    public void shouldReturnZeroAverageOffDepositTransaction() {
        cashMachine2.add(0);
        cashMachine3.add(0);
        bank1.addCashMachine(cashMachine1);
        bank1.addCashMachine(cashMachine2);
        bank1.addCashMachine(cashMachine3);
        int l = bank1.getAllCashMachines().length;
        double b = bank1.depositAverage();
        assertEquals(0, b, 0.1);
        assertEquals(3, l);
    }
}
