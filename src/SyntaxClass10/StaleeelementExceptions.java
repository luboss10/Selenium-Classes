package SyntaxClass10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class StaleeelementExceptions {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/stale-element");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        //find the refresh element
        WebElement refreshBtn= driver.findElement(By.cssSelector("button#refresh-button"));
        Thread.sleep(11000);
        refreshBtn= driver.findElement(By.cssSelector("button#refresh-button"));
        //click on it
        refreshBtn.click();
    }
}
