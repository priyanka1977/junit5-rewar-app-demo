import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class HelloWorldTest  {

    @Test
    @DisplayName("Test should be successfully as true returned")
     void testHelloMessage(){
        System.out.println("Test runs");

        // Arrange - setup objects (List, Product..), initailization

        // Act - invoking the actual method or actions and get the result

        // Assert - instead of Assertions.assertTrue(condition)
        assertTrue(true);
    }


}
