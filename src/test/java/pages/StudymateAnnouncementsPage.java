package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilites.Driver;

import javax.xml.xpath.XPath;

public class StudymateAnnouncementsPage {
    public StudymateAnnouncementsPage() {
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//h2/../button")
    public WebElement addAnnouncementBtn;


    @FindBy(xpath = "//textarea[@name='text']")
    public WebElement textOfAnnouncementInput;

    @FindBy(xpath = "(//div[@role='button'])[2]")
    public WebElement groupInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement addInput;

    @FindBy(xpath = "//div[@class='css-yys58j']/button[@type='button']")
    public WebElement threeDotBtn;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveBtn;

    @FindBy(xpath = "(//a)[6]")
    public WebElement announcementPage;

    @FindBy(xpath = "//button[.='Add an announcement']")
    public WebElement addAnAnnouncement;

    @FindBy(xpath = "//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMultiline MuiInputBase-inputSizeSmall css-x7mp9n']")
    public WebElement textForAnnouncement;

    @FindBy(xpath = "//input[@name='groups']")
    public WebElement groupInput1;

    @FindBy(xpath = "//li[.='Batch1687036529983']")
    public WebElement chooseGroup;

    @FindBy(xpath = "//button[.='Add']")
    public WebElement add;

    @FindBy(xpath = "//div[@class='css-q8s1he']/div/p[2]")
    public WebElement textAboutAnnouncement;

    @FindBy(xpath = "//*[@class='MuiButtonBase-root MuiPaginationItem-root MuiPaginationItem-sizeMedium MuiPaginationItem-text MuiPaginationItem-circular MuiPaginationItem-previousNext css-1xr9krm']")
    public WebElement nextPage;

    @FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw'])[1]")
    public WebElement fromCalendaryBtn;

    @FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw'])[2]")
    public WebElement tillCalendaryBtn;

    @FindBy(xpath = "(//button[.='1'])[2]")
    public WebElement firstDayInCalendary;

    @FindBy(xpath = "(//button[.='30'])")
    public WebElement lastDayInCalendary;

    @FindBy(xpath = "//*[@class='sc-cxdZMj djJwiF']")
    public WebElement dateFrom;

    @FindBy(xpath = "(//div[@class='css-1oq9wm5']//input)[1]")
    public WebElement goToFirstPage;

    @FindBy(xpath = "//div[@class='css-q8s1he']/div[3]/p")
    public WebElement announcementByDate;

    @FindBy (xpath = "(//*[@class='sc-ZqGJI egOVJP'])")
    public WebElement announcementByText;


}
