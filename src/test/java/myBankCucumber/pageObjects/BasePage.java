package myBankCucumber.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

    static WebDriver driver;

    public WebDriver initializeGoogleChrome() {
        String strChromeDriver =  "src\\test\\resources\\webDrivers\\chromedriver2.45.exe";
        System.setProperty("webdriver.chrome.driver", strChromeDriver);
        return new ChromeDriver();
    }

    public void setWebDriver(WebDriver driver) {
        this.driver = driver;
    }
}
