package common;

import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;

public class hooks extends baseDriver {
    private static final String APP = "apk/Amazon_shopping.apk";
    private AndroidDriver driver;

    /**** App configuration on Appium ****/
    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "9");
        desiredCapabilities.setCapability("deviceName", "appium");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("app", APP);
        driver = baseDriver(desiredCapabilities);
    }

    /**** Closing app and driver ****/
    @After
    public void tearDown() {
        if(driver != null) {
            driver.quit();
        }
    }
}
