package common;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.MalformedURLException;
import java.net.URL;

public class hooks extends baseDriver {
    private static final String APP = "apk/Amazon_shopping.apk";
//    private static final String APPIUM = "http://localhost:4723/wd/hub";
     private AndroidDriver driver;

    private ExpectedConditions ExceptedConditions;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "9");
        desiredCapabilities.setCapability("deviceName", "appium");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("app", APP);
        driver = baseDriver(desiredCapabilities);

//        driver = new AndroidDriver( new URL(APPIUM), desiredCapabilities);
    }

    @After
    public void tearDown() {
        if(driver != null) {
            driver.quit();
        }
    }

//    @Test
//    public  void login() {
//        WebDriverWait wait = new WebDriverWait( driver, 10);
//        wait.until(ExceptedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Login ")));
//    }
}
