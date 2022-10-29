package com.cursor.definitions;

import com.cursor.BisnesObjects.AllLaptopPageBO;
import com.cursor.driver.DriverManager;
import com.cursor.pages.AllLaptopPage;
import com.cursor.pages.FirstLaptopHPPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.time.Duration;

public class FirstLaptopHPPageDefinition extends BaseDefinition {

    @Given("I am On Rozetka Laptop HP G8 page")
    public void iAmInLaptopHPG8Page(){
        DriverManager.createDriver();
        DriverManager.getDriver().get("https://rozetka.com.ua/ua/hp-4f8j6ea/p336304225/");
    }

    @When("I click on 'Buy' button")
    public void clickOnBuyButton() throws InterruptedException {
        firstLaptopHPPage = new FirstLaptopHPPage();
        firstLaptopHPPage.clickOnBuyButton();
    }

    @When("I click on 'To order' button")
    public void clickOnToOrderButton() throws InterruptedException {
        firstLaptopHPPage = new FirstLaptopHPPage();
       Thread.sleep(1500);
        firstLaptopHPPage.clickOnToOrderButtonInAlertWindow();
    }

}
