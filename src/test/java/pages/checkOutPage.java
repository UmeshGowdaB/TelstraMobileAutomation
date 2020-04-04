package pages;

import common.baseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class checkOutPage {

    private ExpectedConditions ExceptedConditions;
    baseDriver driver = new baseDriver();

    private String addressButton = "";
    private String deliveryOption = "";
    private String continueButton = "";
    private String paymentSelection = "";
    private String placeYourOrderButton = "";

    public void selectAddress() {
        WebElement address = driver.waitfor(addressButton);
        address.click();

    }

    public void selectDelivery() {

    }

    public void selectPayment() {

    }

    public void placeOrder() {

    }
}
