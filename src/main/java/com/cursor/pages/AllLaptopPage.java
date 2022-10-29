package com.cursor.pages;

import com.cursor.elements.CheckBox;
import com.cursor.elements.DropDownMenu;
import com.cursor.elements.Product;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.FindBy;

public class AllLaptopPage extends BasePage {
    private static final Logger LOGGER = LogManager.getLogger(AllLaptopPage.class);


    @FindBy(xpath = "//select")
    private DropDownMenu sortingDropDownMenu;

    @FindBy(xpath = "//select/option[@value='2: expensive']")
    private DropDownMenu selectFromHighToLowPriceInSortingDropDownMenu;

    @FindBy(xpath = "//a[@data-id='Rozetka']")
    private CheckBox sellerRozetkaCheckBox;

    @FindBy(xpath = "//a[@class='checkbox-filter__link' and @ data-id='HP']")
    private CheckBox checkBoxHP;

    @FindBy(xpath = "//span[@class='goods-tile__title'][1]")
    private Product firstLaptopOnPageHp;


    public AllLaptopPage clickOnSortingDropDownMenu() {
        LOGGER.info("Click on sorting drop-down menu");
        sortingDropDownMenu.click();
        return this;
    }

    public AllLaptopPage selectFromHighToLowPriceInSortingDropDownMenu() {
        LOGGER.info("Select 'From Higher to Lower Price' in sorting drop-down menu");
        selectFromHighToLowPriceInSortingDropDownMenu.click();
        return this;
    }

    public AllLaptopPage chooseSellerRozetka() {
        LOGGER.info("Choose seller 'Rozetka' in left side sorting menu");
        sellerRozetkaCheckBox.click();
        return this;
    }

    public AllLaptopPage chooseCheckBoxHP() {
        LOGGER.info("Choose brand 'HP' in left side sorting menu");
        checkBoxHP.click();
        return this;
    }

    public Product getFirstLaptopOnPageHp() {
        return firstLaptopOnPageHp;
    }

    public AllLaptopPage chooseFirstHPLaptop() {
        LOGGER.info("Choose first laptop on page after sorting");
        firstLaptopOnPageHp.click();
        return this;
    }

    public boolean isSelectedFromHighToLowPriceInDropDownMenu(){
        return selectFromHighToLowPriceInSortingDropDownMenu.isSelected();
    }
}