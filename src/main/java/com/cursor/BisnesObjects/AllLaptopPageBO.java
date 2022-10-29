package com.cursor.BisnesObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.cursor.pages.AllLaptopPage;

public class AllLaptopPageBO {
    private static final Logger LOGGER = LogManager.getLogger(AllLaptopPageBO.class);
    private AllLaptopPage allLaptopPage;

    public AllLaptopPageBO() {
        allLaptopPage = new AllLaptopPage();
    }

    public void chooseSellerRozetkaAndBrandHP() throws InterruptedException {
        LOGGER.info("start choosing Seller Rozetka And Brand HP in left sorting menu");
        Thread.sleep(2500);
        allLaptopPage.chooseSellerRozetka();
        Thread.sleep(2000);
        allLaptopPage.chooseCheckBoxHP();
    }

    public void selectSortingFromHighToLowPriseInDropDownMenu() throws InterruptedException {
        LOGGER.info("Select sorting from high to low prise in drop-down menu");
        allLaptopPage
                .clickOnSortingDropDownMenu()
                .selectFromHighToLowPriceInSortingDropDownMenu();
    }

    public void chooseFirstHPLaptopOnPage() throws InterruptedException {
        Thread.sleep(2000);
        allLaptopPage.chooseFirstHPLaptop();
    }
}
