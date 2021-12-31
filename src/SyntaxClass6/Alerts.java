package SyntaxClass6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.uitestpractice.com/Students/Switchto");
        driver.manage().window().maximize();

        //enable the alert
        driver.findElement(By.cssSelector("button#alert")).click();
        //swith the focus of selenium
        Alert simpleAlert = driver.switchTo().alert();
        simpleAlert.accept();
        simpleAlert.dismiss();

        //handling confirmation alert //enabling the confirmation alert
        driver.findElement(By.cssSelector("button#confirm")).click();
        //switch the focus
        Alert confirmationAlert = driver.switchTo().alert();
        //get text from this alert
        System.out.println(confirmationAlert.getText());
        //cancel the alert
        confirmationAlert.dismiss();
        Thread.sleep(2000);

        //prompt alert //enable
        driver.findElement(By.cssSelector("button#prompt")).click();

        //switch focus
        Alert promptAlert = driver.switchTo().alert();

        //send k=some text
        promptAlert.sendKeys("Hello, i need some rest");

        //accept
        promptAlert.accept();

    }

}
