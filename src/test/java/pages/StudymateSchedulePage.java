package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilites.Driver;

public class StudymateSchedulePage {
    public StudymateSchedulePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//p[.='name']")
    public WebElement nameOfEvent;

    @FindBy(xpath = "//button[.='Create event']")
    public WebElement btnForCreateEventOrSchedule;

    @FindBy(xpath = "//div[@class='MuiInputAdornment-root MuiInputAdornment-positionEnd MuiInputAdornment-outlined MuiInputAdornment-sizeMedium css-1nvf7g0']/button")
    public WebElement btnForChooseDayInCalendary;

    @FindBy(xpath = "//button[.='1']")
    public WebElement firstDayInJune;

    @FindBy(xpath = "(//input)[5]")
    public WebElement timeFromInput;

    @FindBy(xpath = "(//input)[6]")
    public WebElement timeToInput;

    @FindBy(xpath = "(//input)[7]")
    public WebElement nameOfEventInput;

    @FindBy(xpath = "//div[@class='MuiSelect-select MuiSelect-outlined MuiSelect-multiple MuiInputBase-input MuiOutlinedInput-input css-qiwgdb']")
    public WebElement chooseGroupInput;

    public void chooseColor(int i){
            Driver.getDriver().findElement(By.xpath("//div[@class='sc-jTjUTQ eckBjR']/div["+i+"]"));
    }

    @FindBy(xpath = "//li[.='Quickbeam1686883935634']")
    public WebElement group;

    @FindBy(xpath = "//button[.='Publish']")
    public WebElement publishBtn;

    @FindBy(xpath = "//tr/td//div/a[@class='fc-daygrid-more-link fc-more-link']")
    public WebElement eventList;

    @FindBy(xpath = "fc-daygrid-event fc-daygrid-dot-event fc-event fc-event-start fc-event-end fc-event-past")
    public WebElement eventExample;

    //div[@class='sc-jmpzUR NEUJ']/div[@class='sc-gUJyNl tUCAs']


}
