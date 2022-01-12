package SyntaxClass8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandle1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
        driver.manage().window().maximize();

        //get the address /handle of this page/window
        String signUPPage=driver.getWindowHandle();
        System.out.println("The window handle dor sign up page is : "+  signUPPage);

        //locate the buttons help,terms,privacy
        WebElement helpBtn= driver.findElement(By.xpath("//a[text()='Help']"));
        WebElement termBtn=driver.findElement(By.xpath("//a[text()='Terms']"));
        WebElement privacyBtn=driver.findElement(By.xpath("//a[text()='Privacy']"));

        //click on them to open up the new windows
        helpBtn.click();
        termBtn.click();
        privacyBtn.click();

        //we havent switched the focus so we still on sign up page/main/home
        //to get all the windows handles
        Set<String> allWindowHandles= driver.getWindowHandles();
        //print the size of window handles
        System.out.println("Number if window handles is : "+ allWindowHandles.size());

        //in order to print all window handles we need to iterate over the Set
        Iterator<String> it=allWindowHandles.iterator();

        while(it.hasNext()){
            //switch to terms page
            String handle =it.next();
            //no switch to this particular handle/window
            driver.switchTo().window(handle);
            //i need to make sure this is my desired window/tab
            String title=driver.getTitle();
            //if condition
            if (title.equalsIgnoreCase("Google Account Help")){
                System.out.println(title);
                break;
            }
        }

    }
}
