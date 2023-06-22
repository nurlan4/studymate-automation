package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.StudymateLoginPage;
import pages.StudymateTrashPage;
import utilites.ApplicationFlow;
import utilites.Config;
import utilites.Driver;

public class StudymateTrashTest {
    StudymateLoginPage studymateLoginPage;
@BeforeMethod
public void before(){
    studymateLoginPage = new StudymateLoginPage();
}

    @AfterMethod

    public void quit(){
        Driver.quit();

    }







    @Test
    public void TrashPopupTest() {
        StudymateTrashPage studymateTrashPage = new StudymateTrashPage();




        Driver.getDriver().get(Config.getValue("studymateUrl"));
        studymateLoginPage.usernameInput.sendKeys(Config.getValue("studymateUsername"));
        studymateLoginPage.passwordInput.sendKeys(Config.getValue("studymatePassword"));
        studymateLoginPage.loginBtn.click();
        ApplicationFlow.pause(2000);
        studymateTrashPage.menuOptions.get(6).click();
        studymateTrashPage.trashRecoveryBtn.click();
        ApplicationFlow.pause(1000);
        String ExpectedMessage = "Data successfully recovered";
        String ActualMessage = studymateTrashPage.actualMessagel.getText();
        Assert.assertEquals(ExpectedMessage, ActualMessage);

    }



