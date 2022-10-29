package com.cursor.BisnesObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.cursor.pages.RozetkaMainPage;

public class RozetkaMainPageBO {
    private static final Logger LOGGER = LogManager.getLogger(RozetkaMainPage.class);
    private RozetkaMainPage rozetkaMainPage;

    public RozetkaMainPageBO(){
        rozetkaMainPage = new RozetkaMainPage();
    }

    public void clickOnSearchBarAndEnterQueryAndPressSearchButton(String value){
        rozetkaMainPage
                .clickOnSearchBar()
                .clearSearchBar()
                .inputQueryToSearchBar(value)
                .pushSearchButton();
    }
}
