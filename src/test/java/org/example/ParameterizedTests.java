package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

/*
This test class demonstrates parameterized tests.
This feature enables us to execute a single test method multiple times with different parameters.

 You need to add a new dependency in pom.xml for working with parameterized tests
 for Eclipse IDE. No need to add this in IntelliJ IDE as it is added automatically.

 <dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-params</artifactId>
    <version>5.9.2</version>
    <scope>test</scope>
</dependency>
 */
public class ParameterizedTests {

    /*
    JUnit 5 test runner executes test isOdd method — six times. And each time,
    it assigns a different value from the @ValueSource array to the number method parameter.
    Parameterized test needs 2 things:
      1. source of argument - in this test - ints array
      2. way to access them - in this test - number variable
     */
    /* This test uses Numbers class from org.example */
    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, -3, 15, Integer.MAX_VALUE}) // six numbers
    void isOdd_ShouldReturnTrueForOddNumbers(int number) {
        System.out.println("Method executed for number - " + number);
        assertTrue(Numbers.isOdd(number));
    }


    /* This test case uses Strings class from org.example */
    @ParameterizedTest
    @ValueSource(strings = {"", "  "})
    void isBlank_ShouldReturnTrueForNullOrBlankStrings(String input) {
        assertTrue(Strings.isBlank(input));
    }
}
