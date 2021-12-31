package SyntaxClass5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();

        //find the webElement "drop down"
        WebElement days=driver.findElement(By.cssSelector("select#select-demo"));
        //use the select class to select from drop down
        Select select=new Select(days);

        //select the value by index
        select.selectByIndex(1);
        Thread.sleep(2000);
        select.selectByIndex(7);
        Thread.sleep(2000);

        //select by visible text
        select.selectByVisibleText("Friday");

        //select by value
        select.selectByValue("Thursday");

        List<WebElement> getAllOptions=select.getOptions();
        int size=getAllOptions.size();
        System.out.println(size);       //will print out how many elements are there//how many options
        for(WebElement option: getAllOptions){ // list of all and getting text of each option
         String str=option.getText();
            System.out.println(str);

           // for (int i = 0; i < size; i++) {
            //    String optionText=allOptions.get(i).getText();              //same as the first one
           //     System.out.println(optionText);




            }
    }
}
