package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilites.Driver;

public class StudymateCoursesPage {
    public StudymateCoursesPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//li[.='Courses']")
    public WebElement coursesMenuItem;
    @FindBy(xpath="(//button[@type='button'])[2]")
    public WebElement courseOptionsDotsBtn;
    @FindBy(xpath="(//li[@role='menuitem'])[2]")
    public WebElement courseEditOption;
    @FindBy(xpath="//input[@type='file']")
    public WebElement courseImg;
    @FindBy(name = "courseName")
    public WebElement courseNameInput;
    @FindBy(xpath="//textarea[@name=\"description\"]")
    public WebElement descriptionInput;
    @FindBy(xpath = "//input[@placeholder='MM/DD/YYYY']")
    public WebElement courseDateInput;
    @FindBy(xpath="//button[@type=\"submit\"]")
    public WebElement courseEditSave;
    @FindBy(xpath="/html/body/div[5]/div[3]/div/form/div[3]/button[1]")
    public WebElement courseEditCancel;
    @FindBy(xpath = "((//header)[2]/../div/div/div/div)[2]/div/div")
    public  WebElement firstCourseName;
    @FindBy(xpath = "((//header)[2]/../div/div/div/div)[2]/p")
    public WebElement firstCourseDescription;

}
