package SyntaxClass3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("http://www.syntaxprojects.com");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div/div[2]/div[1]/p[2]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/a[1]")).click();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[2]/form/div/input")).click(); //doesnt work with xpath shortcut
        driver.findElement(By.xpath("(/html/body/div[2]/div/div[2]/div/div[2]/form/button)[1]")).sendKeys("Brafik");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[2]/form/button")).click();



    }
}
