package org.example;


import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

/*
This test class demonstrate the use of Nested classes.
We can use JUnit5’s @Nested annotation to create nested test classes.
The annotation must be added at a class level, for each inner class that contains tests.

As a result, we can run the parent test class and
all the tests from the nested test classes should be executed.
 */
public class NestedTests {

    @Nested
    class FirstNestedClass {
        @Test
        void test() {
            System.out.println("FirstNestedClass.test()");
        }
    }

    @Nested
    class SecondNestedClass {
        @Test
        void test() {
            System.out.println("SecondNestedClass.test()");
        }
    }
}