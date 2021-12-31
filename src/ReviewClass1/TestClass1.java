package ReviewClass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe"); //set the path of the driver

        WebDriver driver=new ChromeDriver(); //browser launched
        driver.get("http://google.com");
        driver.manage().window().maximize();

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        driver.quit();
    }
}
