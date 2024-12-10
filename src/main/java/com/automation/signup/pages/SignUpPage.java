package com.automation.signup.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
    WebDriver driver;

    @FindBy(id = "firstname") WebElement firstNameField;
    @FindBy(id = "lastname") WebElement lastNameField;
    @FindBy(id = "email_address") WebElement emailField;
    @FindBy(id = "password") WebElement passwordField;
    @FindBy(id = "password-confirmation") WebElement confirmPasswordField;
    @FindBy(xpath = "//button[@title='Create an Account']") WebElement createAccountButton;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
        confirmPasswordField.sendKeys(password);
    }

    public void clickCreateAccount() {
        createAccountButton.click();
    }
}

