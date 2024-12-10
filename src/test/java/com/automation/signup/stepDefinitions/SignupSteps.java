package com.automation.signup.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.automation.signup.pages.SignUpPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignupSteps {
    WebDriver driver;
    SignUpPage signUpPage;

    @Given("I am on the signup page")
    public void iAmOnTheSignupPage() {
        driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
        signUpPage = new SignUpPage(driver);
    }

    @When("I enter valid details")
    public void iEnterValidDetails() {
        signUpPage.enterFirstName("John");
        signUpPage.enterLastName("Doe");
        signUpPage.enterEmail("john.doe@example.com");
        signUpPage.enterPassword("Password123");
    }

    @And("I submit the signup form")
    public void iSubmitTheSignupForm() {
        signUpPage.clickCreateAccount();
    }

    @Then("I should see a welcome message")
    public void iShouldSeeAWelcomeMessage() {
        Assert.assertTrue(driver.getPageSource().contains("Thank you for registering"));
        driver.quit();
    }
}
