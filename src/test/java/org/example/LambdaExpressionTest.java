package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LambdaExpressionTest {

    @Test
    void groupAsserts(){

        int[] numberInts = {1, 2, 3, 4};
       assertEquals(1, numberInts[0]);
       assertEquals(2, numberInts[1]);

       // grouping of multiple asserts with assertAll()
        Assertions.assertAll("numberInts",
               () -> assertEquals(1, numberInts[0]),
               () -> assertEquals(2, numberInts[1]),
                () -> assertNotNull(numberInts));
  }


  @Test
    void test_sum_of_Integers_GreaterThan5(){
      // java 8 - stream api - arrange
      List<Integer> numberList = Arrays.asList(1, 2, 3, 4);
      //assertTrue(condition, message); // message is written as lambda expreion
      // Advantage of re-writting message as lambda expression???? Lazy loading of message
      int result = numberList.stream().mapToInt((num) -> Integer.valueOf(num)).sum();
      assertTrue(numberList.stream().mapToInt((num) -> Integer.valueOf(num)).sum() > 5 , () -> "sum should be greater than 5");

      // assertTrue(result < 5, "sum should be greater than 5");

      // int result =  numberList.stream().mapToInt((num) -> Integer.valueOf(num)).sum();
      //System.out.println("Sum = " + result);
  }

  @Test
    void assertThrowException_NullPointerException(){
        String str = null;
        // assertThrows() method will help to assert Exceptions
        // assertThrows(Exception class, executable code as Lambda
       // assertThrows(IllegalArgumentException.class, () -> str.toUpperCase());
      assertThrows(NullPointerException.class, () -> str.toUpperCase());
  }
}
