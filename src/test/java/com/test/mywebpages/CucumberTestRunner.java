package com.test.mywebpages;

import com.vimalselvam.cucumber.listener.Reporter;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;


import java.io.File;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features/login.feature","src/test/resources/Features/GoogleSearch.feature"},
        plugin = {"pretty","json:target/cucumber/JsonReports/CucumberTest.json","html:target/cucumber/HtmlReports/HtmlReports.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true,
        tags="@GoogleSearchTests"
)
public class CucumberTestRunner {
   /* @AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
        Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        Reporter.setSystemInfo("Machine", 	"Windows 10" + "64 Bit");
        Reporter.setSystemInfo("Selenium", "3.7.0");
        Reporter.setSystemInfo("Maven", "3.5.2");
        Reporter.setSystemInfo("Java Version", "1.8.0_151");
    }*/

}
