package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class LoginPage extends Utility {
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @FindBy(id = "Email")
    WebElement emailField;

    @FindBy(name = "Password")
    WebElement passwordField;

    @FindBy(xpath = "//a[@class='ico-login']")
    WebElement loginButton;

    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement logIn;

    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement textLogout;

    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logOutButton;

    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logOutOption;

    public void clickOnLoginButton() {
        Reporter.log("Clicking the login button : " + loginButton.toString() + "<br>");
        clickOnElement(loginButton);
    }

    public String verifyWelcomeText(String text) {
        Reporter.log("verifying the welcome message : " + welcomeText.toString() + "<br>");
        return getTextFromElement(welcomeText);
    }

    public void enterEmail(String email) {
        Reporter.log("Entering the email : " + emailField.toString() + "<br>");
        sendTextToElement(emailField, email);

    }

    public void enterPassword(String pass) {
        Reporter.log("Entering the password : " + passwordField.toString() + "<br>");
        sendTextToElement(passwordField, pass);

    }

    public void clickOnlogOutButton() {
        Reporter.log("clicking on the logoput button " + logOutButton.toString() + "<br>");
        clickOnElement(logOutButton);
    }
    public void clickOnLogin(){
        Reporter.log("Clicking the login button : " + logIn.toString() + "<br>");
        clickOnElement(logIn);
    }

    public void verifyErrorMessage() {

        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";
        String actualErrorMessage = getTextFromElement(errorMessage);
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message not displayed");
    }

    public void verifyLogOutOption() {
        Reporter.log("verifying the Log out Option: " + logOutOption.toString() + "<br>");
        verifyMessage(logOutOption,"Log out","Log out button not displayed");

    }


}
