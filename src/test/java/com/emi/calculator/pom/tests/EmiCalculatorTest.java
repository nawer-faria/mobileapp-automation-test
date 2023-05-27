package com.emi.calculator.pom.tests;

import com.emi.calculator.pom.BaseEmiCalculatorTest;
import com.emi.calculator.pom.pages.EmiCalculatorPage;
import com.emi.calculator.pom.pages.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmiCalculatorTest extends BaseEmiCalculatorTest {
    LandingPage landingPage;
    EmiCalculatorPage emiCalculatorPage;

    @Test(priority = 0)
    public void emiCalculateShouldSucceed() {
        landingPage = new LandingPage();
        Assert.assertTrue(landingPage.isEmiCalculatorBtn());

        emiCalculatorPage = landingPage
                .tapEmiCalculatorBtn()
                .fillLoanAmount(200000)
                .fillInterestRate(7.5)
                .fillYears(3)
                .fillMonths(4)
                .fillProcessingFee(500)
                .tapCalculateBtn();
        Assert.assertTrue(emiCalculatorPage.hasLayoutTable());

    }

    @Test(priority = 1)
    public void resetEmiCalculateShouldSucceed() {

        emiCalculatorPage = emiCalculatorPage
                .fillLoanAmount(50000)
                .fillInterestRate(9)
                .fillYears(2)
                .fillMonths(4)
                .fillProcessingFee(600)
                .tapCalculateBtn()
                .tapResetBtn();
        Assert.assertFalse(emiCalculatorPage.hasLayoutTable());
    }


    @Test(priority = 2)
    public void emiCalculateWithDetailShouldSucceed() {

        emiCalculatorPage = landingPage
                .tapEmiCalculatorBtn()
                .fillLoanAmount(500000)
                .fillInterestRate(8.5)
                .fillYears(4)
                .fillMonths(2)
                .fillProcessingFee(800)
                .tapCalculateBtn();
        Assert.assertTrue(emiCalculatorPage.hasDetailBtn());

        emiCalculatorPage = emiCalculatorPage
                .tapDetailBtn();
        Assert.assertTrue(emiCalculatorPage.hasLayoutDetailContainer());

    }

}
