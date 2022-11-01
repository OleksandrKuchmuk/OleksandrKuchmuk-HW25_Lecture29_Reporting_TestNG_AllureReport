package ui;

import com.cursor.BisnesObjects.AllLaptopPageBO;
import com.cursor.BisnesObjects.BasketPageBO;
import com.cursor.BisnesObjects.FirstLaptopHPPageBO;
import com.cursor.BisnesObjects.RozetkaMainPageBO;
import com.cursor.driver.AllureListener;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.cursor.util.PropertyReader;

@Listeners(AllureListener.class)
@Epic("Regression")
@Feature("Search feature")
public class RozetkaTest extends BaseTest {
    private static final Logger LOGGER = LogManager.getLogger(RozetkaTest.class);

    @Step("Test to Find the most expensive Laptop HP and check the price lass than 20000")
    @Test
    public void hpAddToBasketAndCheckPriceTest() throws InterruptedException {
        LOGGER.info("Start Test");
        driver.get(PropertyReader.getValue("url"));

        rozetkaMainPageBO = new RozetkaMainPageBO();
        rozetkaMainPageBO.clickOnSearchBarAndEnterQueryAndPressSearchButton("Laptop");


        allLaptopPageBO = new AllLaptopPageBO();
        allLaptopPageBO.chooseSellerRozetkaAndBrandHP();
        allLaptopPageBO.selectSortingFromHighToLowPriseInDropDownMenu();
        allLaptopPageBO.chooseFirstHPLaptopOnPage();

        firstLaptopHPPageBO = new FirstLaptopHPPageBO();
        firstLaptopHPPageBO.clickOnBuyButtonAndClickToOrderButtonNewWindow();

        basketPageBO = new BasketPageBO();

        Assert.assertEquals(basketPageBO.getCountProductInBasket(), 1);
        Assert.assertTrue(basketPageBO.getTotalPriceOfProductsInBasket() < 200000);

    }

    @Step("Check if 'RoZeTka' equals ignore case 'rozetka'")
    @Test
    public void rozetkaEqualsRoZeTka(){
        Assert.assertTrue("RoZeTka".equalsIgnoreCase("rozetka"), "'RoZeTka' not equals 'rozetka'");
    }

    @Step("check if 5*5 equals 25")
    @Test
    public void comarizon(){
        Assert.assertEquals(5*5, 25, "5*5 not equals 25");
    }

}