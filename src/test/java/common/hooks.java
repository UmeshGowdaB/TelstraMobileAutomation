package common;

import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class hooks {
    private static final String APP = "apk/Amazon_shopping.apk";
    private static final String APPIUM = "http://localhost:4723/wd/hub";
    private AndroidDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "9");
        desiredCapabilities.setCapability("deviceName", "appium");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("app", APP);

        driver = new AndroidDriver( new URL(APPIUM), desiredCapabilities);
    }

    @After
    public void tearDown() {
        if(driver != null) {
            driver.quit();
        }
    }
}
