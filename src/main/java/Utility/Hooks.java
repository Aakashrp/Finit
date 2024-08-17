package Utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {


    @Before
    public void setUp() throws Exception {
        Base.initializeDriver(); // Initialize WebDriver before each scenario
    }

    @After
    public void tearDown() {
        Base.closeDriver(); // Close WebDriver after each scenario
    }
}

