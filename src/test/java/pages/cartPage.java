package pages;

import common.baseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class cartPage {

    private ExpectedConditions ExceptedConditions;
    baseDriver driver = new baseDriver();

    private String cartButton = "";
    private String subTotal = "";
    private String checkOutButton = "";

    public void validateCart() {
        WebElement cart = driver.waitfor(cartButton);
        cart.click();
    }

    public void proceedCheckout() {


    }
}
