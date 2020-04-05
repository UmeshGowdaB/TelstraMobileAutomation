package pages;

import common.baseDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.assertj.core.api.Assertions.assertThat;

public class cartPage {

    private ExpectedConditions ExceptedConditions;
    baseDriver driver = new baseDriver();

    private By cartButton = MobileBy.AccessibilityId("id/chrome_action_bar_cart");
    private By cartItem = MobileBy.AccessibilityId("id/chrome_checkout_item");
    private By proceedCheckOut = MobileBy.partialLinkText("Proceed tp Checkout");

    public void validateCart(String itemText) {
        driver.androidDriver().findElement(cartButton).click();
        WebElement itemName = driver.waitfor(cartItem);
        assertThat(itemName.getAttribute("text")).contains(itemText);
    }

    public void proceedCheckout() {
        driver.androidDriver().findElement(proceedCheckOut).click();
    }
}
