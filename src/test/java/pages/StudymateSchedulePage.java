package pages;

import org.openqa.selenium.support.PageFactory;
import utilites.Driver;

public class StudymateSchedulePage {
    public StudymateSchedulePage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }
}
