package SyntaxClass8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Implicitwait2 {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/dynamic-elements-loading.php");
        driver.manage().window().maximize();

        //declare a implicite wait for finding elements
        driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("button#startButton")).click();
        Thread.sleep(6000);

        WebElement text= driver.findElement(By.xpath("//div[@id='finish']/h4"));
        System.out.println(text.getText());

        driver.quit();
}
}

