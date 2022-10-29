package com.cursor.pages;

import com.cursor.elements.Button;
import com.cursor.elements.Input;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.FindBy;

public class RozetkaMainPage extends BasePage {
    private static final Logger LOGGER = LogManager.getLogger(RozetkaMainPage.class);

    @FindBy(xpath = "//input")
    private Input searchBar;

    @FindBy(xpath = "//button[@class='button button_color_green button_size_medium search-form__submit ng-star-inserted']")
    private Button searchButton;

    public RozetkaMainPage clickOnSearchBar() {
        LOGGER.info("Click on SearchBar");
        searchBar.click();
        return this;
    }

    public RozetkaMainPage clearSearchBar() {
        LOGGER.info("Clear SearchBar");
        searchBar.clear();
        return this;
    }

    public RozetkaMainPage inputQueryToSearchBar(String text) {
        LOGGER.info("Send query '" + text + "' to searchBar");
        searchBar.sendKeys(text);
        return this;
    }

    public RozetkaMainPage pushSearchButton() {
        LOGGER.info("Click on search button and go to AllLaptopPage");

        searchButton.click();
        return this;
    }
}