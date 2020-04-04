import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;
import io.appium.java_client.MobileBy;
import io.cucumber.java.en.Given;
import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.loginPage;
import pages.searchPage;
import pages.cartPage;
import pages.checkOutPage;

public class MyStepdefs extends hooks {

    loginPage login = new loginPage();
    searchPage search = new searchPage();
    cartPage cart = new cartPage();
    checkOutPage checkOut = new checkOutPage();

    Given("^I login into amazon app$")
    public void iLoginIntoAmazonApp() {

        login.enterLoginDetails();
        login.checkUserLogin();
    }

    When("^I search for (.*)$")
    public void iSearchForItem(String itemName) {

        search.searchItem(itemName);
        search.validateSearchResults();
        search.selectItem();
    }

    And("I Add the item to cart")
    public void iAddTheItemToCart() {
        cart.validateCart();
        cart.proceedCheckout();
    }

    Then("I can checkout the item selected")
    public void iCanCheckoutTheItemSelected() {
        checkOut.selectAddress();
        checkOut.selectDelivery();
        checkOut.selectPayment();
        checkOut.selectPayment();
    }
}
