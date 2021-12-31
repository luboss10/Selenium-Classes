package ReviewClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.jws.WebMethod;
import java.util.concurrent.TimeUnit;

public class Class1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        WebElement firstName= driver.findElement(By.xpath("//*[@name='firstName']"));
        firstName.clear();
        firstName.sendKeys("Lubo");

        WebElement lastName= driver.findElement(By.xpath("//*[@name='lastName']"));
        lastName.clear();
        lastName.sendKeys("Lubotron");

        WebElement phone= driver.findElement(By.cssSelector("input[name='phone']"));
        phone.clear();
        phone.sendKeys("12345");

        WebElement email= driver.findElement(By.cssSelector("input#userName"));
        email.clear();
        email.sendKeys("Lubotron@gmail.com");

        WebElement address= driver.findElement(By.xpath("//*[@name='address1']"));
        address.clear();
        address.sendKeys("5th ave");

        WebElement city= driver.findElement(By.xpath("//*[@name='city']"));
        city.clear();
        city.sendKeys("NEW YORK");

        WebElement state= driver.findElement(By.xpath("//*[@name='state']"));
        state.clear();
        state.sendKeys("NY");

        WebElement postalCode= driver.findElement(By.xpath("//*[@name='postalCode']"));
        postalCode.clear();
        postalCode.sendKeys("11101");

        WebElement country= driver.findElement(By.xpath("//*[@name='country']"));
        Select s=new Select(country);
        s.selectByVisibleText("UNITED STATES"); //other are selectbyname,value

        WebElement userName= driver.findElement(By.xpath("//*[@name='email']"));
        userName.clear();
        userName.sendKeys("Lubotron");

        WebElement password= driver.findElement(By.xpath("//*[@name='password']"));
        password.clear();
        password.sendKeys("losos");

        WebElement confpassword= driver.findElement(By.xpath("//*[@name='confirmPassword']"));
        confpassword.clear();
        confpassword.sendKeys("losos");

        WebElement submitButton=driver.findElement(By.xpath("//*[@name='submit']"));
        submitButton.click();

        WebElement notificationMessage=driver.findElement(By.cssSelector("td p:nth-child(2) font"));
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        if (notificationMessage.isDisplayed()) {
            System.out.println("Task done");
        }else {
            System.out.println("fix it");
        }
        driver.quit();
    }

}
