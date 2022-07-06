package com.test.mywebpages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MyWebTestStepdefs {

    WebDriver driver = null;

    @Given("user is able to access the login page")
    public void verifyLoginPage() {
        // Write code here that turns the phrase above into concrete actions

        System.out.println("Code execution in side Given clause");
    }
    @When("user enters the {string} and {string}")
    public void userEntersTheUsernameAndPassword(String username,String password) {
        System.out.println("Code execution in side When clause with parameters");
        System.out.println();

    }
    @And("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Code execution in side And clause");
    }
    @Then("user should be able to navigate to login page")
    public void user_should_be_able_to_navigate_to_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Code execution in side then clause");
    }


    @Given("Browser is open")
    public void browserIsOpen() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));




    }

    @And("user is on Google search page")
    public void userIsOnGoogleSearchPage() {
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();


    }

    @When("user enters a text in google search box")
    public void userEntersATextInGoogleSearchBox() {
        driver.findElement(By.cssSelector("input[title='Search']")).sendKeys("Barclays share price");
    }

    @And("hits the enter")
    public void hitsTheEnter() {
        driver.findElement(By.cssSelector("input[value='Google Search']")).click();
    }

    @Then("many results are displayed")
    public void manyResultsAreDisplayed() {
    }
}
