package com.cursor.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.cursor.util.PropertyReader;

import java.time.Duration;

public class DriverManager {
    private static WebDriver driver;

    public static void createDriver() {
        System.setProperty(PropertyReader.getValue("name"), PropertyReader.getValue("driverPath"));
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(Long.parseLong(PropertyReader.getValue("timeout"))));
        driver.manage().window().maximize();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
