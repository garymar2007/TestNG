package com.gary.beforeafter;

import org.testng.annotations.*;

public class TC2 {
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

    @BeforeSuite
    void beforeSuite() {
        System.out.println("This will exeucte before test suite!");
    }

    @AfterSuite
    void afterSuite() {
        System.out.println("This will exeucte after test suite!");
    }

    @Test
    void test3() {
        System.out.println("This is Test3 !");
    }

    @Test
    void test4() {
        System.out.println("This is Test4 !");
    }
}
