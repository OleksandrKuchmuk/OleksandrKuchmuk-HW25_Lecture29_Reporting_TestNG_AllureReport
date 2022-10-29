package com.cursor.definitions;

import com.cursor.BisnesObjects.BasketPageBO;
import com.cursor.driver.DriverManager;
import com.cursor.pages.BasketPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.index.qual.LessThan;
import org.testng.Assert;

public class BasketPageDefinition extends BaseDefinition{
    int countProductsInBasket;
    int totalPriseOfProductsInBasket;

    @Given("I am On Rozetka Basket page")
    public void iAmInRozetkaBasketPage(){
        DriverManager.createDriver();
        DriverManager.getDriver().get("https://rozetka.com.ua/ua/checkout/");
    }

    @When("I take count products in Basket")
    public void ITakeCountProductsInBasket() throws InterruptedException {
        basketPageBO = new BasketPageBO();
        Thread.sleep(2000);
        countProductsInBasket = basketPageBO.getCountProductInBasket();
    }

    @When("I take total prise of products in Basket")
    public void ITakeTotalPriseProductsInBasket() throws InterruptedException {
        basketPageBO = new BasketPageBO();
        Thread.sleep(2000);
        totalPriseOfProductsInBasket = basketPageBO.getTotalPriceOfProductsInBasket();
    }

    @Then("^I check that count products in basket is (\\d+)$")
    public void checkTakeCountProductsInBasket(int count) throws InterruptedException {
//        Thread.sleep(2000);
        Assert.assertTrue(countProductsInBasket == count);
    }

    @Then("I check that total prise of products in basket less than {int}")
    public void checkTotalPriseProductsInBasket(int price) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(totalPriseOfProductsInBasket < price);
    }
}
