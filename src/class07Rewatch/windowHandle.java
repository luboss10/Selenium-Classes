package class07Rewatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class windowHandle {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");

        String signUpHandle= driver.getWindowHandle();
        System.out.println("the window handle for signup page is : "+signUpHandle);
//click on help
Thread.sleep(2000);
    WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
    helpBtn.click();
    Thread.sleep(3000);
    WebElement privacyBtn= driver.findElement(By.xpath("//a[text()='Privacy']"));
    privacyBtn.click();

    //if we want to do smth on privacy page we need to switch focus from main page
        //to get all the windows handles
       Set<String> windowHandls = driver.getWindowHandles();
        System.out.println(windowHandls);
        System.out.println(windowHandls.size());
        //in order ro print all window handles we need to iterate over the SET

        Iterator<String> it=windowHandls.iterator();
        while(it.hasNext()){
            //switch to help page
            String handle=it.next();
driver.switchTo().window(handle);
String title= driver.getTitle();
if(driver.getCurrentUrl().equalsIgnoreCase("https://support.google.com/accounts?hl=en#topic=3382296"));
            System.out.println(driver.getTitle());
            break;

        }

        /*signUpHandle=it.next();
        String helpHandle=it.next();
        String privacyHandle=it.next();
        System.out.println("The handle for signup page is:"+signUpHandle);
        System.out.println("The handle for help page is:"+helpHandle);
        System.out.println("The handle for privacy page is:"+privacyHandle);
//switch to privacy page
        driver.switchTo().window(helpHandle);
        System.out.println(driver.getTitle());
        driver.quit();*/






    }
}
