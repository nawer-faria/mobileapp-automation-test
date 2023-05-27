package com.smartpo.pom;

import com.BaseTest;

public class BaseSmartPoTest extends BaseTest {
    @Override
    protected String getAppPackage() {
        return "com.bracits.smartpo.training";
    }

    @Override
    protected String getAppActivity() {
        return "com.bracits.smartpo.po.ProgramOrganizerActivity";
    }
}
