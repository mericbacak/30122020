package util;

import base.TestBase;
import org.apache.log4j.Logger;
import org.apache.log4j.MDC;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener extends TestBase implements ITestListener {
    public void onTestStart(ITestResult iTestResult) {
        driver.get(baseUrl);
        Logcu.info("Sahibinden açıldı.");
    }

    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("success");
        Logcu.info("Başarılı");
    }

    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("failure");
        Logcu.error("Başarısız");
    }

    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("Skip");
        Logcu.warn("Skip");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {
        driver=new ChromeDriver();
        MDC.put("name",iTestContext.getName());
        Logcu.info("Chrome açıldı");
    }

    public void onFinish(ITestContext iTestContext) {
        Logcu.info("Browser kaptıldı");
        driver.quit();
    }
}
