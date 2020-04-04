package common;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class baseDriver {

    private static final String APPIUM = "http://localhost:4723/wd/hub";
    private AndroidDriver driver;
    private ExpectedConditions ExceptedConditions;

    public AndroidDriver baseDriver(DesiredCapabilities desiredCapabilities) throws MalformedURLException {
        driver = new AndroidDriver( new URL(APPIUM), desiredCapabilities);
        return driver;
    }

    public AndroidDriver androidDriver() {
        return driver;
    }

    public WebElement waitfor(String element) {
        WebDriverWait wait = new WebDriverWait( driver, 10);
        WebElement name = wait.until(ExceptedConditions.presenceOfElementLocated(MobileBy.AccessibilityId(element)));
        return name;
    }
}
