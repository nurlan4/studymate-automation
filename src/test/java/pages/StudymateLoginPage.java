package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilites.Config;
import utilites.Driver;

import java.util.List;

public class StudymateLoginPage {
    public StudymateLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//input)[1]")
    public WebElement usernameInput;
    @FindBy(xpath = "(//input)[2]")
    public WebElement passwordInput;
    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement loginBtn;
    @FindBy(xpath = "//a")
    public List<WebElement> menuOptions;

    @FindBy(xpath = "//p[.='Invalid password']")
    public WebElement invalidPasswordPopUp;

    @FindBy(xpath = "//p[.='Password is required!']")
    public WebElement passwordIsRequired;

    @FindBy(xpath = "//p[.='Email is required!']")
    public WebElement emailIsRequired;

    public void studyMateLogIn(){
        usernameInput.sendKeys(Config.getValue("studymateUsername"));
        passwordInput.sendKeys(Config.getValue("studymatePassword"));
        loginBtn.click();
    }

    @FindBy(xpath = "//p[.='Email is not valid!']")
     public WebElement invalidEmail;

    //@FindBy(xpath = "//tbody/tr/td[3]/div/*[1]")
   // public WebElement trashRecoveryBtn;

   // @FindBy(xpath = "//p[.='Data successfully recovered']")
   // public WebElement actualMessagel;



}
