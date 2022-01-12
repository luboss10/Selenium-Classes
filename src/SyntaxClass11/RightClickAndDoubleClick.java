package SyntaxClass11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class RightClickAndDoubleClick {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        WebElement rightClick= driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        Actions action=new Actions(driver);
        action.contextClick(rightClick).perform();

        WebElement copybtn=driver.findElement(By.xpath("//*[@class='context-menu-item context-menu-icon context-menu-icon-copy context-menu-visible']"));
        action.contextClick(rightClick).perform();

        //locate double click
      //  WebElement doubleClick= driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
     //   action.doubleClick(doubleClick).perform();

    }
}
