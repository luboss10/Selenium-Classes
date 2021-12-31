package SyntaxClass8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.java2d.pipe.SpanClipRenderer;

import java.util.Iterator;
import java.util.Set;

public class WindowHadles {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        //TASK IS to open a new tab and a new window //

        //find new tab
        WebElement newTab=driver.findElement(By.xpath("//button[@id='tabButton']"));
        //find new window
        WebElement newWindow=driver.findElement(By.cssSelector("button#WindowButton"));

        //click on the new tab and window btn
        newTab.click();
        newWindow.click();

        //print the handle home/main page
        String homePagehandle=driver.getWindowHandle();
        System.out.println("homepage handle is : " +homePagehandle);

        Set<String> allWindowHandles= driver.getWindowHandles(); //we need to get all the handles, so we know where to switch

        //find the desired handle of newtab by itering throu set

        Iterator<String>it= allWindowHandles.iterator();
        while(it.hasNext()) {
            String handle = it.next();
            driver.switchTo().window(handle);
            if (driver.getCurrentUrl().equalsIgnoreCase("https://demoqa.com/sample")) {
                System.out.println(driver.getCurrentUrl());
                break;

            }
        }
        //successful switch
        WebElement text =driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println(text.getText());

        //click on new window message button
        driver.switchTo().defaultContent(); //first go back to home page //same thing -driver.switchTo().window(homePagehandle);

        //click on new window
        driver.findElement(By.cssSelector("button#messageWindowButton")).click();

        driver.quit();


    }
}
