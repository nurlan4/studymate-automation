package tests;

import org.testng.annotations.Test;
import utilites.Driver;

public class FirstTest {
    @Test
    public void test1(){
        Driver.getDriver().get("https://google.com");
        Driver.getDriver().quit();
    }
}
