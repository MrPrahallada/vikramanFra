package com.epam.localgoods.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Path to your feature files
        glue = "stepDefinitions", // Package where step definitions are located
        plugin = {"pretty", "html:target/cucumber-reports"} // Report plugins
)
public class TestRunner {

}
