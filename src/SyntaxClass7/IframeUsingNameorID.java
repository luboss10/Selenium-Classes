package SyntaxClass7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeUsingNameorID {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();

        //switch to the desired frame as our desired webElement inside that frame
        driver.switchTo().frame("frame1");

        //getting the webelement
        WebElement text1=driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println("The text is : "+text1.getText());

        //switch back to the parent of the page back
        driver.switchTo().defaultContent();

        // switch tp frame2
        driver.switchTo().frame("frame2");
        //locate the webelement
        WebElement text2=driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println("The text is : "+text2);

        driver.switchTo().defaultContent();

    }
}
