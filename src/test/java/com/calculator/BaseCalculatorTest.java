package com.calculator;

import com.BaseTest;

public class BaseCalculatorTest extends BaseTest {
    @Override
    protected String getAppPackage() {
        return "com.android.launcher3";
    }

    @Override
    protected String getAppActivity() {
        return ".Launcher";
    }
}
