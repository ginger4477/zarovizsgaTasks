package com.codecool.tests;

import com.codeccol.zarovizsga.InputFieldsPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InputFieldsTest extends BaseTest{

    InputFieldsPage inputFieldsPage;

    @BeforeEach
    void setUp() {
        inputFieldsPage = new InputFieldsPage(driver);
    }

    @Test
    public void TestSumTwoNumbers()
    {
        //Test data
        String valueA = "5223";
        String valueB = "6318";

        inputFieldsPage.navigate();
        inputFieldsPage.addValueA(valueA);
        inputFieldsPage.addValueB(valueB);
        inputFieldsPage.clickGetTotalButton();

        String actualResult = inputFieldsPage.getTotal();
        String expectedResult = "11541";

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void TestSumTwoInvalidInputs()
    {
        //Test data
        String valueA = "Bonnie";
        String valueB = "Clyde";

        inputFieldsPage.navigate();
        inputFieldsPage.addValueA(valueA);
        inputFieldsPage.addValueB(valueB);
        inputFieldsPage.clickGetTotalButton();

        String actualResult = inputFieldsPage.getTotal();
        String expectedResult = "NaN";

        Assertions.assertEquals(expectedResult, actualResult);
    }


}
