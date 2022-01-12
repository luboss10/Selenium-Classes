package SyntaxClass11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Calendar { //practise
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin"); //for username
        driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("Hum@nhrm123"); //for password
        driver.findElement(By.cssSelector("input#btnLogin")).click(); //for login btn and click

        WebElement leaveButton = driver.findElement(By.id("menu_leave_viewLeaveModule"));
        leaveButton.click();
        //======================DEALING WITH CALENDARS======================
        //open calendar
        driver.findElement(By.cssSelector("input#calFromDate")).click();
        //select a month
        WebElement month = driver.findElement(By.cssSelector("select.ui-datepicker-month"));
        //use select class
        Select select = new Select(month);
        select.selectByVisibleText("Aug");
        //select a year
        WebElement year = driver.findElement(By.cssSelector("select.ui-datepicker-year"));
        //use select class
        Select select1 = new Select(year);
        select1.selectByValue("2022");
        //select a particular date from the table
        List<WebElement> dates = driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr/td/a"));
        for (WebElement date : dates) {
            String dateText = date.getText();
            if (dateText.equalsIgnoreCase("15")) {
                date.click();
            }

        }
    }
}