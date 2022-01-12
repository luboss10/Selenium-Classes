package SyntaxClass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MissionImpossible {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("http://amazon.com");
        String url= driver.getCurrentUrl();
        System.out.println("The current URL loaded in browser is "+ url);

        driver.quit();

    }
}
