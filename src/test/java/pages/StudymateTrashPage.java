package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilites.Driver;

import javax.swing.plaf.PanelUI;
import java.util.List;

public class StudymateTrashPage {
    public StudymateTrashPage() {
        PageFactory.initElements(Driver.getDriver(), this);}
    @FindBy(xpath = "//a")
    public List<WebElement> trashBtn;

    @FindBy(xpath = "(//li)[4]")
    public WebElement TeacherBtn;

    @FindBy(xpath = "(//li)[2]")
    public WebElement groupsBtn;

    @FindBy(xpath = "(//li)[3]")
    public WebElement coursesBtn;

    @FindBy(xpath = "(//li)[5]")
    public WebElement studentsBtn;

    @FindBy(xpath = "//tbody/tr/td[3]/div/*[1]")
    public WebElement trashRecoveryBtn;
    @FindBy(xpath = "//a")
    public List<WebElement> menuOptions;



    @FindBy(xpath = "//p[.='Data successfully recovered']")
    public WebElement actualMessagel;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement loginBtn;

    @FindBy(xpath = "(//p)[12]")
    public WebElement numberOfItemsGroups;

    @FindBy(xpath = "//p[2]")
    public WebElement getNumberOfItemsTrash;

    @FindBy(xpath = "//p[2]")
    public WebElement NumberOfItemsCourses;

    @FindBy(xpath = "//p[2]")
    public WebElement NumberOfItemsTeachers;

    @FindBy(xpath = "//p[2]")
    public WebElement NumberOfItemsStudents;

    @FindBy(xpath = "(//div/p[@class='css-7zvtr8'])[3]")
    public WebElement NumberOfItemsAnnouncements;








}
