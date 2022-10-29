package com.cursor.definitions;

import com.cursor.BisnesObjects.RozetkaMainPageBO;
import com.cursor.driver.DriverManager;
import com.cursor.util.PropertyReader;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RozetkaMainPageDefinition extends BaseDefinition {


    @Given("I am On Rozetka main page")
    public void iAmInRozetkaMainPage() {
        DriverManager.createDriver();
        DriverManager.getDriver().get((PropertyReader.getValue("url")));
    }

    @When("I search for {string}")
    public void searchFor(String query) throws InterruptedException {
        rozetkaMainPageBO = new RozetkaMainPageBO();
        rozetkaMainPageBO.clickOnSearchBarAndEnterQueryAndPressSearchButton(query);
    }

    @Then("the page title should start with {string}")
    public void checkTitle(String titleStartsWith) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(DriverManager.getDriver().getTitle().startsWith(titleStartsWith));
    }

//    @When("I choose seller Rozetka and brand HP")
//    public void iChooseSellerAndBrand() throws InterruptedException {
//        allLaptopPageBO = new AllLaptopPageBO();
//        allLaptopPageBO.chooseSellerRozetkaAndBrandHP();
//    }
//
//    @When("I choose 'From Higher To Lower price' in drop-down menu")
//    public void iChooseFromHigherToLowerPrise() throws InterruptedException {
//       allLaptopPageBO = new AllLaptopPageBO();
//       allLaptopPageBO.selectSortingFromHighToLowPriseInDropDownMenu();
//    }
//
//    @Then("'From Higher to lower prise' should be selected")
//    public void checkFromHigherToLowerPriseIsSelected(){
//        AllLaptopPage allLaptopPage = new AllLaptopPage();
//       Assert.assertTrue(allLaptopPage.isSelectedFromHighToLowPriceInDropDownMenu());
//    }

    @After()
    public void closeBrowser() {
        DriverManager.getDriver().quit();
    }
}
