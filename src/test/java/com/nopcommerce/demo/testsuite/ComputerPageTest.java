package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlistners.CustomListeners;
import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;

@Listeners({CustomListeners.class,})
public class ComputerPageTest extends TestBase {

    HomePage homePage;
    ComputerPage computerPage;
    DesktopPage desktopPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;
    RegisterPage registerPage;
    LoginPage loginPage;

    @BeforeMethod(groups = {"compregression"}, alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        desktopPage = new DesktopPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
        computerPage = new ComputerPage();
        registerPage = new RegisterPage();
        loginPage = new LoginPage();
    }


    @Test
    public void verifyUserShouldNavigateToComputerPageSuccessfully() throws InterruptedException {
        homePage.clickOnComputerTab();
        Thread.sleep(1000);
        computerPage.verifyComputerPage("Computers");
    }

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() throws InterruptedException {
        homePage.clickOnComputerTab();
        homePage.clickOnComputerTab();
        Thread.sleep(1000);
        computerPage.clickOnDesktop();
        desktopPage.verifyDesktopPage("Desktops");

    }

    @Test(groups = {"compregression"}, dataProvider = "features", dataProviderClass = TestData.class)
    public void verifyThatUserShouldBuildYouOwn(String processer, String ram, String hdd, String os, String software, String msg) throws InterruptedException {
        homePage.clickOnComputerTab();

        computerPage.clickOnDesktop();

        desktopPage.clickOnBuildYourOwnComputer();
        Thread.sleep(1000);
        buildYourOwnComputerPage.selectProcessor(processer);
        Thread.sleep(1000);
        buildYourOwnComputerPage.selectRAM(ram);
        Thread.sleep(1000);
        buildYourOwnComputerPage.selectHDD(hdd);
        Thread.sleep(1000);
        buildYourOwnComputerPage.selectOS(os);
        Thread.sleep(1000);
        buildYourOwnComputerPage.selectSoftware(software);
        Thread.sleep(1000);
        buildYourOwnComputerPage.clickOnAddToCart();
        Thread.sleep(1000);
        buildYourOwnComputerPage.verifyProductAddedToCart(msg);
        Thread.sleep(1000);
    }


}
