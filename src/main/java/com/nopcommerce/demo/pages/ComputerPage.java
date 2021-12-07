package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage extends Utility {
    public ComputerPage() { PageFactory.initElements(driver, this);
    }
}
