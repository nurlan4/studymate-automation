package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilites.Driver;

import java.util.List;

public class StudymateSchedulePage {
    public StudymateSchedulePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//li[.='Schedule']")
    public WebElement scheduleBtnSideMenu;
    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement createEventBtn;

    @FindBy(xpath = "//div[.='Schedule']")
    public WebElement scheduleBtn;

    @FindBy(xpath = "(//div/input)[4]")
    public WebElement dateInput;

    @FindBy(xpath = "(//input[@placeholder='MM/DD/YYYY'])[1]")
    public WebElement dateInput1;


    @FindBy(name = "startTime")
    public WebElement fromTimeInput;

    @FindBy(name = "endTime")
    public WebElement tillTimeInput;

    @FindBy(name = "title")
    public WebElement nameInput;

    @FindBy(id = "mui-component-select-groupIds")
    public WebElement dropdownChooseGroup;

    @FindBy(xpath = "(//ul/li)[1]")
    public WebElement firstOptionDropDown;

    @FindBy(xpath = "(//button[@type='button']/..)[4]/button")
    public List<WebElement> listOfDays;

    @FindBy(xpath = "//div[2]/div[3]/div/div[2]/form/div[4]/div/button[1]")
    public WebElement repeatDayMonday;

    @FindBy(xpath = "//div[2]/div[3]/div/div[2]/form/div[4]/div/button[2]")
    public WebElement repeatDayTuesday;

    @FindBy(xpath = "//div[2]/div[3]/div/div[2]/form/div[4]/div/button[3]")
    public WebElement repeatDayWednesday;

    @FindBy(xpath = "//div[2]/div[3]/div/div[2]/form/div[4]/div/button[4]")
    public WebElement repeatDayThursday;

    @FindBy(xpath = "//div[2]/div[3]/div/div[2]/form/div[4]/div/button[5]")
    public WebElement repeatDayFriday;

    @FindBy(xpath = "//div[2]/div[3]/div/div[2]/form/div[4]/div/button[6]")
    public WebElement repeatDaySaturday;

    @FindBy(xpath = "//div[2]/div[3]/div/div[2]/form/div[4]/div/button[7]")
    public WebElement repeatDaySunday;

    @FindBy(xpath = "(//input[@placeholder='MM/DD/YYYY'])[2]")
    public WebElement endDateInput;

    @FindBy(xpath = "(//div/form/div)[6]/div")//(//div/form/div[6])
    public List<WebElement> colorList;

    @FindBy(xpath = "//*[@id='schedule-form']/div[6]/div")
    public  List<WebElement> colorList1;

    @FindBy(xpath = "//*[@id='schedule-form']/div[6]/div")
    public List<WebElement> listOfColors;

    @FindBy(xpath = "//button[.='Publish']")
    public WebElement publishBtn;

    @FindBy(xpath = "//div/p[.='Daily meeting']/../..")
    public WebElement getScheduleBtn;


    @FindBy(xpath = "//*[@aria-label='Cancel']")
    public WebElement cancelBtn;


    @FindBy(xpath = "//*[@type='text']")
    public WebElement describeInput;


    @FindBy(xpath = "//button[@type='submit'] ")
    public WebElement submitBtn;

    @FindBy(xpath = "(//div)[.='Event successfully saved'][7]")
    public WebElement eventCreationMessage;

    @FindBy(xpath = "//div[.='Canceled']/button")
    public WebElement buttonCancel;

    @FindBy(xpath = "//*[@id='fc-dom-28']") //Giza
    public WebElement selectDate;
    @FindBy(xpath = "//*[@aria-label='Edit']") //Giza
    public WebElement editBtn;

    @FindBy(xpath = "//*/td[@data-date='2023-06-10']") //Giza
    public WebElement chooseDate;
    @FindBy(xpath = "//*[@id=':r19:']")//Giza
    public WebElement editDate;
    @FindBy(xpath = "//input[@id='title']")//Giza
    public WebElement name;

    @FindBy(xpath = "//input[@id='startTime']")//giza
    public WebElement startTime;

    @FindBy(xpath = "//button[.='Publish']")//giza
    public WebElement publish;


    @FindBy(xpath = "(//input[@placeholder='MM/DD/YYYY'])[1]")
    public  WebElement inputDateGiza;


}
