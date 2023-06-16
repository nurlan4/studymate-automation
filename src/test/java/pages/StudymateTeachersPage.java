package pages;

import org.openqa.selenium.support.PageFactory;
import utilites.Driver;

public class StudymateTeachersPage {
    public StudymateTeachersPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }
}
