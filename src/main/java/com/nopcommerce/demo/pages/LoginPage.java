package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement textLogout;

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

    public String verifyWelcomeText(String text){
        return getTextFromElement(welcomeText);
    }


}
