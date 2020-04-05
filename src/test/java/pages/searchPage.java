package pages;

import common.baseDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class searchPage {

    private ExpectedConditions ExceptedConditions;
    baseDriver driver = new baseDriver();

    private String searchBox = "id/rs_search_src_text";


    public void searchItem(String itemName) {
        WebElement searchField = driver.waitfor(searchBox);
        searchField.sendKeys(itemName);
    }

    public void validateSearchResults() {


    }

    public void selectItem() {

    }

}
