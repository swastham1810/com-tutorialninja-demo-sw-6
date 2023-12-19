package com.tutorialninja.demo.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/tutorialninja/demo/steps",
        plugin = {"html:target/cucumber-reports/cucumber.html",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags = "@Sanity"

)
public class SanityCukeTest extends AbstractTestNGCucumberTests {


}
