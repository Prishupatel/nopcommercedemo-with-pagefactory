package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlistners.CustomListeners;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import resources.testdata.TestData;

@Listeners(CustomListeners.class)
public class LoginPageTest extends TestBase {
    LoginPage loginPage;

    @BeforeMethod(groups = {"smoke", "sanity","regression"},alwaysRun = true)
    public void inIt() {
        loginPage = new LoginPage();
    }

    @Test(groups = "smoke", dataProvider = "welcometologin", dataProviderClass = TestData.class)
    public void userShouldNavigateToLoginPageSuccessFully(String text) {
        loginPage.clickOnLoginButton();
        loginPage.verifyWelcomeText(text);
    }

    @Test(groups = "sanity")
    @Parameters({"email", "password"})          //data will be provided by xml(sanity) file. run xml
    public void verifyTheErrorMessageWithInValidCredentials(String email, String password) {
        loginPage.clickOnLoginButton();
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickOnLogin();
        loginPage.verifyErrorMessage();
    }

    @Test(groups = "sanity")
    @Parameters({"cemail", "cpassword"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials(String temail, String tpassword) {
        loginPage.clickOnLoginButton();
        loginPage.enterEmail(temail);
        loginPage.enterPassword(tpassword);
        loginPage.clickOnLogin();
        loginPage.verifyLogOutOption();
    }

    @Test(groups = "regression")
    @Parameters({"cemail", "cpassword"})
    public void  VerifyThatUserShouldLogOutSuccessFully(String temail, String tpassword){
        loginPage.clickOnLoginButton();
        loginPage.enterEmail(temail);
        loginPage.enterPassword(tpassword);
        loginPage.clickOnLogin();
        loginPage.clickOnlogOutButton();
    }

}
