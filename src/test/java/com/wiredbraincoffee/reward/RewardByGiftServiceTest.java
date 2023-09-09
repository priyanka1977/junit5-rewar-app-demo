package com.wiredbraincoffee.reward;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/*
The test class demonstrates life cycle methods of JUNIT5,assert exceptions raised in the code,
Covering all lines of the code or method by writing mulitple test cases
 */
class RewardByGiftServiceTest {
    private RewardByGiftService reward;

    @BeforeAll
    static void setup(){
        System.out.println("BeforeAll executed before all tests");
    }

    @BeforeEach // runs before every test case
    void init(){
        System.out.println("BeforeEach executed before each tests");
        reward = new RewardByGiftService();
        reward.setGiftProductId(4);
    }

     @AfterEach
     void tear(){
         System.out.println("Executed after each tests");
     }

     @AfterAll // executed after all test cases
     static void tearAll(){
         System.out.println("AfterAll executed after all tests");
     }
    @Test
    @DisplayName("Exception is thrown when invalid product ID")
    void testShould_ThrowException_ForInValidId(){
        // arrange
      //  RewardByGiftService reward = new RewardByGiftService();
        int productId = -1;
        // action
          // reward.
        // (productId);
       // assert - asserthrows(exception claa type executable is lambda)
       // assertThrows(IllegalArgumentException.class,  () -> reward.setGiftProductId(productId));

        // Can a parent exception type class be thrown
        RuntimeException myexception = assertThrows(RuntimeException.class,  () -> reward.setGiftProductId(productId));
        System.out.println(myexception.getMessage()); // -1 is not a valid product

        // exception object contains message
       // assertTrue(exception.getMessage().contains(String.valueOf(100)));
        assertTrue(myexception.getMessage().contains(String.valueOf(productId)));
        assertEquals("-1 is not a valid product", myexception.getMessage());
    }

    @Test
    @DisplayName("Correct Product ID Greater Than 0 is set")
    void testShould_BeValid_ForCorrectProductID(){
        // arrange
        //  RewardByGiftService reward  = new RewardByGiftService();
        //int productId = 4;
        // act
         //reward.setGiftProductId(productId);
        // assert - assertEquals(expected, actual, errormessage when assert fails)
        assertEquals(4,  reward.getGiftProductId(), "Error! the product id is incorrect");
    }






}