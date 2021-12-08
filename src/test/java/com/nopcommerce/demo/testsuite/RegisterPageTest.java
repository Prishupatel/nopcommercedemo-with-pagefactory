package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlistners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;

@Listeners(CustomListeners.class)
public class RegisterPageTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        registerPage = new RegisterPage();
    }
    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessFully(){
        homePage.clickOnRegisterLink();
        registerPage.gettextRegistertext();
        registerPage.verifyRegisterText();

    }
    @Test
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory(){
        homePage.clickOnRegisterLink();
        registerPage.clickOnRegisterButton();
        registerPage.verifyTheErrorMessageFirstNameIsRequired();
        registerPage.verifyTheErrorMessageLastNameIsRequired();
        registerPage.verifyTheErrorMessageLastNameIsRequired();
        registerPage.verifyTheErrorMessagePasswordIsRequired();
        registerPage.verifyTheErrorMessageForConfirmPasswordIsRequired();

    }
    @Test(dataProvider = "registeruser", dataProviderClass = TestData.class)
    public void verifyThatUserShouldCreateAccountSuccessfully(String gen,String name,String surName,String day,String mon,String year,String mail,String pass,String cpass,String msg){
        homePage.clickOnRegisterLink();
        registerPage.selectGender(gen);
        registerPage.enterFirstName(name);
        registerPage.enterLastName(surName);
        registerPage.selectBirthDay(day);
        registerPage.selectBirthMonth(mon);
        registerPage.selectBirthYear(year);
        registerPage.enterEmail(mail);
        registerPage.enterPassword(pass);
        registerPage.enterConfirmPassword(cpass);
        registerPage.clickOnRegisterButton();
        registerPage.verifyRegistrationComplete(msg);
    }














}
