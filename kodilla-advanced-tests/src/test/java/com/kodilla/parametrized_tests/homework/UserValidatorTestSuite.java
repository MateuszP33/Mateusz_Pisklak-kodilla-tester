package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {
    UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"Aza", "A_-", "A123", "AAA...", "_____", "-09---"})
    public void validateUsernameTestTrue(String username) {
        boolean resault = userValidator.validateUsername(username);
        assertTrue(resault);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Az", "A12<", "123,", "AAA ...", "__'___", "-09-ł-"})
    public void validateUsernameTestFalse(String username) {
        boolean result = userValidator.validateUsername(username);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"abcd123__@uk.com","a@com.1"})
    void validateEmail(String username) {
        boolean result = userValidator.validateUsername(username);
        assertFalse(result);
    }
    @ParameterizedTest
    @NullAndEmptySource
    void validateEmailTestFalseIfIsNullOrEmpty(String username) {
        assertFalse(userValidator.validateEmail(username));
    }
}
