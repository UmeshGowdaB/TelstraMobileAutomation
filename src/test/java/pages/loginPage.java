package pages;

import common.baseDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class loginPage extends baseDriver {

    private ExpectedConditions ExceptedConditions;
    baseDriver driver = new baseDriver();

    private String username = "";
    private String password = "";
    private String loginButton = "";
    private String burgerMenu = "";

    public void enterLoginDetails() {

        WebElement userid = driver.waitfor(username);
        userid.click();
        userid.sendKeys("test@gmail.com");
        driver.androidDriver().findElement(MobileBy.cssSelector(password)).sendKeys("password");
        driver.androidDriver().findElement(MobileBy.AccessibilityId(loginButton)).click();
    }

    public void checkUserLogin() {

        WebElement loggedIn = driver.waitfor(burgerMenu);
        if (!loggedIn.getAttribute("text").contains("test"))
        {
            new Exception("User is not Logged in");
        }
    }
}
