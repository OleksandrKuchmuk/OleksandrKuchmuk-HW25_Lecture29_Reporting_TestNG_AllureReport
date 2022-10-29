package com.cursor.BisnesObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.cursor.pages.FirstLaptopHPPage;

public class FirstLaptopHPPageBO {
    private static final Logger LOGGER = LogManager.getLogger(FirstLaptopHPPageBO.class);
    private FirstLaptopHPPage firstLaptopHPPage;

    public FirstLaptopHPPageBO() {
        firstLaptopHPPage = new FirstLaptopHPPage();
    }

    public void clickOnBuyButtonAndClickToOrderButtonNewWindow() throws InterruptedException {
        Thread.sleep(1000);
        firstLaptopHPPage.clickOnBuyButton();
        Thread.sleep(1000);
        firstLaptopHPPage.clickOnToOrderButtonInAlertWindow();
    }
}
