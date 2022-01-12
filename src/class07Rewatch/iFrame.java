package class07Rewatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame {
    public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();
        //switch to desired frame as our desired webElement is  inside that frame
        driver.switchTo().frame("frame1");

        //getting a webelement
        WebElement text1=driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println(text1.getText());

        driver.switchTo().defaultContent();

        //switch to frame2
        driver.switchTo().frame("frame2");
        //locate the webElement
       WebElement text2= driver.findElement(By.cssSelector("h1#sampleHeading"));
        text2.getText();
}
}