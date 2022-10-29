package com.cursor.pages;

import com.cursor.elements.FieldWithData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.FindBy;

public class BasketPage extends BasePage {
    private static final Logger LOGGER = LogManager.getLogger(BasketPage.class);

    @FindBy(xpath = "//dl[@class='checkout-total__row js-goods-info']/dt")
    private FieldWithData countProductsInBasket;

    @FindBy(xpath = "//dd[@class='checkout-total__value checkout-total__value_size_large']")
    private FieldWithData totalPriseIfProductsInBasket;

    public int getCountProductsInBasket() {
        LOGGER.info("Getting count products in Basket");
        return takeIntFromString(countProductsInBasket.getText(), 1);
    }

    public int getTotalPriceOfProductsInBasket() {
        LOGGER.info("Getting total price from basket");
        return takeIntFromString(totalPriseIfProductsInBasket.getText(), 2);
    }

    //this method make split of string and returns 'digitGroupCounter' values of array(integer number)
    // if you have '125 362 dfr' than you choose  'digitGroupCounter' = 2
    private int takeIntFromString(String str, int digitGroupCounter) {
        LOGGER.info("Method to take integer number from string");
        String[] words = str.split(" ");
        String finalString = "";
        for (int i = 0; i < digitGroupCounter; i++) {
            finalString += words[i];
        }
        return Integer.parseInt(finalString);
    }
}