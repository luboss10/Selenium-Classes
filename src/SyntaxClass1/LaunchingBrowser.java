package SyntaxClass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        // ChromeDriver driver= new ChromeDriver();
        driver.get("http://www.google.com");

        //returns the current url loading in the browser
        String url= driver.getCurrentUrl();
        System.out.println("The current URL loaded in browser is "+ url);

        //returns the title of the current page
        String title= driver.getTitle();
        System.out.println("The current title of the page is : "+ title);

        //close the browser
        driver.quit();
        System.out.println("Closes the browser");

    }
}
