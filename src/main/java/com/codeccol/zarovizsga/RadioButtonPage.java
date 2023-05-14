package com.codeccol.zarovizsga;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButtonPage extends Page{

    public RadioButtonPage(WebDriver driver) {
        super(driver);
    }

    private final String URL = "https://demo.seleniumeasy.com/basic-radiobutton-demo.html";
    private final By RADIO_MALE = By.xpath("//input[@name='optradio' and @value='Male']");
    private final By BUTTON_CHECK = By.id("buttoncheck");
    private final By TEXT = By.xpath("//p[@class='radiobutton']");
    private final By RADIO_GROUP_MALE = By.xpath("//input[@name='gender' and @value='Male']");
    private final By RADIO_AGE_515 = By.xpath("//input[@value='5 - 15']");
    private final By BUTTON_GET_VALUES = By.xpath("//*[@onclick='getValues();']");
    private final By TEXT_GROUP = By.xpath("//*[@class='groupradiobutton']");


    public void navigate() {
        driver.navigate().to(URL);
    }

    public void selectSex() {
        driver.findElement(RADIO_MALE).click();
    }

    public void clickCheckButton() {
        driver.findElement(BUTTON_CHECK).click();
    }

    public String getSelectedSex() {
        return driver.findElement(TEXT).getText();
    }

    public void selectSexRadioGroup() {
        driver.findElement(RADIO_GROUP_MALE).click();
    }

    public void selectAge() {
        driver.findElement(RADIO_AGE_515).click();
    }

    public void clickGetValuesButton() {
        driver.findElement(BUTTON_GET_VALUES).click();
    }

    public String getValues() {
        return driver.findElement(TEXT_GROUP).getText();
    }

}
