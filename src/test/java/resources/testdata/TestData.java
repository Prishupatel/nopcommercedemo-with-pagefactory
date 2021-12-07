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
}



