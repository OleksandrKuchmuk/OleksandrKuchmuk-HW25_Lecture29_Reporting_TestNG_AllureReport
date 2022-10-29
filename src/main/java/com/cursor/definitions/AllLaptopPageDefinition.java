package com.cursor.definitions;

import com.cursor.BisnesObjects.AllLaptopPageBO;
import com.cursor.BisnesObjects.RozetkaMainPageBO;
import com.cursor.driver.DriverManager;
import com.cursor.pages.AllLaptopPage;
import com.cursor.pages.FirstLaptopHPPage;
import com.cursor.util.PropertyReader;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AllLaptopPageDefinition extends BaseDefinition{
    String titleOfFirstLaptopOnSortedLaptopPage = "";
    String titleOfChosenLaptop = "";

    @Given("I am On Rozetka Laptops page")
    public void iAmInRozetkaLaptopsPage(){
        DriverManager.createDriver();
        DriverManager.getDriver().get("https://rozetka.com.ua/ua/notebooks/c80004/");
    }

    @When("I choose first Laptop on page")
    public void chooseFirstLaptop() throws InterruptedException {
        allLaptopPageBO = new AllLaptopPageBO();
        allLaptopPageBO.chooseFirstHPLaptopOnPage();
//        Thread.sleep(1500);

    }

    @Then("the page title should be equals to title of first Laptop on sorted Laptops page")
    public void checkChosenLaptopTitle() throws InterruptedException {
        Thread.sleep(2000);
        titleOfChosenLaptop = DriverManager.getDriver().getTitle();
        System.out.println("titleOfChosenLaptop "+titleOfChosenLaptop);
        System.out.println("titleOfFirstLaptopOnSortedLaptopPage "+titleOfFirstLaptopOnSortedLaptopPage);
        Assert.assertTrue(titleOfChosenLaptop.contains(titleOfFirstLaptopOnSortedLaptopPage));
    }

    @When("I choose seller Rozetka and brand HP")
    public void iChooseSellerAndBrand() throws InterruptedException {
        allLaptopPageBO = new AllLaptopPageBO();
        allLaptopPageBO.chooseSellerRozetkaAndBrandHP();
    }

    @When("I choose 'From Higher To Lower price' in drop-down menu")
    public void iChooseFromHigherToLowerPrise() throws InterruptedException {
        allLaptopPageBO = new AllLaptopPageBO();
        allLaptopPageBO.selectSortingFromHighToLowPriseInDropDownMenu();
    }

    @Then("'From Higher to lower prise' should be selected")
    public void checkFromHigherToLowerPriseIsSelected(){
        AllLaptopPage allLaptopPage = new AllLaptopPage();
        Assert.assertTrue(allLaptopPage.isSelectedFromHighToLowPriceInDropDownMenu());
    }

    @After()
    public void closeBrowser(){
        DriverManager.getDriver().quit();
    }

    @When("I save title of first product on page")
    public void iSaveTitleOfFirstProductOnPage() throws InterruptedException {
        allLaptopPage = new AllLaptopPage();
        Thread.sleep(2000);
        titleOfFirstLaptopOnSortedLaptopPage = allLaptopPage.getFirstLaptopOnPageHp().getText();
    }
}
