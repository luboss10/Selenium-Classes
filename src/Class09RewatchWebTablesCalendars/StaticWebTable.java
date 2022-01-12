package Class09RewatchWebTablesCalendars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class StaticWebTable {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/table-search-filter-demo.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        //print all the row of the webtable in console
        //1.locate the rows in the table using xpath and savw it in a variable

        List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        System.out.println(tableRows.size());
//2. iterate thru rows
        for (WebElement row : tableRows) {
            //String text= row.getText();
            System.out.println(row.getText());
        }
            //3.print all the headers

            List<WebElement> headers = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[2]"));

            for (WebElement header : headers) {
                System.out.println(header.getText());
            }
            List<WebElement> heads=driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
        System.out.println(heads.size());
        for(WebElement head:heads){
            System.out.println(head.getText());
        }


        }
    }

