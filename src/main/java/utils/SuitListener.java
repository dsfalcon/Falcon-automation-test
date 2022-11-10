package main.java.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;
import test.java.BaseTest;


import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class SuitListener implements ITestListener, IAnnotationTransformer {

    @Override
    public void onStart(ITestContext iTestResult) {
        // TODO Auto-generated method stub


    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        // TODO Auto-generated method stub
        try {
        String fileName = System.getProperty("user.dir") + File.separator + "screenshots" + File.separator + iTestResult.getMethod().getMethodName();
        File f = ((TakesScreenshot) BaseTest.driver).getScreenshotAs(OutputType.FILE);


            FileHandler.copy(f, new File(fileName + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("iTestResult" + iTestResult);
        // TODO Auto-generated method stub
        try {
            String fileName = System.getProperty("user.dir") + File.separator + "screenshots" + File.separator + iTestResult.getMethod().getMethodName();
            File f = ((TakesScreenshot) BaseTest.driver).getScreenshotAs(OutputType.FILE);


            FileHandler.copy(f, new File(fileName + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // FileUtils.copyFile();   /// not saported in the new version of the seleniu

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onFinish(ITestContext iTestResult) {
        // TODO Auto-generated method stub


    }

    @Override
    public void transform(ITestAnnotation iTestAnnotation, Class aClass, Constructor constructor, Method method) {
        iTestAnnotation.setRetryAnalyzer(RetryAnalyser.class);
    }


}
