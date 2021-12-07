package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {
    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }
}
