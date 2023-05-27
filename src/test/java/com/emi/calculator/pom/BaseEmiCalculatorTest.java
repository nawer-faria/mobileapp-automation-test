package com.emi.calculator.pom;

import com.BaseTest;

public class BaseEmiCalculatorTest extends BaseTest {
    @Override
    protected String getAppPackage() {
        return "com.continuum.emi.calculator";
    }

    @Override
    protected String getAppActivity() {
        return "com.finance.emicalci.activity.AdActivity";
    }
}
