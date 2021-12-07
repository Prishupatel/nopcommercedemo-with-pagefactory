package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.support.PageFactory;

public class BuildYourOwnComputerPage extends Utility {
    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver, this);
    }
}