        @Test
        public void DecrementByOne(){
            StudymateTrashPage studymateTrashPage = new StudymateTrashPage();




            Driver.getDriver().get(Config.getValue("studymateUrl"));
            studymateLoginPage.usernameInput.sendKeys(Config.getValue("studymateUsername"));
            studymateLoginPage.passwordInput.sendKeys(Config.getValue("studymatePassword"));
            studymateLoginPage.loginBtn.click();
            ApplicationFlow.pause(2000);
            studymateTrashPage.menuOptions.get(6).click();
            ApplicationFlow.pause(2000);
            String TotalOfItemsTrashBeforeClick = studymateTrashPage.getNumberOfItemsTrash.getText().substring(4).trim();
            ApplicationFlow.pause(1000);
            studymateTrashPage.trashRecoveryBtn.click();
            ApplicationFlow.pause(2000);
            String TotalOfItemsTrashAfterClick = studymateTrashPage.getNumberOfItemsTrash.getText().substring(4).trim();
            int NumberOfItemsTrashAfterClick = Integer.parseInt(TotalOfItemsTrashAfterClick);
            int BeforeItemsTrashInt = Integer.parseInt(TotalOfItemsTrashBeforeClick);
            int ExpectedNumbersItemsTrashInt = (BeforeItemsTrashInt-1);
            Assert.assertEquals(NumberOfItemsTrashAfterClick,ExpectedNumbersItemsTrashInt);



        }
            @Test
            public void incrementByOne(){

                StudymateTrashPage studymateTrashPage = new StudymateTrashPage();



                Driver.getDriver().get(Config.getValue("studymateUrl"));
                studymateLoginPage.usernameInput.sendKeys(Config.getValue("studymateUsername"));
                studymateLoginPage.passwordInput.sendKeys(Config.getValue("studymatePassword"));
                studymateLoginPage.loginBtn.click();
                ApplicationFlow.pause(2000);
                studymateTrashPage.menuOptions.get(1).click();
                String TotalOfItemsGroupsBefore = studymateTrashPage.numberOfItemsGroups.getText().substring(4).trim();
                int IntOfItemsGroups = Integer.parseInt(TotalOfItemsGroupsBefore);
                System.out.println(IntOfItemsGroups);

                studymateTrashPage.menuOptions.get(2).click();
                ApplicationFlow.pause(1000);
                String TotalOfItemsCoursesBefore = studymateTrashPage.NumberOfItemsCourses.getText().substring(4).trim();
                int IntOfItemsCourses = Integer.parseInt(TotalOfItemsCoursesBefore);
                System.out.println(IntOfItemsCourses);


                studymateTrashPage.menuOptions.get(3).click();
                ApplicationFlow.pause(1000);
                String TotalOfItemsTeachersBefore = studymateTrashPage.NumberOfItemsTeachers.getText().substring(4).trim();
                int IntOfItemsTeachers = Integer.parseInt(TotalOfItemsTeachersBefore);
                System.out.println(TotalOfItemsTeachersBefore);

                studymateTrashPage.menuOptions.get(4).click();
                ApplicationFlow.pause(1000);
                String TotalOfItemsStudentsBefore = studymateTrashPage.NumberOfItemsStudents.getText().substring(4).trim();
                int IntOfItemsStudents= Integer.parseInt(TotalOfItemsStudentsBefore);
                System.out.println(IntOfItemsStudents);

                studymateTrashPage.menuOptions.get(5).click();
                ApplicationFlow.pause(1000);
                String TotalOfItemsAnnouncementsBefore = studymateTrashPage.NumberOfItemsAnnouncements.getText().substring(4).trim();
                int IntOfItemsAnnouncements= Integer.parseInt(TotalOfItemsAnnouncementsBefore);
                System.out.println(IntOfItemsAnnouncements);



                studymateTrashPage.menuOptions.get(6).click();
                studymateTrashPage.trashRecoveryBtn.click();
                ApplicationFlow.pause(2000);




                studymateTrashPage.menuOptions.get(1).click();
                String TotalOfItemsGroupsAfter = studymateTrashPage.numberOfItemsGroups.getText().substring(4).trim();
                int IntOfItemsGroupsAfter = Integer.parseInt(TotalOfItemsGroupsAfter);
                System.out.println(IntOfItemsGroupsAfter);



                studymateTrashPage.menuOptions.get(2).click();
                ApplicationFlow.pause(1000);
                String TotalOfItemsCoursesAfter = studymateTrashPage.NumberOfItemsCourses.getText().substring(4).trim();
                int IntOfItemsCoursesAfter = Integer.parseInt(TotalOfItemsCoursesAfter);
                System.out.println(IntOfItemsCoursesAfter);



                studymateTrashPage.menuOptions.get(3).click();
                ApplicationFlow.pause(1000);
                String TotalOfItemsTeachersAfter = studymateTrashPage.NumberOfItemsTeachers.getText().substring(4).trim();
                int IntOfItemsTeachersAfter = Integer.parseInt(TotalOfItemsTeachersAfter);
                System.out.println(IntOfItemsTeachersAfter);


                studymateTrashPage.menuOptions.get(4).click();
                ApplicationFlow.pause(1000);
                String TotalOfItemsStudentsAfter = studymateTrashPage.NumberOfItemsStudents.getText().substring(4).trim();
                int IntOfItemsStudentsAfter= Integer.parseInt(TotalOfItemsStudentsAfter);
                System.out.println(IntOfItemsStudentsAfter);


                studymateTrashPage.menuOptions.get(5).click();
                ApplicationFlow.pause(1000);
                String TotalOfItemsAnnouncementsAfter = studymateTrashPage.NumberOfItemsAnnouncements.getText().substring(4).trim();
                int IntOfItemsAnnouncementsAfter= Integer.parseInt(TotalOfItemsAnnouncementsAfter);
                System.out.println(IntOfItemsAnnouncementsAfter);


                if ( IntOfItemsGroups < IntOfItemsGroupsAfter){

                    Assert.assertNotEquals(IntOfItemsGroups,IntOfItemsGroupsAfter);
                }
                 else if (IntOfItemsCourses < IntOfItemsCoursesAfter) {
                    Assert.assertNotEquals(IntOfItemsCourses,IntOfItemsCoursesAfter);

                }
                 else if (IntOfItemsTeachers < IntOfItemsTeachersAfter) {
                    Assert.assertNotEquals(IntOfItemsTeachers,IntOfItemsTeachersAfter);
                }
                 else if (IntOfItemsStudents < IntOfItemsStudentsAfter) {
                    Assert.assertNotEquals(IntOfItemsStudents, IntOfItemsStudentsAfter);

                }
                 else if (IntOfItemsAnnouncements < IntOfItemsAnnouncementsAfter) {
                    Assert.assertNotEquals(IntOfItemsAnnouncements,IntOfItemsAnnouncementsAfter);

                }else {
                    System.out.println("Recovered item didn't show up in pages");
                }


            }















}
