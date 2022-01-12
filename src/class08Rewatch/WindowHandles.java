package class08Rewatch;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandles {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
driver.manage().window().maximize();
//Task : open up a new tab and new window
WebElement newTab=driver.findElement(By.cssSelector("button#tabButton"));
WebElement newWindow=driver.findElement(By.cssSelector("button#windowButton"));
  newTab.click();
  newWindow.click();
//print the handle of the main/home page/parent page
        //get windowsHandle
        String parentPage=driver.getWindowHandle();
        System.out.println("parent window handle is :"+parentPage);

        //to switch to newtab and get the text
        //1get all handles
        Set<String> allHandles=driver.getWindowHandles();
        //2.find the desired handle i.e. of new tab by iterating through the set
        Iterator<String>it=allHandles.iterator();
        //3iterating over each handle to see if it is the desired one
        while(it.hasNext()) {
            String handler = it.next();
            driver.switchTo().window(handler);
            //now get the title and check if it is the desired tab or not
            if (driver.getCurrentUrl().equalsIgnoreCase("https://demoqa.com/sample")) {
                System.out.println(driver.getCurrentUrl());
                break;
            }
        }
//succesful switch
           WebElement text=driver.findElement(By.cssSelector("h1#sampleHeading"));
            System.out.println(text.getText());
//Task: click on new window message button

            //driver.switchTo().defaultContent();
             driver.switchTo().window(parentPage);

         driver.findElement(By.cssSelector("button#messageWindowButton")).click();
        driver.quit();
        }





        }


