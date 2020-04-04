import io.appium.java_client.MobileBy;
import io.cucumber.java.en.Given;
import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.loginPage;
import pages.searchPage;
import pages.cartPage;
import pages.checkOutPage;

public class MyStepdefs extends hooks{

    loginPage login = new loginPage();
    searchPage search = new searchPage();

    Given("I login into amazon app")
    public void iLoginIntoAmazonApp() {

            login.enterLoginDetails();
            login.checkUserLogin();
    }

    When("I search for item")
    public void iSearchForItem() {

    }

    And("I Add the item to cart")
    public void iAddTheItemToCart() {

    }

    Then("I can checkout the item selected")
    public void iCanCheckoutTheItemSelected() {
    }
}
