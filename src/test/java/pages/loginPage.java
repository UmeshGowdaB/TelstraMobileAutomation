package pages;

import common.baseDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.assertj.core.api.Assertions.assertThat;

public class loginPage extends baseDriver {

    private ExpectedConditions ExceptedConditions;
    baseDriver driver = new baseDriver();

    private By signIn = MobileBy.AccessibilityId("siginSubmit");
    private By email = MobileBy.AccessibilityId("ap_email_login");
    private By continueButton = MobileBy.AccessibilityId("continue");
    private By password = MobileBy.AccessibilityId("ap_password");
    private By burgerMenu = MobileBy.AccessibilityId("id/chrome_action_bar_burger_icon");
    private By greetingText = MobileBy.AccessibilityId("id/gno_greeting_text_view");

    public void enterLoginDetails() {
        WebElement userid = driver.waitfor(signIn);
        userid.click();
        driver.androidDriver().findElement(email).sendKeys("test@gmail.com");
        driver.androidDriver().findElement(continueButton).click();
        driver.androidDriver().findElement(password).sendKeys("password");
        driver.androidDriver().findElement(signIn).click();
    }

    public void checkUserLogin() {
        WebElement menu = driver.waitfor(burgerMenu);
        menu.click();
        WebElement homeElement = driver.waitfor(greetingText);
        assertThat(homeElement.getAttribute("text")).contains("test");
    }
}
