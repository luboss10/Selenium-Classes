package SyntaxClass11;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class WorkingWithKeys {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        //locate username,password and loggin
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        WebElement password = driver.findElement(By.name("ctl00$MainContent$password"));

        username.sendKeys("Tester", Keys.TAB);
        password.sendKeys("test", Keys.ENTER); //will fill and enter the loggin

        //TAKE SCREENSHOT
        TakesScreenshot sS=(TakesScreenshot) driver;
        File sourceFile=sS.getScreenshotAs(OutputType.FILE);
        //save the screenshot in our computer
        try {
            FileUtils.copyFile(sourceFile, new File("screenshot/smartBear/adminlogin.png"));
        }
        catch (IOException e){
            e.printStackTrace();
        }



    }
}
