package myBankCucumber.steps;


import cucumber.api.java.en.Then;
import myBankCucumber.pageObjects.POM_MortageCalculator;

import static org.junit.Assert.assertEquals;


public class ThenSteps {

    @Then("^I see \"([^\"]*)\" as \"([^\"]*)\"$")
    public void iSeeAs(String strField, String strExpected) throws Throwable {
        POM_MortageCalculator mortCal = new POM_MortageCalculator();
        String actualText = mortCal.getText(strField);

        System.out.print("Expected: " + strExpected + "\r\nActual: " + actualText);
        System.out.println( (strExpected.equalsIgnoreCase(actualText)) ?  " (Matched)" : " (Not Matched)");
        assertEquals(strExpected, actualText);
    }
}
