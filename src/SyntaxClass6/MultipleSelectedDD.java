package SyntaxClass6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import sun.awt.windows.ThemeReader;

import java.util.Iterator;
import java.util.List;

public class MultipleSelectedDD {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();

        //find the webelement
        WebElement statesDD=driver.findElement(By.cssSelector("select#multi-select"));

        //we can use select class so we can make an object of select class
        Select select=new Select(statesDD);
        //check if the drop down is multiple
        Boolean isMultiple=select.isMultiple();
        System.out.println(isMultiple);

        select.selectByIndex(3);
        Thread.sleep(2000);
        select.selectByVisibleText("Texas");
        Thread.sleep(2000);
        select.selectByValue("Florida");
        Thread.sleep(2000);
        select.deselectByVisibleText("Texas");


        //use iterator to get all the options text and print in console
        List<WebElement>options=select.getOptions();
        Iterator<WebElement> it=options.iterator();
        while (it.hasNext()){
            System.out.println(it.next().getText());
        }
    }
}
