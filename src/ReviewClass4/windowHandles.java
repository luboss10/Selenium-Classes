package ReviewClass4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class windowHandles { // -is a unique alphanumeric ID

    public static String url="https://accounts.google.com/signin/v2/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        //
        WebElement gmail = driver.findElement(By.xpath("//a[text()='Terms']"));
        gmail.click();

        //print or get the handle of default page
        String mainPageHandle=driver.getWindowHandle();
        System.out.println("the current page handle is "+mainPageHandle);

        //to switch to terms page and click on overview //get all the window handles
        // select the one associated with terms window //switch to it and click on overview
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> it=windowHandles.iterator();
        while(it.hasNext()){
            //get window handle from set
            String handle =it.next();
            //now switch to this particular handle/window
            driver.switchTo().window(handle);
            //i need to make sure this is my desired window/tab
            //if condition
            if (driver.getCurrentUrl().equalsIgnoreCase("https://policies.google.com/terms?gl=US&hl=en")){
                System.out.println(driver.getTitle());
                break;
            }
        }
        driver.findElement(By.xpath("//a[text()='Overview']")).click(); //switching to overview

        driver.switchTo().defaultContent(); //back to default

    }
}