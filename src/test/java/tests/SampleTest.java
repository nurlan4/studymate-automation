package tests;

import org.testng.annotations.Test;
import pages.StudymateLoginPage;
import utilites.Config;
import utilites.Driver;

public class SampleTest {
    StudymateLoginPage studymateLoginPage = new StudymateLoginPage();
    @Test
    public void test1(){
        Driver.getDriver().get(Config.getValue("studymateUrl"));
        studymateLoginPage.studyMateLogIn();
    }
}
