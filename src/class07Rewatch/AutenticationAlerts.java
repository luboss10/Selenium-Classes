package class07Rewatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutenticationAlerts {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //the actual url:http://accounts.google.com/signup
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        //for autentication alerts we need username and password in the url
        //htpps://admin::admin@the-internet.herokuapp.com/basic_auth


    }
}
