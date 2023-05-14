package com.codeccol.zarovizsga;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputFieldsPage extends Page{

    public InputFieldsPage(WebDriver driver) {
        super(driver);
    }

    private final String URL = "http://demo.seleniumeasy.com/basic-first-form-demo.html";
    private final By INPUT_VALUE_A = By.id("value1");
    private final By INPUT_VALUE_B = By.id("value2");
    private final By BUTTON_GET_TOTAL = By.xpath("//*[@onclick='return total()']");
    private final By DISPLAY_VALUE = By.id("displayvalue");

    public void navigate() {
        driver.navigate().to(URL);
    }

    public void addValueA(String num) {
        driver.findElement(INPUT_VALUE_A).sendKeys(num);
    }

    public void addValueB(String num) {
        driver.findElement(INPUT_VALUE_B).sendKeys(num);
    }

    public void clickGetTotalButton() {
        driver.findElement(BUTTON_GET_TOTAL).click();
    }

    public String getTotal() {
        return driver.findElement(DISPLAY_VALUE).getText();
    }

}
