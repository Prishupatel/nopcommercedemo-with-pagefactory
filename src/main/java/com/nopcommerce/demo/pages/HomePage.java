package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }
}
