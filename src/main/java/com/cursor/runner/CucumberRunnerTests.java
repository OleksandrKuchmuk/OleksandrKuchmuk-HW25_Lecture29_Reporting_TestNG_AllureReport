package com.cursor.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions( features = {"src/test/resources/features"}, glue = {"com.cursor.definitions"},
        plugin = {"json:target/cucumber.json", "pretty", "html:target/cucumber-reports.html"})
public class CucumberRunnerTests extends AbstractTestNGCucumberTests {

}
