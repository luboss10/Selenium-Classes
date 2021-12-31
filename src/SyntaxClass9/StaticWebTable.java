package SyntaxClass9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class StaticWebTable {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/table-search-filter-demo.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        //print all the row of the webtable in console
        //1.locate the rows in the table using xpath and savw it in a variable
         List<WebElement> tableRows=driver.findElements(By.xpath("//*[@id='task-table']/tbody/tr[2]/td[2]"));
         //print number of rows
        System.out.println("number of rows in the table is : "+tableRows.size() );
        //Iterate
       for(WebElement row: tableRows){
           String text=row.getText();
           System.out.println(text);
       }
       //print all the headers
        List<WebElement> headers=driver.findElements(By.xpath("//table[@id='task-table']/thead/tr"));
       for(WebElement prheader: headers){
           String t= prheader.getText();
           System.out.println(t);
       }
       //print the second column locate the column using locator

        List<WebElement> col2=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/th"));
        for(WebElement col:col2){
        System.out.println("the data for column two is: "+col.getText());

        }
    }
}
