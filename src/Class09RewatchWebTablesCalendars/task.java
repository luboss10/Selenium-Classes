package Class09RewatchWebTablesCalendars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class task {
    //click on enable button after 10 sec
    //once the button is enabled print the state of button

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://chercher.tech/practice/explicit-wait");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        WebElement btn=driver.findElement(By.xpath("//*[@id='enable-button']"));
        btn.click();
//print the state of the button after it is enabled
        WebDriverWait wait= new WebDriverWait(driver, 20);
        //condition

       wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button#disable")));
       //print the status of button if its enabled or not
        WebElement button =driver.findElement(By.cssSelector("button#disable"));
        boolean b=button.isEnabled();
        System.out.println(b);
        }

    }

