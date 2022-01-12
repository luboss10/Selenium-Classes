package class05Rewatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();
// find the element dropdown
       WebElement days=driver.findElement(By.cssSelector("select#select-demo"));
      //  use the select class to select form drop down
Select select=new Select(days);

//1 METHOD select by index

//select.selectByIndex(1);
//Thread.sleep(2000);
//        select.selectByIndex(2);
//Thread.sleep(2000);
//        select.selectByIndex(3);
//        Thread.sleep(2000);
//        select.selectByIndex(4);
//        Thread.sleep(2000);
//        select.selectByIndex(7);
//
//        //2 METHOD select by visible text
//        select.selectByVisibleText("Thursday");
//
//// 3 METHOD select by value
//        select.selectByValue("Wednesday");

       List<WebElement> allOptions =select.getOptions();
       int size= allOptions.size();
        System.out.println(size);

        //iterate through list all options and get the text of each option
        for(int i=0; i<size; i++){

           String OptionText= allOptions.get(i).getText();
            System.out.println(OptionText);
        }
    }
}
