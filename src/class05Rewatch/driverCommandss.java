package class05Rewatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class driverCommandss {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://ebay.com");    //go to the webside ebay.com
        driver.manage().window().maximize();

        //get all the links that are there on ebay.com
        //as we have multiple elements with tag name and so we use driver.findElements
        List<WebElement> links = driver.findElements(By.tagName("a"));
//print the size of list
        System.out.println("The number of links is  :" + links.size());
        //print all the names of links

        for (WebElement link : links) {
            String linkText = link.getText();
            //only print links that have some text ignore the rest
            if (!linkText.isEmpty()) {
                System.out.println(linkText);
                //print all the links also along with the text use the method .getAttribute t
                //o have the value of a particular attribute in the tag
               String linkAddress= link.getAttribute("href");
                System.out.println(linkAddress);
                System.out.println("------------------------------------------");
            }
        }
    }}
