package com.emi.calculator.pom.tests;

import com.emi.calculator.pom.BaseEmiCalculatorTest;
import com.emi.calculator.pom.pages.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LandingTest extends BaseEmiCalculatorTest {
    LandingPage landingPage;

    @Test
    public void emiCalculatorBtnShouldBeShown(){
        landingPage=new LandingPage();
        Assert.assertTrue(landingPage.isEmiCalculatorBtn());
    }

    @Test
    public void compareLoansBtnShouldBeShown(){
        landingPage=new LandingPage();
        Assert.assertTrue(landingPage.isCompareLoansBtn());
    }
}
