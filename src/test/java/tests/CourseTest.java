package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.StudymateCoursesPage;
import pages.StudymateLoginPage;
import utilites.ApplicationFlow;
import utilites.Config;
import utilites.Driver;

public class CourseTest {
    StudymateLoginPage studymateLoginPage;
    @BeforeMethod
    public void before(){
        studymateLoginPage=new StudymateLoginPage();
        Driver.getDriver().get(Config.getValue("studymateUrl"));

    }
    @AfterMethod
    public void after(){
        Driver.quit();
    }
    @Test
    public void editingCourse(){
        studymateLoginPage.studyMateLogIn();
        StudymateCoursesPage studymateCoursesPage= new StudymateCoursesPage();
        studymateCoursesPage.coursesMenuItem.click();
        studymateCoursesPage.courseOptionsDotsBtn.click();
        studymateCoursesPage.courseEditOption.click();
        studymateCoursesPage.courseImg.sendKeys(System.getProperty("user.dir")+"\\src\\codewise.jpeg");
        String newName="Selenium"+System.currentTimeMillis();
        studymateCoursesPage.courseNameInput.sendKeys(Keys.chord(Keys.CONTROL,"a" )+Keys.DELETE+newName);
        studymateCoursesPage.descriptionInput.click();
        String newDesc="Automation"+System.currentTimeMillis();
        studymateCoursesPage.descriptionInput.sendKeys(Keys.chord(Keys.CONTROL,"a" )+Keys.DELETE+newDesc);
        studymateCoursesPage.courseDateInput.click();
        studymateCoursesPage.courseDateInput.sendKeys("06182018");
        studymateCoursesPage.courseEditSave.click();
        ApplicationFlow.pause(2000);
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//div[.='"+newName+"']")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//p[.='"+newDesc+"']")).isDisplayed());
    }
    @Test
    public void cancelingEditingCourse(){
        studymateLoginPage.studyMateLogIn();
        StudymateCoursesPage studymateCoursesPage= new StudymateCoursesPage();
        studymateCoursesPage.coursesMenuItem.click();
        String oldName= studymateCoursesPage.firstCourseName.getText();
        String oldDesc=studymateCoursesPage.firstCourseDescription.getText();
        studymateCoursesPage.courseOptionsDotsBtn.click();
        studymateCoursesPage.courseEditOption.click();
        studymateCoursesPage.courseImg.sendKeys(System.getProperty("user.dir")+"\\src\\codewise.jpeg");
        String newName="Selenium"+System.currentTimeMillis();
        studymateCoursesPage.courseNameInput.sendKeys(Keys.chord(Keys.CONTROL,"a" )+Keys.DELETE+newName);
        studymateCoursesPage.descriptionInput.click();
        String newDesc="Automation"+System.currentTimeMillis();
        studymateCoursesPage.descriptionInput.sendKeys(Keys.chord(Keys.CONTROL,"a" )+Keys.DELETE+newDesc);
        studymateCoursesPage.courseDateInput.click();
        studymateCoursesPage.courseDateInput.sendKeys("06182018");
        studymateCoursesPage.courseEditCancel.click();
        ApplicationFlow.pause(2000);
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//div[.='"+oldName+"']")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//p[.='"+oldDesc+"']")).isDisplayed());
    }

}
