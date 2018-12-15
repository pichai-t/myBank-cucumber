package myBankCucumber.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import myBankCucumber.pageObjects.BasePage;

public class HookSteps {

    @Before
    void before() {

    }

    @After()
    void after(){
        new BasePage().quitWebDriver();
    }
}
