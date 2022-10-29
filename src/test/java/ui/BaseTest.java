package ui;

import com.cursor.BisnesObjects.AllLaptopPageBO;
import com.cursor.BisnesObjects.BasketPageBO;
import com.cursor.BisnesObjects.FirstLaptopHPPageBO;
import com.cursor.BisnesObjects.RozetkaMainPageBO;
import com.cursor.driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    public static WebDriver driver;
    RozetkaMainPageBO rozetkaMainPageBO;
    AllLaptopPageBO allLaptopPageBO;
    FirstLaptopHPPageBO firstLaptopHPPageBO;
    BasketPageBO basketPageBO;

    @BeforeClass
    public void setDriver() {
        DriverManager.createDriver();
        driver = DriverManager.getDriver();
    }

    @AfterClass
    public void quitDriver() {
        driver.quit();
    }
}