package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.StudymateAnnouncementsPage;
import pages.StudymateLoginPage;
import utilites.ApplicationFlow;
import utilites.Config;
import utilites.Driver;

public class AnnouncementTest {


    @BeforeMethod
    public void driver(){
        Driver.getDriver().get(Config.getValue("studymateUrl"));
    }
    @AfterMethod
    public void cleanUp(){
        Driver.quit();
    }

    @Test
    public void createAndCheckHappy() {
        Faker faker = new Faker();
        Actions actions = new Actions(Driver.getDriver());
        StudymateLoginPage studymateLoginPage = new StudymateLoginPage();
        StudymateAnnouncementsPage studymateAnnouncementsPage = new StudymateAnnouncementsPage();
        studymateLoginPage.usernameInput.sendKeys(Config.getValue("studymateUsername"));
        studymateLoginPage.passwordInput.sendKeys(Config.getValue("studymatePassword"));
        studymateLoginPage.loginBtn.click();
        studymateAnnouncementsPage.announcementPage.click();
        studymateAnnouncementsPage.addAnAnnouncement.click();
        String text = faker.name().fullName();
        studymateAnnouncementsPage.textForAnnouncement.sendKeys(text);
        studymateAnnouncementsPage.groupInput.click();
        ApplicationFlow.pause(500);
        studymateAnnouncementsPage.chooseGroup.click();
        studymateAnnouncementsPage.add.click();
        

    }
}
