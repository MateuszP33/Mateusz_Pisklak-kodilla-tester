package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {
    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/SixRandomNumbers", numLinesToSkip = 1)
    public void howManyWinsTest(String num1, String num2, String num3, String num4, String num5, String num6) throws InvalidNumbersException {
        Set<Integer> randomNumbers = new HashSet<>();
        randomNumbers.add(Integer.parseInt(num1));
        randomNumbers.add(Integer.parseInt(num2));
        randomNumbers.add(Integer.parseInt(num3));
        randomNumbers.add(Integer.parseInt(num4));
        randomNumbers.add(Integer.parseInt(num5));
        randomNumbers.add(Integer.parseInt(num6));
        int j = gamblingMachine.howManyWins(randomNumbers);
        assertTrue(j < 7 && (j >= 0));
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/WrongRandomNumbers", numLinesToSkip = 1)
    public void howManyWinsShouldThrowExceptionLessNumbers(String num1, String num2, String num3, String num4, String num5)  {
        Set<Integer> randomNumbers = new HashSet<>();
        randomNumbers.add(Integer.parseInt(num1));
        randomNumbers.add(Integer.parseInt(num2));
        randomNumbers.add(Integer.parseInt(num3));
        randomNumbers.add(Integer.parseInt(num4));
        randomNumbers.add(Integer.parseInt(num5));
        assertThrows(InvalidNumbersException.class,()->gamblingMachine.howManyWins(randomNumbers));
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/WrongRandomNumbers", numLinesToSkip = 1)
    public void howManyWinsShouldThrowExceptionMoreNumbers(String num1, String num2, String num3, String num4, String num5,
                                                           String num6, String num7)  {
        Set<Integer> randomNumbers = new HashSet<>();
        randomNumbers.add(Integer.parseInt(num1));
        randomNumbers.add(Integer.parseInt(num2));
        randomNumbers.add(Integer.parseInt(num3));
        randomNumbers.add(Integer.parseInt(num4));
        randomNumbers.add(Integer.parseInt(num5));
        randomNumbers.add(Integer.parseInt(num6));
        randomNumbers.add(Integer.parseInt(num7));
        assertThrows(InvalidNumbersException.class,()->gamblingMachine.howManyWins(randomNumbers));
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/WrongRandomNumbers", numLinesToSkip = 3)
    public void howManyWinsShouldThrowExceptionOutOfDeclaredScope(String num1, String num2, String num3, String num4, String num5,
                                                           String num6)  {
        Set<Integer> randomNumbers = new HashSet<>();
        randomNumbers.add(Integer.parseInt(num1));
        randomNumbers.add(Integer.parseInt(num2));
        randomNumbers.add(Integer.parseInt(num3));
        randomNumbers.add(Integer.parseInt(num4));
        randomNumbers.add(Integer.parseInt(num5));
        randomNumbers.add(Integer.parseInt(num6));
        assertThrows(InvalidNumbersException.class,()->gamblingMachine.howManyWins(randomNumbers));
    }
}