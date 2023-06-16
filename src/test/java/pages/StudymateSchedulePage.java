package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilites.Driver;

import java.util.List;

public class StudymateSchedulePage {


        public StudymateSchedulePage() {
                PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(xpath = "(//button[@type='button'])[3]")
        public WebElement createEventBtn;

        @FindBy(xpath = "(//*[.='Schedule'])[3]")
        public WebElement scheduleBtn;

        @FindBy(xpath = "(//input[@placeholder=\"MM/DD/YYYY\"])[1]")
        public WebElement dateInput;

        @FindBy(name = "startTime")
        public WebElement fromTimeInput;

        @FindBy(name = "endTime")
        public WebElement tillTimeInput;

        @FindBy(name = "title")
        public WebElement nameInput;

        @FindBy()

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

        @FindBy(xpath = "(//input[@placeholder=\"MM/DD/YYYY\"])[2]")
        public WebElement endDateInput;

        @FindBy(xpath = "//*[@id='schedule-form']/div[6]")
        public List<WebElement> colorList;

        @FindBy(xpath = "//body/div[2]/div[3]/div/div[2]/div")
        public WebElement publishBtn;


}




