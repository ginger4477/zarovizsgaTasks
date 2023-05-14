package com.codeccol.zarovizsga;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertBoxPage extends Page{

    public AlertBoxPage(WebDriver driver) {
        super(driver);
    }

    private final String URL = "http://demo.seleniumeasy.com/javascript-alert-box-demo.html";
    private final By BUTTON_PROMPT_BOX = By.xpath("//*[@onclick='myPromptFunction()']");
    private final By TEXT_MESSAGE = By.id("prompt-demo");

    public void navigate() {
        driver.navigate().to(URL);
    }

    public void clickButton() {
        driver.findElement(BUTTON_PROMPT_BOX).click();
    }

    // enter Alert message
    public void enterAlertMessage(String name) throws InterruptedException {
        Alert alert = driver.switchTo().alert();
        Thread.sleep(30);
        alert.sendKeys(name);
    }

    // accept Alert
    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    // cancel Alert
    public void cancelAlert() {
        driver.switchTo().alert().dismiss();
    }

    // get Alert message
    public String getMessage() {
        return driver.findElement(TEXT_MESSAGE).getText();
    }

}
