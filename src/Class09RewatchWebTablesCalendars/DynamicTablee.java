package Class09RewatchWebTablesCalendars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DynamicTablee {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);


        driver.findElement(By.cssSelector("input#ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.cssSelector("input#ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.cssSelector("input#ctl00_MainContent_login_button")).click();


       List <WebElement> rows= driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
        for(int i=1; i<rows.size(); i++){
            String text= rows.get(i).getText();
            System.out.println(text);
            //check the chexbox if the row has the product screensaver
            if(text.contains("ScreenSaver")) {
                List<WebElement> checkBox = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[1]"));
                checkBox.get(i-1).click();
            }}
    }
}
