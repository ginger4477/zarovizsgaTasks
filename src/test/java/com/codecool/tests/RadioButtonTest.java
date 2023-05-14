package com.codecool.tests;

import com.codeccol.zarovizsga.RadioButtonPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RadioButtonTest extends BaseTest{

    RadioButtonPage radioButtonPage;

    @BeforeEach
    void setUp() {
        radioButtonPage = new RadioButtonPage(driver);
    }


    @Test
    public void TestSingleCheckedButton()
    {
        radioButtonPage.navigate();
        radioButtonPage.selectSex();
        radioButtonPage.clickCheckButton();

        String actualResult = radioButtonPage.getSelectedSex();
        String expectedResult = "Radio button 'Male' is checked";

        Assertions.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void TestMultipleCheckedButton()
    {
        radioButtonPage.navigate();
        radioButtonPage.selectSexRadioGroup();
        radioButtonPage.selectAge();
        radioButtonPage.clickGetValuesButton();

        String actualResult = radioButtonPage.getValues();
        String expectedResult = "Sex : Male\n" + "Age group: 5 - 15";

        Assertions.assertEquals(expectedResult, actualResult);
    }


}
