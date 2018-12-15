package myBankCucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import myBankCucumber.pageObjects.BasePage;
import myBankCucumber.pageObjects.POM_MortageCalculator;
import org.openqa.selenium.WebDriver;


public class WhenSteps {
    @When("^I open \"([^\"]*)\" in \"([^\"]*)\"$")
    public void iOpenIn(String strURL, String strBrowerType) throws Throwable {
        //
        if (strBrowerType.toLowerCase().contains("chrome")) {
            BasePage bp = new BasePage();
            WebDriver driver = bp.initializeGoogleChrome();
            driver.get(strURL);
            bp.setWebDriver(driver);
        }

        System.out.println("Browser has been opened.");
    }


    @And("^I enter \"([^\"]*)\" field as \"([^\"]*)\"$")
    public void iEnterFieldAs(String strField, String strInput) throws Throwable {
        //
        POM_MortageCalculator mortCal = new POM_MortageCalculator();
        mortCal.enterText(strField, strInput);
    }

    @And("^I enter \"([^\"]*)\" as \"([^\"]*)\"$")
    public void iEnterAs(String arg0, String arg1) throws Throwable {
        //
        System.out.println("Test me4");
    }



}
