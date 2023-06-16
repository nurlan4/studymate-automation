package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.StudymateSchedulePage;
import utilites.Config;
import utilites.Driver;

public class StudyMateScheduleTests {

    @BeforeMethod
    public void setup(){
        Driver.getDriver().get(Config.getValue("studymateUrl"));
    }

    @AfterMethod
    public void cleanup(){
        Driver.quit();
    }

    @Test
    public void createSchedule(){
        StudymateSchedulePage studyMateSchedulePage = new StudymateSchedulePage();
        studyMateSchedulePage.createEventBtn.click();
        studyMateSchedulePage.scheduleBtn.click();
        studyMateSchedulePage.dateInput.sendKeys("06/15/2023");
        studyMateSchedulePage.fromTimeInput.sendKeys("10.00");
        studyMateSchedulePage.tillTimeInput.sendKeys("11.00");
        studyMateSchedulePage.repeatDayMonday.click();
        studyMateSchedulePage.endDateInput.sendKeys("06.22.2023");
        studyMateSchedulePage.publishBtn.click();

    }
}
