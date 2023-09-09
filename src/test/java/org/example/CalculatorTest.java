package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    // life cycle
    @BeforeEach
    public void setUp(){
        System.out.println("Setup method for each test");
    }

    @AfterEach
    public void tearDown(){
        System.out.println("cleanup method for each test");
    }
    // Every test should test only a "Single Thing"
    @Test
    void testAdd(){
        // arrange
        Calculator calculator = new Calculator();
        int num1 = 2;
        int num2 = 2;
        int result = 0;

        // act - invoke the method to get result
          result = calculator.add(num1, num2);

          // Assert
        assertNotNull(calculator);
        assertEquals(5, result);
    }
}