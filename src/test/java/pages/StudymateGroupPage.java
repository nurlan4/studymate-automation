package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilites.Driver;

public class StudymateGroupPage {
    public StudymateGroupPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//h2/../button")
    public WebElement createGroupBtn;
    @FindBy(name = "name")
    public WebElement groupNameInput;
    @FindBy(xpath = "//textarea[@type='text']")
    public WebElement descriptionInput;
    @FindBy(xpath ="//input[@placeholder=\"MM/DD/YYYY\"]" )
    public WebElement dateInput;
    @FindBy(xpath = "//button[text()='Create']")
    public WebElement createBtn;


}
