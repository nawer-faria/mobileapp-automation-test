package com.emi.calculator.pom.pages;

import com.emi.calculator.pom.BaseEmiCalculatorTest;
import com.emi.calculator.pom.util.General;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class LandingPage extends BaseEmiCalculatorTest {

    @CacheLookup
    @AndroidFindBy(id = "btnStart")
    WebElement emiCalculatorBtn;

    @AndroidFindBy(id= "btnCompare")
    WebElement compareLoansBtn;

    public LandingPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(General.TIME_WAIT)), this);
    }

    public EmiCalculatorPage tapEmiCalculatorBtn(){
        emiCalculatorBtn.isDisplayed();
        emiCalculatorBtn.click();
        return new EmiCalculatorPage();
    }

    public CompareLoansPage tapCompareLoansBtn(){
        compareLoansBtn.isDisplayed();
        compareLoansBtn.click();
        return new CompareLoansPage();
    }

    public boolean isEmiCalculatorBtn(){
        return emiCalculatorBtn.isDisplayed();
    }

    public boolean isCompareLoansBtn(){
        return compareLoansBtn.isDisplayed();
    }

}
