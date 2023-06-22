package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilites.Driver;

public class StudymateAnnouncementsPage {
    public StudymateAnnouncementsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

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
    }

