package com.test.mywebpages;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features/login.feature","src/test/resources/Features/GoogleSearch.feature"},
        plugin = {"pretty","json:target/cucumber/JsonReports/CucumberTest.json","html:target/cucumber/HtmlReports/HtmlReports.html"},
        monochrome = true,
        tags="@GoogleSearchTests"
)
public class CucumberTestRunner {


}
