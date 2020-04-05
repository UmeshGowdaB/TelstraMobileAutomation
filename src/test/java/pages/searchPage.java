package pages;

import common.baseDriver;
import helpers.appHelper;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.Arrays;
import static org.assertj.core.api.Assertions.assertThat;

public class searchPage {

    private ExpectedConditions ExceptedConditions;
    baseDriver driver = new baseDriver();
    appHelper helper = new appHelper();

    /***** Page Objects *****/
    private By searchBox = MobileBy.AccessibilityId("id/rs_search_src_text");
    private By itemName = MobileBy.partialLinkText("SAMSUNG 65");
    private By addTocartButton = MobileBy.AccessibilityId("add-to-cart-button");
    private By title = MobileBy.AccessibilityId("title_feature_div");

    /**** Page Methods ****/
    public void searchItem(String itemName) {
        WebElement searchField = driver.waitfor(searchBox);
        searchField.sendKeys(itemName);
    }

    public void validateSearchResults(String item) {
        assertThat(driver.androidDriver().findElement(itemName).getAttribute("text")).contains(item);
    }

    public void selectItem() {
        driver.androidDriver().perform(Arrays.asList(helper.scrollDown()));
        driver.androidDriver().findElement(itemName).click();
    }

    public void addToCart(String itemText) {
        WebElement itemName = driver.waitfor(title);
        assertThat(itemName.getAttribute("text")).contains(itemText);
        driver.androidDriver().findElement(addTocartButton).click();
    }
}
