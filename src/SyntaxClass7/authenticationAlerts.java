package SyntaxClass7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class authenticationAlerts {
    public static void main(String[] args)  throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
                          //username:password

    }
}
