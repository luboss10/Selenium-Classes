package AAA2Utils;

import AAA1TestBase.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

public class CommonMethods extends BaseClass {

               /*/Send text to a given element
               @param element ->webElement
               @param text    -> the text that you want to send
               */
    public static void sendText(WebElement element,String text){

        element.clear();
        element.sendKeys(text);
    }

               //taking a screenshot
    public static void takeScrShot(String filename){
        TakesScreenshot ts=(TakesScreenshot) driver;
        //screenshot is taken and type is file
        File ss=ts.getScreenshotAs(OutputType.FILE);
        //save the screenshot in our computer
        try {
            FileUtils.copyFile(ss,new File("screenshot/POM/"+filename+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

                /*this method is used to switch frames
                @param index
                 */
    public void switchToFrame(int index){
        driver.switchTo().frame(index);
    }
}
