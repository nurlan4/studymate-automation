package pages;

import org.openqa.selenium.support.PageFactory;
import utilites.Driver;

public class StudymateStudentsPage {
    public StudymateStudentsPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }
}
