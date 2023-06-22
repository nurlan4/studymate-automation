package tests;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
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
    public void driver() {
        Driver.getDriver().get(Config.getValue("studymateUrl"));
    }
    @AfterMethod
    public void cleanUp() {
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
        ApplicationFlow.pause(500);
        studymateAnnouncementsPage.textForAnnouncement.click();
        studymateAnnouncementsPage.textForAnnouncement.sendKeys(text);
        actions.moveToElement(studymateAnnouncementsPage.groupInput).click().perform();
        ApplicationFlow.pause(500);
        studymateAnnouncementsPage.chooseGroup.click();
        ApplicationFlow.pause(500);
        studymateAnnouncementsPage.add.click();
        ApplicationFlow.pause(500);
        System.out.println(studymateAnnouncementsPage.textAboutAnnouncement.getText());
        if (studymateAnnouncementsPage.textAboutAnnouncement.equals(text)) {
            Assert.assertEquals(studymateAnnouncementsPage.textAboutAnnouncement, text);
        } else {
            actions.moveToElement(studymateAnnouncementsPage.nextPage).perform();
            actions.click().perform();
        }
        String date  =studymateAnnouncementsPage.announcementByDate.getText();
        date = date.substring(0,2);
        System.out.println(date);
        studymateAnnouncementsPage.fromCalendaryBtn.click();
        WebElement element = Driver.getDriver().findElement(By.xpath("//button[.='"+date+"']"));
        element.click();
        studymateAnnouncementsPage.tillCalendaryBtn.click();
        studymateAnnouncementsPage.lastDayInCalendary.click();
        String currentData =studymateAnnouncementsPage.announcementByDate.getText();
        currentData =currentData.substring(0,2);
        Assert.assertEquals(date,currentData);
    }
}