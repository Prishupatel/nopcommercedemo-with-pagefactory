package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.support.PageFactory;

public class DesktopPage extends Utility {
    public DesktopPage() {
        PageFactory.initElements(driver, this);
    }
}
