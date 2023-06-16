package pages;

import org.openqa.selenium.support.PageFactory;
import utilites.Driver;

public class StudymateCoursesPage {
    public StudymateCoursesPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
