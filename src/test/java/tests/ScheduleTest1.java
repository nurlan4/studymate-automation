package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.StudymateLoginPage;
import pages.StudymateSchedulePage;
import utilites.ApplicationFlow;
import utilites.Config;
import utilites.Driver;

public class ScheduleTest1 {


    @BeforeMethod
    private void setup(){
        Driver.getDriver().get(Config.getValue("studymateUrl"));
    }

    @AfterMethod
    private void cleanUp(){
         Driver.quit();
    }



    @Test
    public void positiveTest(){
        StudymateLoginPage studymateLoginPage = new StudymateLoginPage();
        StudymateSchedulePage studymateSchedulePage = new StudymateSchedulePage();
        studymateLoginPage.usernameInput.sendKeys(Config.getValue("studymateUsername"));
        studymateLoginPage.passwordInput.sendKeys(Config.getValue("studymatePassword"));
        studymateLoginPage.loginBtn.click();
        ApplicationFlow.pause(2000);
        studymateLoginPage.menuOptions.get(7).click();
        studymateSchedulePage.createEventBtn.click();
        studymateSchedulePage.scheduleBtn.click();
        ApplicationFlow.pause(3000);
        studymateSchedulePage.dateInput1.click();
        studymateSchedulePage.dateInput1.sendKeys("06062023");
        studymateSchedulePage.fromTimeInput.click();
        studymateSchedulePage.fromTimeInput.sendKeys("1130");
        studymateSchedulePage.tillTimeInput.click();
        studymateSchedulePage.tillTimeInput.sendKeys("1230");
        studymateSchedulePage.nameInput.sendKeys("Daily meeting");

        studymateSchedulePage.dropdownChooseGroup.click();
        studymateSchedulePage.firstOptionDropDown.click();
        studymateSchedulePage.listOfDays.get(0).click();
        studymateSchedulePage.endDateInput.click();
        studymateSchedulePage.endDateInput.sendKeys("06132023");
        studymateSchedulePage.colorList1.get(2).click();
        studymateSchedulePage.publishBtn.click();

        studymateSchedulePage.getScheduleBtn.click();
        studymateSchedulePage.cancelBtn.click();
        studymateSchedulePage.describeInput.click();
        studymateSchedulePage.describeInput.sendKeys("No reason for cancellation");
        studymateSchedulePage.submitBtn.click();

        Assert.assertEquals(studymateSchedulePage.buttonCancel.getText(),"Canceled");



    }

    @Test
    public  void negativeTest(){
        StudymateLoginPage studymateLoginPage = new StudymateLoginPage();
        StudymateSchedulePage studymateSchedulePage = new StudymateSchedulePage();
        studymateLoginPage.usernameInput.sendKeys(Config.getValue("studymateUsername"));
        studymateLoginPage.passwordInput.sendKeys(Config.getValue("studymatePassword"));
        studymateLoginPage.loginBtn.click();
        ApplicationFlow.pause(2000);
        studymateLoginPage.menuOptions.get(7).click();
        studymateSchedulePage.createEventBtn.click();
        studymateSchedulePage.scheduleBtn.click();
        ApplicationFlow.pause(3000);
        studymateSchedulePage.dateInput1.click();
        studymateSchedulePage.dateInput1.sendKeys("06062023");
        studymateSchedulePage.fromTimeInput.click();
        studymateSchedulePage.fromTimeInput.sendKeys("1130");
        studymateSchedulePage.tillTimeInput.click();
        studymateSchedulePage.tillTimeInput.sendKeys("1230");
        studymateSchedulePage.nameInput.sendKeys("Daily meeting");

        studymateSchedulePage.dropdownChooseGroup.click();
        studymateSchedulePage.firstOptionDropDown.click();
        studymateSchedulePage.listOfDays.get(0).click();
        studymateSchedulePage.endDateInput.click();
        studymateSchedulePage.endDateInput.sendKeys("06132023");
        studymateSchedulePage.colorList1.get(2).click();
        studymateSchedulePage.publishBtn.click();

        studymateSchedulePage.getScheduleBtn.click();
        studymateSchedulePage.cancelBtn.click();
        studymateSchedulePage.describeInput.click();
        studymateSchedulePage.describeInput.sendKeys("   ");

        ApplicationFlow.pause(3000);
        boolean bo = studymateSchedulePage.submitBtn.isEnabled();
        Assert.assertFalse(bo);
    }
}
