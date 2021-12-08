package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computerTab;

    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement registerLink;

    public void clickOnRegisterLink(){
        Reporter.log("Click on Register Link : " +registerLink.toString() + "<br>");
       clickOnElement(registerLink);
    }
    public void clickOnComputerTab(){
        Reporter.log("Click on computer link : " +computerTab.toString() + "<br>");
        clickOnElement(computerTab);
    }
}
