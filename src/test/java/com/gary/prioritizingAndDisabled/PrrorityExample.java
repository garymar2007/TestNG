package com.gary.prioritizingAndDisabled;

import org.testng.annotations.Test;

/**
 * The default order of execution is alphabetical order.  With the help of priority, you may re-order the test.
 * In default, enabled=true for all tests.
 */
public class PrrorityExample {
    @Test(priority = 0)
    void testOne() {
        System.out.println("This is test1!");
    }

    @Test(priority = 1)
    void testTwo() {
        System.out.println("This is test2!");
    }

    @Test(priority = 2)
    void testThree() {
        System.out.println("This is test3!");
    }

    @Test(priority = 3, enabled = false)
    void testFour() {
        System.out.println("This is test4!");
    }
}
