package SyntaxClass7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandle {
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

        //in order to print all the window handles we need to iterate over the SET
        Iterator<String> it=allWindowHandles.iterator();
        signUPPage=it.next();
        String helpPageaHandle=it.next();
        String termPageHandle=it.next();
        String privacyPageaHandle=it.next();
        System.out.println("The handle the sign up page is : "+signUPPage);
        System.out.println("The handle the help page is : "+helpPageaHandle);
        System.out.println("The handle the term page is : "+termPageHandle);
        System.out.println("The handle the privacy page is : "+privacyPageaHandle);

        //switch to privacy page
        driver.switchTo().window(helpPageaHandle);
        System.out.println(driver.getTitle());


    }
}
