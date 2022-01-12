package class07Rewatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameWithWebElement {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();
        //switch to the desired frame1 using WebElement
        WebElement frame1=driver.findElement(By.xpath("//iframe[@id='frame1']"));
        driver.switchTo().frame(frame1);

        driver.switchTo().defaultContent();

        //switch to the frame using index
        driver.switchTo().frame(1);
        driver.findElement(By.cssSelector("h1#sampleHeading")).getText();



    }}
