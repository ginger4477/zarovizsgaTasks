package com.codecool.tests;

import com.codeccol.zarovizsga.ProgressBarPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;

public class ProgressBarTest extends BaseTest{

    ProgressBarPage progressBarPage;

    @BeforeEach
    void setUp() {
        progressBarPage = new ProgressBarPage(driver);
    }
    @Test
    public void TestProgressBarDownload()
    {
        progressBarPage.navigate();
        progressBarPage.clickDownload();
        String actualResult = progressBarPage.readPercent();
        String expectedResult = "100%";

        Assertions.assertEquals(expectedResult, actualResult);

        Assertions.assertTimeout(Duration.ofSeconds(60), () -> {
            progressBarPage.readPercent();
        });

    }

}
