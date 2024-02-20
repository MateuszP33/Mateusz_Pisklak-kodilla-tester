package com.kodilla.parametrized_tests.homework;

import com.kodilla.parametrized_tests.Person;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSource {
    static Stream<Arguments> providePersonForTestingBMITest() {
        return Stream.of(
                Arguments.of(new Person(1.98, 58), "Very severely underweight"),
                Arguments.of(new Person(1.98, 61.1), "Severely underweight"),
                Arguments.of(new Person(1.98, 65.5), "Underweight"),
                Arguments.of(new Person(1.87, 83.2), "Normal (healthy weight)"),
                Arguments.of(new Person(1.78, 91), "Overweight"),
                Arguments.of(new Person(1.75, 87), "Overweight"),
                Arguments.of(new Person(1.87, 87.2), "Normal (healthy weight)"),
                Arguments.of(new Person(1.70, 101.5), "Obese Class II (Severely obese)"),
                Arguments.of(new Person(1.70, 115.5), "Obese Class II (Severely obese)"),
                Arguments.of(new Person(1.70, 115.5), "Obese Class II (Severely obese)"),
                Arguments.of(new Person(1.70, 117.1), "Obese Class III (Very severely obese)")
                );
    }

}
