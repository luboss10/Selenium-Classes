package class05Rewatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverCommands {
    /*Task : navigate to the given website fill the username "AON"
     delete the username and fill the new username "Tester"*/

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();
        //find the WebElement
        WebElement userName= driver.findElement(By.cssSelector("input#ctl00_MainContent_username"));
        //send in text AON
        userName.sendKeys("AON");
        //delete the username entered
        Thread.sleep(2000);
        userName.clear();
        //Enter the new username
        Thread.sleep(2000);
        userName.sendKeys("Tester");

    }
}
