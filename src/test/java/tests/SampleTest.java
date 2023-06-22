package tests;

import org.testng.annotations.Test;
import pages.StudymateLoginPage;
import pages.StudymateTrashPage;
import utilites.Config;
import utilites.Driver;

public class SampleTest {
    StudymateLoginPage studymateLoginPage = new StudymateLoginPage();
    StudymateTrashPage studymateTrashPage = new StudymateTrashPage();
    @Test
    public void test1(){
        Driver.getDriver().get(Config.getValue("studymateUrl"));
        studymateLoginPage.studyMateLogIn();
        System.out.println(studymateTrashPage.numberOfItemsGroups.getText());
    }
}
