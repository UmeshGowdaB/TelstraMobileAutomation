package pages;

import common.baseDriver;
import io.appium.java_client.MobileBy;
import jdk.internal.vm.compiler.word.Pointer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Interaction;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Arrays;
import helpers.appHelper;

public class searchPage {

    private ExpectedConditions ExceptedConditions;
    baseDriver driver = new baseDriver();
    appHelper helper = new appHelper();

    private By searchBox = MobileBy.AccessibilityId("id/rs_search_src_text");


    public void searchItem(String itemName) {
        WebElement searchField = driver.waitfor(searchBox);
        searchField.sendKeys(itemName);
    }

    public void validateSearchResults() {


    }

    public void selectItem() {

        driver.androidDriver().perform(Arrays.asList(helper.scrollDown()));
        driver.androidDriver()

    }

}
