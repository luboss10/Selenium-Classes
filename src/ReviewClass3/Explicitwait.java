package ReviewClass3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Explicitwait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/dynamic-properties");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        WebDriverWait wait=new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='enableAfter']")));

        WebElement button=driver.findElement(By.xpath("//*[@id='enableAfter']")); //have to copy the above one into element
        System.out.println(button.isEnabled());
        driver.quit();


    }
}
