package myBankCucumber.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

@CucumberOptions(
        features={"src/test/resources/featureFiles"},
        glue= {"myBankCucumber.steps"},
        format = {
        "pretty",
        "html:target/cucumber-reports/cucumber-pretty",
        "json:target/cucumber-reports/CucumberTestReport.json",
        "rerun:target/cucumber-reports/rerun.txt"},
        monochrome = true
)

public class myBankRunner extends AbstractTestNGCucumberTests {

    // TestNG's BeforeClass and AfterClass
    // ======================================
    @BeforeClass
    public void setupClass()
    {

    }


    // =======================================
    @AfterClass
    public void tearDown()
    {


    }

}
