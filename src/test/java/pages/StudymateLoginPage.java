package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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
}
