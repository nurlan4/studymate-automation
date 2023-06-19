package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilites.Driver;

import javax.xml.xpath.XPath;

public class StudymateAnnouncementsPage {
    public StudymateAnnouncementsPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "(//a)[6]")
    public WebElement announcementPage;

    @FindBy(xpath = "//button[.='Add an announcement']")
    public WebElement addAnAnnouncement;

    @FindBy(xpath = "//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall MuiInputBase-multiline css-1gv5z4s']")
    public WebElement textForAnnouncement;

    @FindBy(xpath = "//input[@name='groups']")
    public WebElement groupInput;

    @FindBy(xpath = "//li[.='Batch1687036529983']")
    public WebElement chooseGroup;

    @FindBy(xpath = "//button[.='Add']")
    public WebElement add;

    @FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw'])[1]")
    public WebElement fromCalendaryBtn;

    @FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw'])[2]")
    public WebElement tillCalendaryBtn;

    @FindBy(xpath = "(//button[.='1'])[2]")
    public WebElement firstDayInCalendary;

    @FindBy(xpath = "//*[@class='sc-cxdZMj djJwiF']")
    public WebElement dateFrom;

    @FindBy(xpath = "(//div[@class='css-1oq9wm5']//input)[1]")
    public WebElement goToFirstPage;

    @FindBy(xpath = "(//*[@class='sc-cxdZMj djJwiF'])[1]")
    public WebElement announcementByDate;

    @FindBy (xpath = "(//*[@class='sc-ZqGJI egOVJP'])")
    public WebElement announcementByText;


}
