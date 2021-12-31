package ReviewClass3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RadioBtn {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        WebElement radiobtn=driver.findElement(By.xpath("(//*[@value='Male'])[2]"));
        System.out.println(radiobtn.isDisplayed());
        System.out.println(radiobtn.isEnabled());
        if (radiobtn.isEnabled()){
            radiobtn.click();
        }
        driver.quit();
    }
}
