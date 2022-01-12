package SyntaxClass11;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JavaScriptExecutorDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        WebElement username = driver.findElement(By.id("txtUsername"));
        WebElement password = driver.findElement(By.id("txtPassword"));
        username.sendKeys("Admin");
        password.sendKeys("Hum@nhrm123");

        JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript("arguments[0].style.border='5px solid yellow'",username); // can change px size and color
        jse.executeScript("arguments[0].style.background='yellow'", password);

        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        jse.executeScript("arguments[0].click();", loginButton);

    }
}
