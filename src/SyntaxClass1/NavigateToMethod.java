package SyntaxClass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToMethod {
    public static void main(String[] args)  throws InterruptedException { //<---this is here because of line 14. Thread.sleep

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("http://facebook.com/matus.Liptak.940");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.navigate().to("http://hovno.sk");
       // Thread.sleep(2000);
       // driver.navigate().back();
       // Thread.sleep(2000);
       // driver.navigate().forward();
       // Thread.sleep(2000);
       // driver.close();

    }
}
