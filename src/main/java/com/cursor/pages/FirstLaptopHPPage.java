package com.cursor.pages;

import com.cursor.driver.DriverManager;
import com.cursor.elements.Button;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class FirstLaptopHPPage extends BasePage {
    private static final Logger LOGGER = LogManager.getLogger(FirstLaptopHPPage.class);

    @FindBy(xpath = "//span[@class='buy-button__label ng-star-inserted']")
    private Button buyButton;

    @FindBy(xpath = "//a[@data-testid='cart-receipt-submit-order']")
    private Button toOrderButtonOnAlertWindow;

    public FirstLaptopHPPage clickOnBuyButton() {
        LOGGER.info("Clicking on 'Buy' button");
        DriverManager.getDriver().findElement(By.xpath("//a[@class='tabs__link tabs__link--active']")).click();
        buyButton.click();
        return this;
    }

    public FirstLaptopHPPage clickOnToOrderButtonInAlertWindow() {
        LOGGER.info("Clicking on 'To order' button");
        toOrderButtonOnAlertWindow.click();
        return this;
    }
}