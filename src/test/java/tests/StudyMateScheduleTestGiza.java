package tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.StudymateLoginPage;
import pages.StudymateSchedulePage;
import utilites.ApplicationFlow;
import utilites.Config;
import utilites.Driver;

public class StudyMateScheduleTestGiza {


        @AfterTest
        public void quit(){
            Driver.quit();
        }

        @Test
        public void editSch()  {
            StudymateLoginPage studymateLoginPage = new StudymateLoginPage();
            StudymateSchedulePage studymateSchedulePage= new StudymateSchedulePage();

            Driver.getDriver().get(Config.getValue("studymateUrl"));
            studymateLoginPage.usernameInput.sendKeys(Config.getValue("studymateUsername"));
            studymateLoginPage.passwordInput.sendKeys(Config.getValue("studymatePassword"));
            studymateLoginPage.loginBtn.click();
            ApplicationFlow.pause(1000);

            studymateLoginPage.menuOptions.get(7).click();
            studymateSchedulePage.createEventBtn.click();
            studymateSchedulePage.scheduleBtn.click();
            studymateSchedulePage.inputDateGiza.click();
            studymateSchedulePage.inputDateGiza.sendKeys("06112023");
            studymateSchedulePage.fromTimeInput.click();
            studymateSchedulePage.fromTimeInput.sendKeys("1030");
            studymateSchedulePage.tillTimeInput.click();
            studymateSchedulePage.tillTimeInput.sendKeys("1330");
            studymateSchedulePage.nameInput.sendKeys("Massage");

            studymateSchedulePage.dropdownChooseGroup.click();
            studymateSchedulePage.firstOptionDropDown.click();
            studymateSchedulePage.listOfDays.get(0).click();
            studymateSchedulePage.endDateInput.click();
            studymateSchedulePage.endDateInput.sendKeys("06162023");
            studymateSchedulePage.listOfColors.get(2).click();
            studymateSchedulePage.publishBtn.click();
            studymateSchedulePage.chooseDate.click();studymateSchedulePage.startTime.sendKeys("10:00");
            studymateSchedulePage.name.sendKeys("Giza");
            ApplicationFlow.pause(3000);
           // studymateSchedulePage.publish.click();



        }

}
