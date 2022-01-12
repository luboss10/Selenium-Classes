package SyntaxClass11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.awt.windows.ThemeReader;

import java.util.concurrent.TimeUnit;

public class jsExecutorDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://amazon.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        JavascriptExecutor jse=(JavascriptExecutor) driver;
        //scroll down
        jse.executeScript("window.scrollBy(0,5000)");

        Thread.sleep(2000);
        //scroll up
        jse.executeScript("window.scrollBy(0,-3000)");

        WebElement backtoTop = driver.findElement(By.cssSelector("span.navFooterBackToTopText"));

        jse.executeScript("arguments[0].scrollIntoView(true)",backtoTop);
    }
}
