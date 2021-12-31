package SyntaxClass3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathUsingText {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://syntaxprojects.com/");
        driver.manage().window().maximize();
        WebElement alertLink = driver.findElement(By.xpath("//a[text()='Alerts & Modals']"));
        alertLink.click();
    }
}