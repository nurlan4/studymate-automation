package pages;

import org.openqa.selenium.support.PageFactory;
import utilites.Driver;

public class StudymateAnalyticsPage {
    public StudymateAnalyticsPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }
}
