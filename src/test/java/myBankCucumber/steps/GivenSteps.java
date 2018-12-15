package myBankCucumber.steps;

import cucumber.api.java.en.Given;

public class GivenSteps {

        @Given("^Test Scenario is \"([^\"]*)\"$")
        public void testScenarioIs(String strTestScenario) throws Throwable {
            //
            System.out.println("Test Scenario is " + strTestScenario);
        }

}
