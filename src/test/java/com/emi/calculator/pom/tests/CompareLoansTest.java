package com.emi.calculator.pom.tests;

import com.emi.calculator.pom.BaseEmiCalculatorTest;
import com.emi.calculator.pom.pages.CompareLoansPage;
import com.emi.calculator.pom.pages.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CompareLoansTest extends BaseEmiCalculatorTest {
    LandingPage landingPage;
    CompareLoansPage compareLoansPage;

    @Test (priority = 0)
    public void compareLoanShouldSucceed() {
        compareLoansPage = new LandingPage()
                .tapCompareLoansBtn()
                .fillLoanAmount1(200000)
                .fillInterest1(9)
                .fillPeriod1(4)
                .fillLoanAmount2(300000)
                .fillInterest2(9)
                .fillPeriod2(4)
                .tapCalculateBtn();
        Assert.assertTrue(compareLoansPage.hasLayoutTable());
    }

    @Test (priority = 1)
    public void resetLoanShouldSucceed() {
        compareLoansPage = compareLoansPage
                .fillLoanAmount1(200000)
                .fillInterest1(9)
                .fillPeriod1(4)
                .fillLoanAmount2(300000)
                .fillInterest2(9)
                .fillPeriod2(4)
                .tapCalculateBtn()
                .tapResetBtn();
        Assert.assertFalse(compareLoansPage.hasLayoutTable());

    }
}
