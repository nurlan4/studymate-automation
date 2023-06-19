package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.StudymateTeacherPage;
import pages.StudymateLoginPage;
import utilites.ApplicationFlow;
import utilites.Config;
import utilites.Driver;

public class TeacherTest {

    @BeforeMethod
    public void driver(){
        Driver.getDriver().get(Config.getValue("studymateUrl"));
    }
    @AfterMethod
    public void cleanUp(){
        Driver.quit();
    }
    @Test
    public void createTeacherHappy(){
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
    @Test
    public void createTeacherSadFirstName(){
        Faker faker = new Faker();
        Actions actions = new Actions(Driver.getDriver());
        StudymateLoginPage studymateLoginPage = new StudymateLoginPage();
        StudymateTeacherPage studymateTeacherPage = new StudymateTeacherPage();
        studymateLoginPage.usernameInput.sendKeys(Config.getValue("studymateUsername"));
        studymateLoginPage.passwordInput.sendKeys(Config.getValue("studymatePassword"));
        studymateLoginPage.loginBtn.click();
        studymateTeacherPage.TeacherBtn.click();
        studymateTeacherPage.addTeacher.click();
        String lastName = faker.name().lastName();
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
        ApplicationFlow.pause(500);
        Assert.assertFalse(studymateTeacherPage.addBtnForTeacher.isEnabled());
    }
    @Test
    public void createTeacherSadLastName(){
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
        studymateTeacherPage.firstTeacherNameField.sendKeys(firstName);
        studymateTeacherPage.phoneTeacherNumberField.sendKeys("2301007780");
        studymateTeacherPage.emailTeacherField.sendKeys(faker.internet().emailAddress());
        studymateTeacherPage.specializationTeacherField.sendKeys(faker.job().position());
        ApplicationFlow.pause(500);
        studymateTeacherPage.choseCourseForTeacher.click();
        ApplicationFlow.pause(500);
        studymateTeacherPage.javaCoreCheckBox.click();
        ApplicationFlow.pause(500);
        actions.click().perform();
        ApplicationFlow.pause(500);
        Assert.assertFalse(studymateTeacherPage.addBtnForTeacher.isEnabled());
    }
    @Test
    public void createTeacherSadPhoneNum(){
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
        studymateTeacherPage.firstTeacherNameField.sendKeys(firstName);
        studymateTeacherPage.lastTeacherNameField.sendKeys(lastName);
        studymateTeacherPage.emailTeacherField.sendKeys(faker.internet().emailAddress());
        studymateTeacherPage.specializationTeacherField.sendKeys(faker.job().position());
        ApplicationFlow.pause(500);
        studymateTeacherPage.choseCourseForTeacher.click();
        ApplicationFlow.pause(500);
        studymateTeacherPage.javaCoreCheckBox.click();
        ApplicationFlow.pause(500);
        actions.click().perform();
        ApplicationFlow.pause(500);
        Assert.assertFalse(studymateTeacherPage.addBtnForTeacher.isEnabled());
    }
    @Test
    public void createTeacherSadEmail(){
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
        studymateTeacherPage.firstTeacherNameField.sendKeys(firstName);
        studymateTeacherPage.lastTeacherNameField.sendKeys(lastName);
        studymateTeacherPage.phoneTeacherNumberField.sendKeys("2301007780");
        studymateTeacherPage.specializationTeacherField.sendKeys(faker.job().position());
        ApplicationFlow.pause(500);
        studymateTeacherPage.choseCourseForTeacher.click();
        ApplicationFlow.pause(500);
        studymateTeacherPage.javaCoreCheckBox.click();
        ApplicationFlow.pause(500);
        actions.click().perform();
        ApplicationFlow.pause(500);
        Assert.assertFalse(studymateTeacherPage.addBtnForTeacher.isEnabled());
    }
    @Test
    public void createTeacherSadSpecialization(){
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
        studymateTeacherPage.firstTeacherNameField.sendKeys(firstName);
        studymateTeacherPage.lastTeacherNameField.sendKeys(lastName);
        studymateTeacherPage.phoneTeacherNumberField.sendKeys("2301007780");
        studymateTeacherPage.emailTeacherField.sendKeys(faker.internet().emailAddress());
        ApplicationFlow.pause(500);
        studymateTeacherPage.choseCourseForTeacher.click();
        ApplicationFlow.pause(500);
        studymateTeacherPage.javaCoreCheckBox.click();
        ApplicationFlow.pause(500);
        actions.click().perform();
        ApplicationFlow.pause(500);
        Assert.assertFalse(studymateTeacherPage.addBtnForTeacher.isEnabled());
    }
    @Test
    public void createTeacherSadCourse(){
        Faker faker = new Faker();
        StudymateLoginPage studymateLoginPage = new StudymateLoginPage();
        StudymateTeacherPage studymateTeacherPage = new StudymateTeacherPage();
        studymateLoginPage.usernameInput.sendKeys(Config.getValue("studymateUsername"));
        studymateLoginPage.passwordInput.sendKeys(Config.getValue("studymatePassword"));
        studymateLoginPage.loginBtn.click();
        studymateTeacherPage.TeacherBtn.click();
        studymateTeacherPage.addTeacher.click();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        studymateTeacherPage.firstTeacherNameField.sendKeys(firstName);
        studymateTeacherPage.lastTeacherNameField.sendKeys(lastName);
        studymateTeacherPage.phoneTeacherNumberField.sendKeys("2301007780");
        studymateTeacherPage.emailTeacherField.sendKeys(faker.internet().emailAddress());
        studymateTeacherPage.specializationTeacherField.sendKeys(faker.job().position());
        ApplicationFlow.pause(500);
        ApplicationFlow.pause(500);
        Assert.assertTrue(studymateTeacherPage.addBtnForTeacher.isEnabled());
    }
}