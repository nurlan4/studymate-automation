package tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.StudymateLoginPage;
import pages.StudymateSchedulePage;
import utilites.ApplicationFlow;
import utilites.Config;
import utilites.Driver;

public class StudymateScheduleTest {
    Faker faker = new Faker();
    StudymateLoginPage studymateLoginPage ;
    @BeforeMethod
    public void before (){
        studymateLoginPage = new StudymateLoginPage();
    }
    @AfterMethod
    public void quit(){
        Driver.quit();
    }
    @Test
    public void positiveSchedule() {

        Driver.getDriver().get(Config.getValue("studymateUrl"));
        ApplicationFlow.pause(1500);
        studymateLoginPage.studyMateLogIn();
        StudymateSchedulePage studymateSchedulePage = new StudymateSchedulePage();
        ApplicationFlow.pause(2000);

        studymateSchedulePage.scheduleBtnSideMenu.click();
        studymateSchedulePage.createEventBtn.click();
        studymateSchedulePage.scheduleBtn.click();
        ApplicationFlow.pause(3000);
        studymateSchedulePage.dateInput.click();
        studymateSchedulePage.dateInput.sendKeys("06.20.2023");
        studymateSchedulePage.fromTimeInput.click();
        studymateSchedulePage.fromTimeInput.sendKeys("11.00");
        studymateSchedulePage.tillTimeInput.click();
        studymateSchedulePage.tillTimeInput.sendKeys("12.00");
        studymateSchedulePage.nameInput.click();
        studymateSchedulePage.nameInput.sendKeys(faker.name().title());
        studymateSchedulePage.dropdownChooseGroup.click();
        studymateSchedulePage.firstOptionDropDown.click();
        studymateSchedulePage.listOfDays.get(0).click();
        studymateSchedulePage.listOfDays.get(1).click();
        studymateSchedulePage.listOfDays.get(2).click();
        studymateSchedulePage.listOfDays.get(3).click();
        studymateSchedulePage.listOfDays.get(4).click();
        studymateSchedulePage.listOfDays.get(5).click();
        studymateSchedulePage.listOfDays.get(6).click();
        ApplicationFlow.pause(2000);
        studymateSchedulePage.endDateInput.click();
        studymateSchedulePage.endDateInput.sendKeys("06.27.2023");
        studymateSchedulePage.colorList.get(0).click();
        ApplicationFlow.pause(2000);
        studymateSchedulePage.publishBtn.click();
        Assert.assertTrue(studymateSchedulePage.eventCreationMessage.isDisplayed());
    }

    @Test
    public void negativeTest() {
        Driver.getDriver().get(Config.getValue("studymateUrl"));
        studymateLoginPage.studyMateLogIn();
        StudymateSchedulePage studymateSchedulePage = new StudymateSchedulePage();
        ApplicationFlow.pause(2000);

        studymateSchedulePage.scheduleBtnSideMenu.click();
        studymateSchedulePage.createEventBtn.click();
        studymateSchedulePage.scheduleBtn.click();
        ApplicationFlow.pause(3000);
        studymateSchedulePage.dateInput.click();
        studymateSchedulePage.dateInput.sendKeys("06.20.2023");
        studymateSchedulePage.fromTimeInput.click();
        studymateSchedulePage.fromTimeInput.sendKeys("11.00");
        studymateSchedulePage.tillTimeInput.click();
        studymateSchedulePage.tillTimeInput.sendKeys("12.00");
        studymateSchedulePage.nameInput.click();
        studymateSchedulePage.nameInput.sendKeys("");
        studymateSchedulePage.dropdownChooseGroup.click();
        studymateSchedulePage.firstOptionDropDown.click();
        studymateSchedulePage.listOfDays.get(0).click();
        studymateSchedulePage.listOfDays.get(1).click();
        studymateSchedulePage.listOfDays.get(2).click();
        studymateSchedulePage.listOfDays.get(3).click();
        studymateSchedulePage.listOfDays.get(4).click();
        studymateSchedulePage.listOfDays.get(5).click();
        studymateSchedulePage.listOfDays.get(6).click();
        ApplicationFlow.pause(2000);
        studymateSchedulePage.endDateInput.click();
        studymateSchedulePage.endDateInput.sendKeys("06.27.2023");
        studymateSchedulePage.colorList.get(0).click();
        ApplicationFlow.pause(2000);
        boolean check1 = studymateSchedulePage.publishBtn.isEnabled();
        Assert.assertFalse(check1);

    }






}
