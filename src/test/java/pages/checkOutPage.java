package pages;

import common.baseDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class checkOutPage {

    private ExpectedConditions ExceptedConditions;
    baseDriver driver = new baseDriver();

    private By addressButton = MobileBy.AccessibilityId("a-autoid-0");
    private By freeDeliveryOption = MobileBy.AccessibilityId("order_0_ShippingSpeed_std-0");
    private By continueButton = MobileBy.partialLinkText("Continue");
    private By paymentSelection = MobileBy.AccessibilityId("pp-mo9SpE-53");
    private By placeYourOrderButton = MobileBy.partialLinkText("Place your order");

    public void selectAddress() {
        WebElement address = driver.waitfor(addressButton);
        address.click();
    }

    public void selectDelivery() {
        WebElement deliveryOption = driver.waitfor(freeDeliveryOption);
        deliveryOption.click();
        driver.androidDriver().findElement(continueButton).click();
    }

    public void selectPayment() {
        WebElement payMethod = driver.waitfor(paymentSelection);
        payMethod.click();
        driver.androidDriver().findElement(continueButton).click();
    }

    public void placeOrder() {
        WebElement placeOrder = driver.waitfor(placeYourOrderButton);
        placeOrder.click();
    }
}
