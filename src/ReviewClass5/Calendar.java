package ReviewClass5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Calendar {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sastaticket.pk/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        //locating and clicking the calendar
        driver.findElement(By.xpath("//*[@class='dt_label'][1]")).click();

        //find the desired month
        WebElement month= driver.findElement(By.xpath("(//div[@class='react-datepicker__current-month'])[1]"));
        //print the current month
        System.out.println(month.getText());
        //get to the next btn
        WebElement nextBtn=driver.findElement(By.xpath("//button[@class='react-datepicker__navigation react-datepicker__navigation--next react-datepicker__navigation--next--with-today-button']"));
        //go to the month of september
        boolean notFound=true;
        while (notFound){
            if(month.getText().equalsIgnoreCase("September 2022")){
                System.out.println(month.getText());
                notFound=false;
                //select the date now
                List<WebElement> dates=driver.findElements(By.xpath("(//div[@class='react-datepicker__month'])[1]/div/div"));
                //find your desired dates// lets say 15th
                for(WebElement date:dates){
                    if(date.getText().equalsIgnoreCase("15")){
                        date.click();
                        break;
                    }
                }
            }
            else {
                nextBtn.click();
            }
        }
    }
}
