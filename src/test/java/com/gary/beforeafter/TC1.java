package com.gary.beforeafter;

import org.testng.annotations.*;

public class TC1 {
    @BeforeClass
    void beforeClass() {
        System.out.println("This will exeucte before the class!");
    }

    @AfterClass
    void afterClass() {
        System.out.println("This will exeucte after the class!");
    }

    @BeforeMethod
    void beforeMethod() {
        System.out.println("This will exeucte before the every method!");
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("This will exeucte after the every method!");
    }

    @BeforeTest
    void beforeTest() {
        System.out.println("This will execute before the Test !");
    }

    @AfterTest
    void afterTest() {
        System.out.println("This will execute after the Test !");
    }

    @Test
    void test1() {
        System.out.println("This is Test1 !");
    }

    @Test
    void test2() {
        System.out.println("This is Test2 !");
    }
}
