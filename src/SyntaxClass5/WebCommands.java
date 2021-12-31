package SyntaxClass5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();

        //get all the links that are there on ebay.com // all the links reside in <a>tag
        List<WebElement> links = driver.findElements(By.tagName("a"));  //more than one element, so don't forget to use elements instead of element
        //print the size of the list
        System.out.println("The size of list contain links is "+links.size());
        //print all the text of each link
        for(WebElement link :links) {
            String linkText = link.getText();
            //only print the links that have some text and ignore the rest
            if (!linkText.isEmpty()) {
                System.out.println(linkText);
                //print all the links also along with the text
                //use the method .getatrribute to have the value of the particular attribute in a tag
                String linkAddress=link.getAttribute("href");
                System.out.println(linkAddress);
            }

        }

    }
}
