package com.codeccol.zarovizsga;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DualListBoxPage extends Page{

    public DualListBoxPage(WebDriver driver) {
        super(driver);
    }

    private final String URL = "http://demo.seleniumeasy.com/jquery-dual-list-box-demo.html";
    private final By BUTTON_ADD_ALL = By.xpath("//*[@class='pAddAll btn btn-primary btn-sm']");
    private final By LIST_ITEMS_RIGHT = By.xpath("//*[@class='form-control pickListSelect pickListResult']/option");
    private final By BUTTON_ADD = By.xpath("//*[@class='pAdd btn btn-primary btn-sm']");
    private final By LIST_ITEMS_LEFT = By.xpath("//*[@class='form-control pickListSelect pickData']/option");

    private final By LIST_ITEM = By.xpath("//*[@class='form-control pickListSelect pickData']");
    public void navigate() {
        driver.navigate().to(URL);
    }

    public void clickAddAllButton() {
        driver.findElement(BUTTON_ADD_ALL).click();
    }

    public int getListItems() {
        List<WebElement> listItems = driver.findElements(LIST_ITEMS_RIGHT);
        return listItems.size();
    }

    public void selectName(String name){
        WebElement leftListElement = driver.findElement(LIST_ITEM);
        leftListElement.findElement(By.xpath("./option[text()='"+name+"']")).click();
    }

    public void clickAddButton() {
        driver.findElement(BUTTON_ADD).click();
    }

    public boolean isNameVisible(String name) {
        List<WebElement> listItems = driver.findElements(LIST_ITEMS_RIGHT);
        for (WebElement item : listItems) {
            if (item.getText().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public int getPickListItems() {
        List<WebElement> listItems = driver.findElements(LIST_ITEMS_LEFT);
        return listItems.size();
    }

}
