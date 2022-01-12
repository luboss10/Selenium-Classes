package class08Rewatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitt {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/dynamic-data-loading-demo.php");
        driver.manage().window().maximize();

        //declaring a implicit wait for finding elements
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        //find the button new user
        WebElement newUser=driver.findElement(By.cssSelector("button#save"));
        newUser.click();
        //get new user first name
       WebElement fName= driver.findElement(By.xpath("//div[@id='First-Name']/p"));
        System.out.println(fName.getText());


    }
}
