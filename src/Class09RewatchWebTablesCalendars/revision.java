package Class09RewatchWebTablesCalendars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class revision {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS);

        driver.findElement(By.partialLinkText("Create")).click();
//        WebElement d=driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
//        d.click();

        driver.findElement(By.name("firstname")).sendKeys("Miska");
        driver.findElement(By.name("lastname")).sendKeys("Chlebak");
        driver.findElement(By.name("reg_email__")).sendKeys("Chlebak@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Chlebak@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Chlebak123");


    }

}
