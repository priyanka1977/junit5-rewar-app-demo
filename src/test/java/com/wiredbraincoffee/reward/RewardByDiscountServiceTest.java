package com.wiredbraincoffee.reward;

import com.wiredbraincoffee.product.Product;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
/*
 This test class demonstrates 3 steps for writing unit test cases :
  1. Arrange (Setup the initial objects and variables required to run the test)
  2. Act  (invoke the action)
  3. Assert (Assert expectation vs reality)
 */
class RewardByDiscountServiceTest {

    // life cycle
    @BeforeEach
    public void setUp() {
        System.out.println("Setup method for each test");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("cleanup method for each test");
    }

    /* write a test case to verify the value of neededPoints returned
     *  expected neededpoints should match the actual needpoints set in the application
     *
     * */

    @Test
    void setNeededPoints() {

        // Arrange
        // 1. instantiate the object
        RewardByDiscountService reward = new RewardByDiscountService();
        int pointsToRedeem = 1000;

        // Act - invoke  the setNeededPoints methods
        reward.setNeededPoints(pointsToRedeem);

        // Assert - verify the value of neededPoints
        assertEquals(1000, reward.getNeededPoints());
    }

    @Test
    void testShouldApply_ZeroDiscount_ForCustomerPoints_Zero() {
        // Arrange
        RewardByDiscountService reward = new RewardByDiscountService();

        // Product List with one product object
        Product oneProduct = new Product(1, "product1", 1.99);
        List<Product> order = Collections.singletonList(oneProduct);

        int customerPoints = 0;

        // Act - invoke applyReward() method
        // applyReward() method creates object of RewardInformation that initializes
        // pointsRedeemed : 0 and discount : 0 initially
        RewardInformation rewardInfo = reward.applyReward(order, customerPoints);

        System.out.println("RewardInfromation" + rewardInfo.getDiscount() + "  " + rewardInfo.getPointsRedeemed());

        // Assert - one or multiple
        assertEquals(0.0, rewardInfo.getDiscount());
        assertEquals(0L, rewardInfo.getPointsRedeemed());

    }


    @Test
    void testShouldVerifyRedeemPoints_AndDiscount_ForCustomerPoints_GreaterThanZero() {
        // Arrange
        RewardByDiscountService reward = new RewardByDiscountService();
        // Product List with three product object
        Product oneProduct = new Product(1, "product1", 1.99);
        Product twoProduct = new Product(2, "product2", 2.99);
        Product threeProduct = new Product(3, "product3", 3.99);
        List<Product> order = Arrays.asList(oneProduct, twoProduct, threeProduct);

        int customerPoints = 200;
        // we need to set neededPoints and discount for the bulk products
        reward.setNeededPoints(100);
        reward.setPercentage(0.1);

        // Act - calling applyReward()
        RewardInformation rewardInfo = reward.applyReward(order, customerPoints);

        // Assert
        assertEquals(0.89, rewardInfo.getDiscount(), 0.01);

    }
}