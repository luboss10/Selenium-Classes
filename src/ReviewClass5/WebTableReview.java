package ReviewClass5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTableReview {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);


        driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin"); //for username
        driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("Hum@nhrm123"); //for password
        driver.findElement(By.cssSelector("input#btnLogin")).click(); //for login btn and click

        driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/b")).click();
        driver.findElement(By.xpath("//*[@id='menu_pim_viewEmployeeList']")).click();

        //code to delete the employee from the table
        //delete the row with employee id
        boolean notFound=true;
        while (notFound) {
            //1.locate the table and get all rows
        List<WebElement> list=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
        for (int i = 0; i < list.size(); i++) {
            //get the text out of the webelement in the list
            String text = list.get(i).getText();
            //check if the row contains the id we're trying to locate

            if (text.contains("25677A")) {
                System.out.println("index of this ID is" + i);
                String xpath = "//*[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td/input"; // CLICKING PARTICULAR CHECKBOX
                WebElement checkbox = driver.findElement(By.xpath(xpath));
                checkbox.click();
                System.out.println("the xpath to is: " + xpath);
                //we found the desired row si we need to end the while loop
                notFound = false;
                //we break the loop
                break;
            }
        }
        //click on the next btn once the loop has traversed the whole list(of the current page)
        if (notFound){
            WebElement nextBtn=driver.findElement(By.xpath("(//a[text()='Next'])[1]"));
            nextBtn.click();

        }
    }
}
}

