package tests;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.StudymateLoginPage;
import utilites.ApplicationFlow;
import utilites.Config;
import utilites.Driver;

public class LoginTest {
    StudymateLoginPage studymateLoginPage = new StudymateLoginPage();
    Faker faker = new Faker();

    @AfterTest
    public void quit(){
        Driver.quit();
    }


    @Test
    public void validCredentials(){
        Driver.getDriver().get(Config.getValue("studymateUrl"));
        String urlBeforeLogIn = Driver.getDriver().getCurrentUrl();
        studymateLoginPage.usernameInput.sendKeys(Config.getValue("studymateUsername"));
        studymateLoginPage.passwordInput.sendKeys(Config.getValue("studymatePassword"));
        studymateLoginPage.loginBtn.click();
        ApplicationFlow.pause(1000);
        Assert.assertNotEquals(urlBeforeLogIn, Driver.getDriver().getCurrentUrl());
    }

    @Test
    public void invalidPassword(){
        Driver.getDriver().get(Config.getValue("studymateUrl"));
        studymateLoginPage.usernameInput.sendKeys(Config.getValue("studymateUsername"));
        studymateLoginPage.passwordInput.sendKeys(faker.internet().password());
        studymateLoginPage.loginBtn.click();
        ApplicationFlow.pause(2000);
        WebElement RedPopUp = studymateLoginPage.invalidPasswordPopUp;
        Assert.assertTrue(RedPopUp.isDisplayed());

    }

    @Test
    public void invalidEmail(){
        Driver.getDriver().get(Config.getValue("studymateUrl"));
        String email = faker.internet().emailAddress();
        studymateLoginPage.usernameInput.sendKeys(email);
        studymateLoginPage.passwordInput.sendKeys(Config.getValue("studymatePassword"));
        studymateLoginPage.loginBtn.click();
        ApplicationFlow.pause(2000);
        WebElement emailNotFound = Driver.getDriver().findElement(By.xpath("//p[.='User with email " + email + " not found']"));
        Assert.assertTrue(emailNotFound.isDisplayed());
    }

    @Test
    public void noPassword(){
        Driver.getDriver().get(Config.getValue("studymateUrl"));
        studymateLoginPage.usernameInput.sendKeys(Config.getValue("studymateUsername"));
        WebElement passwordRequiredText = studymateLoginPage.passwordIsRequired;
        studymateLoginPage.loginBtn.click();
        ApplicationFlow.pause(1000);
        Assert.assertTrue(passwordRequiredText.isDisplayed());
    }

    @Test
    public void noEmail(){
        Driver.getDriver().get(Config.getValue("studymateUrl"));
        studymateLoginPage.passwordInput.sendKeys(Config.getValue("studymatePassword"));
        WebElement emailRequired = studymateLoginPage.emailIsRequired;
        studymateLoginPage.loginBtn.click();
        ApplicationFlow.pause(1000);
        Assert.assertTrue(emailRequired.isDisplayed());
    }


    @Test
    public void noEmailNoPassword(){
        Driver.getDriver().get(Config.getValue("studymateUrl"));
        WebElement passwordRequiredText = studymateLoginPage.passwordIsRequired;
        WebElement emailRequiredText = studymateLoginPage.emailIsRequired;
        studymateLoginPage.loginBtn.click();
        ApplicationFlow.pause(1000);
        Assert.assertTrue(passwordRequiredText.isDisplayed());
        Assert.assertTrue(emailRequiredText.isDisplayed());
    }

    @Test
    public void incorrectEmail(){
        Driver.getDriver().get(Config.getValue("studymateUrl"));
        studymateLoginPage.usernameInput.sendKeys(faker.lordOfTheRings().character());
        studymateLoginPage.passwordInput.sendKeys(Config.getValue("studymatePassword"));
        studymateLoginPage.loginBtn.click();
        WebElement invalidEmailText = studymateLoginPage.invalidEmail;
        Assert.assertTrue(invalidEmailText.isDisplayed());



    }


}
