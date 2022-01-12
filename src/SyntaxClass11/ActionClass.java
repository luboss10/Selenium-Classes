package SyntaxClass11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        //switch to the frame
        driver.switchTo().frame(0);
        //locate the draggable
        WebElement draggable=driver.findElement(By.xpath("//*[@id='draggable']"));
        //locate the drop off location
        WebElement dropOff=driver.findElement(By.cssSelector("div#droppable"));

        Actions action=new Actions(driver);

        action.dragAndDrop(draggable,dropOff).perform(); //-will do it and perform it

        //action.clickAndHold(draggable).moveToElement(dropOff).release().build().perform(); //will work the same, but since its many we have to use .build()-since we have more the one method

        driver.quit();

    }
}
