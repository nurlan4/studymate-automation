package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.StudymateTeacherPage;
import pages.StudymateLoginPage;
import utilites.ApplicationFlow;
import utilites.Config;
import utilites.Driver;

public class TeacherTest {

    @BeforeTest
    public void driver(){
        Driver.getDriver().get(Config.getValue("studymateUrl"));
    }
    @AfterTest
    public void cleanUp(){
        Driver.quit();
    }
    @Test
    public void createTeacher(){
        Faker faker = new Faker();
        Actions actions = new Actions(Driver.getDriver());
        StudymateLoginPage studymateLoginPage = new StudymateLoginPage();
        StudymateTeacherPage studymateTeacherPage = new StudymateTeacherPage();
        studymateLoginPage.usernameInput.sendKeys(Config.getValue("studymateUsername"));
        studymateLoginPage.passwordInput.sendKeys(Config.getValue("studymatePassword"));
        studymateLoginPage.loginBtn.click();
        studymateTeacherPage.TeacherBtn.click();
        studymateTeacherPage.addTeacher.click();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String lastAndFirstName = firstName+" "+lastName;
        studymateTeacherPage.firstTeacherNameField.sendKeys(firstName);
        studymateTeacherPage.lastTeacherNameField.sendKeys(lastName);
        studymateTeacherPage.phoneTeacherNumberField.sendKeys("2301007780");
        studymateTeacherPage.emailTeacherField.sendKeys(faker.internet().emailAddress());
        studymateTeacherPage.specializationTeacherField.sendKeys(faker.job().position());
        ApplicationFlow.pause(500);
        studymateTeacherPage.choseCourseForTeacher.click();
        ApplicationFlow.pause(500);
        studymateTeacherPage.javaCoreCheckBox.click();
        ApplicationFlow.pause(500);
        actions.click().perform();
        studymateTeacherPage.addBtnForTeacher.click();
        ApplicationFlow.pause(500);
        if(studymateTeacherPage.expectedName.equals(lastAndFirstName)){
            Assert.assertEquals(studymateTeacherPage.expectedName,lastAndFirstName);
        }else {
            actions.moveToElement(studymateTeacherPage.nextTeacherPageBtn).perform();
            actions.click().perform();
        }
    }
}