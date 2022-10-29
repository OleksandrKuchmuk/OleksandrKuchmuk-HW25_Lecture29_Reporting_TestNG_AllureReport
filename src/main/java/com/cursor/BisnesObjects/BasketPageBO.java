package com.cursor.BisnesObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.cursor.pages.BasketPage;

public class BasketPageBO {
    private static final Logger LOGGER = LogManager.getLogger(BasketPageBO.class);
    private BasketPage basketPage;

    public BasketPageBO() {
        basketPage = new BasketPage();
    }

    public int getCountProductInBasket() throws InterruptedException {
        Thread.sleep(1000);
        return basketPage.getCountProductsInBasket();
    }

    public int getTotalPriceOfProductsInBasket() {
        return basketPage.getTotalPriceOfProductsInBasket();
    }
}
