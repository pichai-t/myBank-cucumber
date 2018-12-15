package myBankCucumber.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

interface ImortageCalculatorByElement {
    By byHomePriceField = By.xpath("//input[contains(@id,'inputs-homePrice')]");
    By byDownPayment = By.xpath("//input[contains(@id,'downPayment')]");
    By byPercentageDownPayment =   By.xpath("//input[@id='downPercent']");

    By byYouPaymentAmount = By.xpath("//text[contains(@style,'text-anchor: middle; font-size: 28px;')]");
}

public class POM_MortageCalculator extends BasePage implements ImortageCalculatorByElement {

    // Private Method: get WebElement by Name
    WebElement getWebElement(String strField) {
        WebElement el = null;
        switch (strField.replace(" ","").toLowerCase()) {
            case "homeprice":
                el = driver.findElement(byHomePriceField);
                break;
            case "downpayment":
                el = driver.findElement(byDownPayment);
                break;
            case "percentageofdownpayment":
                el = driver.findElement(byPercentageDownPayment);
                break;
            default:
                System.out.println("CAN NOT FIND ELEMENT IN getByElement() method");
        }
        return el;
    }

    // Method: Enter Text
    public void enterText(String strField, String strInput) {
        WebElement el = getWebElement(strField);
        el.click();
        el.sendKeys(Keys.CONTROL + "a");
        el.sendKeys(Keys.DELETE);
        el.sendKeys(strInput);
    }

    // Method: Get Text
    public String getText(String strField) {
        WebElement el = getWebElement(strField);
        return el.getAttribute("value").trim();
    }

}
