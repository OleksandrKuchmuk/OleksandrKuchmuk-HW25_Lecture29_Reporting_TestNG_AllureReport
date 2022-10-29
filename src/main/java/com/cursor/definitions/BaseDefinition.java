package com.cursor.definitions;


import com.cursor.BisnesObjects.AllLaptopPageBO;
import com.cursor.BisnesObjects.BasketPageBO;
import com.cursor.BisnesObjects.FirstLaptopHPPageBO;
import com.cursor.BisnesObjects.RozetkaMainPageBO;
import com.cursor.driver.DriverManager;
import com.cursor.pages.AllLaptopPage;
import com.cursor.pages.BasketPage;
import com.cursor.pages.FirstLaptopHPPage;
import com.cursor.pages.RozetkaMainPage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public abstract class BaseDefinition {
    RozetkaMainPageBO rozetkaMainPageBO;
    RozetkaMainPage rozetkaMainPage;
    AllLaptopPageBO allLaptopPageBO;
    AllLaptopPage allLaptopPage;
    FirstLaptopHPPageBO firstLaptopHPPageBO;
    FirstLaptopHPPage firstLaptopHPPage;
    BasketPageBO basketPageBO;
    BasketPage basketPage;

//    @Given("I am On Google search page")
//    public void iVisitGoogle(){
//        DriverManager.createDriver();
//        DriverManager.getDriver().get("https://www.google.com");
//    }
//
//    @When("I search for {string}")
//    public void searchFor(String query){
//        WebElement searchBar = DriverManager.getDriver().findElement(By.name("q"));
//        searchBar.sendKeys(query);
//        searchBar.submit();
//    }
//
//    @Then("the page title should start with {string}")
//    public void checkTitle(String titleStartsWith) throws InterruptedException {
//        Thread.sleep(2000);
//     Assert.assertTrue(DriverManager.getDriver().getTitle().startsWith(titleStartsWith));
//    }
//
//    @After()
//    public void closeBrowser(){
//        DriverManager.getDriver().quit();
//    }
//
//    @When("I search for Address:")
//    public void iSearchForAddress(String address) {
//        WebElement searchBar = DriverManager.getDriver().findElement(By.name("q"));
//        searchBar.sendKeys(address);
//        searchBar.submit();
//    }
//
//    @When("I search for color {string}")
//    public void iSearchForColor(String color) {
//        WebElement searchBar = DriverManager.getDriver().findElement(By.name("q"));
//        searchBar.sendKeys(color);
//        searchBar.submit();
//    }
}
