package com.emi.calculator.pom.pages;

import com.emi.calculator.pom.BaseEmiCalculatorTest;
import com.emi.calculator.pom.util.General;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.List;

public class EmiCalculatorPage extends BaseEmiCalculatorTest {

    @CacheLookup
    @AndroidFindBy(id = "etLoanAmount")
    WebElement loanAmountEl;

    @AndroidFindBy(id = "etInterest")
    WebElement interestEl;

    @AndroidFindBy(id = "etYears")
    WebElement yearsEl;

    @AndroidFindBy(id = "etMonths")
    WebElement monthsEl;

    @AndroidFindBy(id = "etFee")
    WebElement feeEl;

    @AndroidFindBy(id = "btnCalculate")
    WebElement calculateBtn;

    @AndroidFindBy(id = "btnReset")
    WebElement resetBtn;

    @AndroidFindBy(id = "btnDetail")
    List<WebElement> detailBtn;

    @AndroidFindBy(id = "layoutTable")
    List<WebElement> layoutTable;

    @AndroidFindBy(id = "layoutDetailContainer")
    List<WebElement> layoutDetailContainer;


    public EmiCalculatorPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(General.TIME_WAIT)), this);
    }

    public EmiCalculatorPage fillLoanAmount(int amount){
        loanAmountEl.isDisplayed();
        loanAmountEl.clear();
        loanAmountEl.sendKeys(String.valueOf(amount));
        return this;
    }

    public EmiCalculatorPage fillInterestRate(double rate){
        interestEl.isDisplayed();
        interestEl.clear();
        interestEl.sendKeys(String.valueOf(rate));
        return this;
    }

    public EmiCalculatorPage fillYears(int years){
        yearsEl.isDisplayed();
        yearsEl.clear();
        yearsEl.sendKeys(String.valueOf(years));
        return this;
    }

    public EmiCalculatorPage fillMonths(int months){
        monthsEl.isDisplayed();
        monthsEl.clear();
        monthsEl.sendKeys(String.valueOf(months));
        return this;
    }

    public EmiCalculatorPage fillProcessingFee(int fee){
        feeEl.isDisplayed();
        feeEl.clear();
        feeEl.sendKeys(String.valueOf(fee));
        return this;
    }

    public EmiCalculatorPage tapCalculateBtn(){
        calculateBtn.isDisplayed();
        calculateBtn.click();
        return this;
    }

    public EmiCalculatorPage tapResetBtn(){
        resetBtn.isDisplayed();
        resetBtn.click();
        return this;
    }

    public EmiCalculatorPage tapDetailBtn(){
        detailBtn.get(0).isDisplayed();
        detailBtn.get(0).click();
        return this;
    }

    public boolean hasDetailBtn(){
        return detailBtn.size()>0;
    }

    public boolean hasLayoutTable(){
        return layoutTable.size()>0;
    }

    public boolean hasLayoutDetailContainer(){
        return layoutDetailContainer.size()>0;
    }

}