package Review14FramesAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Class1 {
    public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("http://demo.guru99.com/test/newtours/register.php");
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

   WebElement fName= driver.findElement(By.xpath("//*[@name='firstName']"));
   fName.clear();
   fName.sendKeys("Hensha");

        WebElement lName= driver.findElement(By.xpath("//*[@name='lastName']"));
        lName.clear();
        lName.sendKeys("Henshova");

        WebElement phone= driver.findElement(By.xpath("//*[@name='phone']"));
        phone.clear();
        phone.sendKeys("7856541236");

        WebElement email= driver.findElement(By.cssSelector("input#userName"));
        email.clear();
        email.sendKeys("Hensha@gmail.com");

        WebElement address= driver.findElement(By.xpath("//*[@name='address1']"));
        address.clear();
        address.sendKeys("1235 Astoria");

        WebElement city= driver.findElement(By.xpath("//*[@name='city']"));
        city.clear();
        city.sendKeys("Woodside");

        WebElement state= driver.findElement(By.xpath("//*[@name='state']"));
       state.clear();
        state.sendKeys("NY");

        WebElement postalCode= driver.findElement(By.xpath("//*[@name='postalCode']"));
        postalCode.clear();
        postalCode.sendKeys("11111");

        WebElement country= driver.findElement(By.xpath("//*[@name='country']"));

        Select s=new Select(country);
        s.selectByVisibleText("UNITED STATES");

        WebElement userName= driver.findElement(By.cssSelector("input#email"));
        userName.clear();
        userName.sendKeys("123@gmail.com");

        WebElement userN= driver.findElement(By.xpath("//*[@name='userName']"));
        userN.clear();
        userN.sendKeys("123@gmail.com");

        WebElement passw= driver.findElement(By.xpath("//*[@name='password']"));
        passw.clear();
        passw.sendKeys("11111111");
        //WebElement passw= driver.findElement(By.cssSelector("input#password")).sendKeys(1111); we dont use it cuz if there is a change we'll have to change it in xy test(we create a key which is used and can be changed in all tests cases at once)

        WebElement confirmP= driver.findElement(By.xpath("//*[@name='confirmPassword']"));
        confirmP.clear();
        confirmP.sendKeys("11111111");

        WebElement SubmitBtn=driver.findElement(By.xpath("//*[@name='submit']"));
        SubmitBtn.click();

        WebElement notificationMessage= driver.findElement(By.cssSelector("td p:nth-child(2) font"));
        //another xpath "//b[contains(text(),Note:'Your user name is')"]
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        if(notificationMessage.isDisplayed()) {
            System.out.println("Task done");
        }else {
            System.out.println("Work on fixing it");
        }
            driver.quit();

        }
    }
