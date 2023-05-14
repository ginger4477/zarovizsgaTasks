package com.codecool.tests;

import com.codeccol.zarovizsga.DualListBoxPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DualListBoxTest extends BaseTest{

    DualListBoxPage dualListBoxPage;

    @BeforeEach
    void setUp() {
        dualListBoxPage = new DualListBoxPage(driver);
    }

    @Test
    public void TestAddSingleElement()
    {
        dualListBoxPage.navigate();
        dualListBoxPage.clickAddAllButton();

        int actualResult = dualListBoxPage.getListItems();
        int expectedResult = 15;

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void TestAddAllElementButton()
    {
        //Test data
        String name = "Julia";

        dualListBoxPage.navigate();
        dualListBoxPage.selectName(name);
        dualListBoxPage.clickAddButton();

        int actualResult = dualListBoxPage.getPickListItems();
        int expectedResult = 14;

        Assertions.assertEquals(expectedResult, actualResult);
        Assertions.assertTrue(dualListBoxPage.isNameVisible(name));
    }


}
