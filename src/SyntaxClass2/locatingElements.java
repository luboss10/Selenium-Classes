package SyntaxClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("Luboss10@gmail.com");
        // driver.findElement(By.name("email")).sendKeys("krokodil"); //will use the same box as the one above
        driver.findElement(By.name("pass")).sendKeys("PraveVajco");
        //driver.findElement(By.name("login")).click(); //will try to login--
        //driver.findElement(By.linkText("Forgot password?")).click();
        driver.findElement(By.partialLinkText("Forgot")).click(); // also works
        driver.quit();



    }
}
