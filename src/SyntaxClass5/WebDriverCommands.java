package SyntaxClass5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();

        WebElement userName=driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']")); //or byt BY.cssselector input#ctl00$MainContent$username]
        //send in the text AON
        userName.sendKeys("AON");
        //delete the user name entered
        Thread.sleep(2000);
        userName.clear();
        //enter new user name
        Thread.sleep(2000);
        userName.sendKeys("Tester");


    }
}
