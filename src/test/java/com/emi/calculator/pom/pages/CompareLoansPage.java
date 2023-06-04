package com.emi.calculator.pom.pages;

import com.emi.calculator.pom.BaseEmiCalculatorTest;
import com.emi.calculator.pom.util.General;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.List;

public class CompareLoansPage extends BaseEmiCalculatorTest {

    @CacheLookup
    @AndroidFindBy(id = "etLoanAmount1")
    WebElement loanAmount1El;

    @AndroidFindBy(id = "etInterest1")
    WebElement interest1El;

    @AndroidFindBy(id = "etPeriod1")
    WebElement period1El;

    @AndroidFindBy(id = "etLoanAmount2")
    WebElement loanAmount2El;

    @AndroidFindBy(id = "etInterest2")
    WebElement interest2El;

    @AndroidFindBy(id = "etPeriod2")
    WebElement period2El;

    @AndroidFindBy(id = "btnCalculate")
    WebElement calculateBtn;

    @AndroidFindBy(id = "btnReset")
    WebElement resetBtn;

    @AndroidFindBy(id ="layoutTable")
    List<WebElement> layoutTable;


    public CompareLoansPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(General.TIME_WAIT)), this);
    }

    public CompareLoansPage fillLoanAmount1(int amount){
        loanAmount1El.isDisplayed();
        loanAmount1El.clear();
        loanAmount1El.sendKeys(String.valueOf(amount));
        return this;
    }

    public CompareLoansPage fillPeriod1(int period){
        period1El.isDisplayed();
        period1El.clear();
        period1El.sendKeys(String.valueOf(period));
        return this;
    }

    public CompareLoansPage fillInterest1(int interest){
        interest1El.isDisplayed();
        interest1El.clear();
        interest1El.sendKeys(String.valueOf(interest));
        return this;
    }

    public CompareLoansPage fillLoanAmount2(int amount){
        loanAmount2El.isDisplayed();
        loanAmount2El.clear();
        loanAmount2El.sendKeys(String.valueOf(amount));
        return this;
    }

    public CompareLoansPage fillPeriod2(int period){
        period2El.isDisplayed();
        period2El.clear();
        period2El.sendKeys(String.valueOf(period));
        return this;
    }

    public CompareLoansPage fillInterest2(int interest){
        interest2El.isDisplayed();
        interest2El.clear();
        interest2El.sendKeys(String.valueOf(interest));
        return this;
    }

    public CompareLoansPage tapCalculateBtn(){
        calculateBtn.isDisplayed();
        calculateBtn.click();
        return this;
    }

    public CompareLoansPage tapResetBtn(){
        resetBtn.isDisplayed();
        resetBtn.click();
        return this;
    }

    public boolean hasLayoutTable(){
        return layoutTable.size()>0;
    }
}
