package SyntaxClass9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class task {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://chercher.tech/practice/explicit-wait");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);


        WebElement button=driver.findElement(By.cssSelector("button#enable-button"));
        button.click();

        //use explicit wait to make sure the element has met a certain condition
        WebDriverWait wait=new WebDriverWait(driver,10);
        //put the condition of wait
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button#disable")));

        WebElement btn=driver.findElement(By.cssSelector("button#disable"));
        boolean status= btn.isEnabled();
        System.out.println(status);


    }
}
