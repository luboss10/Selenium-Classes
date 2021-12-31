package SyntaxClass6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1 { //use iteretor to get all the options text and print in console
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.uitestpractice.com/Students/Switchto");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@id='prompt']")).click();

        //switch focus
        Alert promptAlert = driver.switchTo().alert();

        //send k=some text
        promptAlert.sendKeys("Hello, i need some rest");

        //accept
        promptAlert.accept();






    }
}
