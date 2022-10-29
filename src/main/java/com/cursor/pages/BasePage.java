package com.cursor.pages;

import com.cursor.driver.DriverManager;
import com.cursor.elements.Decorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(new Decorator(new DefaultElementLocatorFactory(DriverManager.getDriver())), this);
    }
}