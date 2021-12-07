package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlistners.CustomListeners;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;

@Listeners(CustomListeners.class)
public class LoginPageTest extends TestBase {
   LoginPage loginPage;

   @BeforeMethod
    public void inIt(){
       loginPage=new LoginPage();
   }

   @Test(dataProvider = "welcometologin", dataProviderClass = TestData.class)
   public void userShouldNavigateToLoginPageSuccessFully(String text){
       loginPage.clickOnLoginButton();
       loginPage.verifyWelcomeText(text);
   }
}
