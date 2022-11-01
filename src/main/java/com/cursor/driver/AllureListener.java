package com.cursor.driver;

import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Listeners;

import java.io.ByteArrayInputStream;
import java.util.UUID;


public class AllureListener extends TestListenerAdapter {

    @Override
    public void onTestFailure(ITestResult result) {
        Allure.addAttachment(UUID.randomUUID().toString(),
                new ByteArrayInputStream(((TakesScreenshot)DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES)));

//        super.onTestFailure(result);
    }
}
