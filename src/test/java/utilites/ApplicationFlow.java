package utilites;

import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class ApplicationFlow {
    public static void  pause(int milliseconds){
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            System.out.println("Interruption happened");
        }
    }
    public  static void scroll(int y){
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(0, y).perform();

    }
    public static void switchToSecondWindow(){
        String currentID=Driver.getDriver().getWindowHandle();
        Set<String> windowHandles = Driver.getDriver().getWindowHandles();
        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals(currentID)){
                Driver.getDriver().switchTo().window(windowHandle);
                break;
            }
        }}

}
