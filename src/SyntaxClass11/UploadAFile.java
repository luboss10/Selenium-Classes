package SyntaxClass11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UploadAFile {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        //locate the chosen file button
        WebElement chooseFile=driver.findElement(By.xpath("//*[@id='file-upload']"));
        //in order to upload a file
        chooseFile.sendKeys("C:\\Users\\lubos\\Desktop\\bob-ross-painting.gif");
        //locate the submit and click btn
        driver.findElement(By.cssSelector("input#file-submit")).click();
    }
}
