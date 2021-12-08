package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "welcometologin")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"Welcome, Please Sign In!"},

        };
        return data;
    }

    @DataProvider(name = "registeruser")
    public Object[][] info() {
        Object[][] data = new Object[][]{
                {"male", "Kishan", "Patel", "9", "12", "1995", "primeQa11@gmail.com", "Prime@9988", "Prime@9988", "Register"},

        };
        return data;
    }

    @DataProvider(name = "features")
    public Object[][] config() {
        Object[][] data = new Object[][]{
                {"2.2 GHz Intel Pentium Dual-Core E2200", "2 GB", "320 GB", "Vista Home [+$50.00]", "Microsoft Office [+$50.00]","The product has been added to your shopping cart"},
                {"2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]","4GB [+$20.00]","400 GB [+$100.00]","Vista Premium [+$60.00]","Acrobat Reader [+$10.00]","The product has been added to your shopping cart"},
                {"2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]", "8GB [+$60.00]", "320 GB", "Vista Home [+$50.00]", "Total Commander [+$5.00]","The product has been added to your shopping cart"}

        };
        return data;
    }
}



