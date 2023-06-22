package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.StudymateAnnouncementsPage;
import pages.StudymateLoginPage;
import utilites.ApplicationFlow;
import utilites.Config;
import utilites.Driver;


public class AdminAnnouncements {

    StudymateLoginPage studymateLoginPage ;
        StudymateAnnouncementsPage announcementsPage ;
      @BeforeMethod
      public void before(){
          studymateLoginPage = new StudymateLoginPage();
          announcementsPage = new StudymateAnnouncementsPage();
      }
@AfterMethod
public void quit(){Driver.quit();}

    @Test
    public void createAnnouncement(){
        Driver.getDriver().get(Config.getValue("studymateUrl"));
        studymateLoginPage.usernameInput.sendKeys(Config.getValue("studymateUsername"));
        studymateLoginPage.passwordInput.sendKeys(Config.getValue("studymatePassword"));
        studymateLoginPage.loginBtn.click();
        ApplicationFlow.pause(1000);
        studymateLoginPage.menuOptions.get(5).click();
        announcementsPage.addAnnouncementBtn.click();
        String announcement = "Batch-2 is the Best!";
        announcementsPage.textOfAnnouncementInput.sendKeys(announcement);
        ApplicationFlow.pause(2000);
        announcementsPage.groupInput.click();
        Driver.getDriver().findElement(By.xpath("//ul/li[@role='option'][1]")).click();
        ApplicationFlow.pause(1000);
        announcementsPage.addInput.click();
        String actualText = String.valueOf(Driver.getDriver().findElement(By.xpath("//p[2]")).getText());
        Assert.assertEquals(actualText, announcement);

        }

    @Test
    public void editAnnouncement(){
        Driver.getDriver().get(Config.getValue("studymateUrl"));
        studymateLoginPage.usernameInput.sendKeys(Config.getValue("studymateUsername"));
        studymateLoginPage.passwordInput.sendKeys(Config.getValue("studymatePassword"));
        studymateLoginPage.loginBtn.click();
        ApplicationFlow.pause(1000);
        studymateLoginPage.menuOptions.get(5).click();
        announcementsPage.addAnnouncementBtn.click();
        String announcement = "Batch-2 is the Best!";
        announcementsPage.textOfAnnouncementInput.sendKeys(announcement);
        ApplicationFlow.pause(2000);
        announcementsPage.groupInput.click();
        Driver.getDriver().findElement(By.xpath("//ul/li[@role='option'][1]")).click();
        ApplicationFlow.pause(1000);
        announcementsPage.addInput.click();
        ApplicationFlow.pause(1000);
        announcementsPage.threeDotBtn.click();
        Driver.getDriver().findElement(By.xpath(".//li[@role='menuitem']")).click();
        announcementsPage.textOfAnnouncementInput.sendKeys(announcement + "And the greatest");
        announcementsPage.saveBtn.click();


        }



    public void editAnnouncementNegative(){
        // Login using Config

    }

}
