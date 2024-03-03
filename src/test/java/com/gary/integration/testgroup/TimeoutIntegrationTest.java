package com.gary.integration.testgroup;

import org.testng.annotations.Test;

public class TimeoutIntegrationTest {

    @Test(timeOut = 1000, enabled = false)
    public void givenExecution_takeMoreTime_thenFail() {
        while (true) ;
    }
}
