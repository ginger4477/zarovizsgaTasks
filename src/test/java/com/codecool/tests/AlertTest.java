package com.codecool.tests;

import com.codeccol.zarovizsga.AlertBoxPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AlertTest extends BaseTest{

    AlertBoxPage alertBoxPage;

    @BeforeEach
    void setUp() {
        alertBoxPage = new AlertBoxPage(driver);
    }

    @Test
    public void TestSubmitValidInput() throws InterruptedException {
        alertBoxPage.navigate();
        alertBoxPage.clickButton();
        alertBoxPage.enterAlertMessage("John Wick");
        alertBoxPage.acceptAlert();

        String actualResult = alertBoxPage.getMessage();
        String expectedResult = "You have entered 'John Wick' !";

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void TestInputCancel() throws InterruptedException {
        alertBoxPage.navigate();
        alertBoxPage.clickButton();
        alertBoxPage.enterAlertMessage("Luke");
        alertBoxPage.acceptAlert();
        alertBoxPage.clickButton();
        alertBoxPage.enterAlertMessage("Leia");
        alertBoxPage.cancelAlert();

        String actualResult = alertBoxPage.getMessage();
        String expectedResult = "You have entered 'Luke' !";

        Assertions.assertEquals(expectedResult, actualResult);
    }


}
