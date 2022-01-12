package class06Rewatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class multipleSelect {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");

       WebElement statesDD= driver.findElement(By.cssSelector("select#multi-select"));
      //we can use select class so we will make an object of select class
        Select select= new Select(statesDD);
        //check if drop down is multiple
       boolean multiple= select.isMultiple();
        System.out.println(multiple);
        select.selectByIndex(2);
        Thread.sleep(2000);
        select.selectByVisibleText("Ohio");
        Thread.sleep(2000);
        select.selectByValue("Texas");

        Thread.sleep(2000);
        select.deselectByVisibleText("Texas");

        List<WebElement> allOptions =select.getOptions();
        int size= allOptions.size();

        for(int i =0; i<size; i++) {
            String options = allOptions.get(i).getText();
            System.out.println(options);
        }
        List<WebElement> options =select.getOptions();
            Iterator<WebElement> it=options.iterator();
            while(it.hasNext()){
                System.out.println(it.next().getText());
            }

        }

    }

