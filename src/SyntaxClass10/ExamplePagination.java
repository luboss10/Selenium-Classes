package SyntaxClass10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ExamplePagination {
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

        //==================Dealing with tht table===================================
                //*******************************************************************************************
                  //AS STALE ELEMENT EXCEPTION IS THERE SO ITS REQUIRED TO FIND THE ELEMENT INSIDE THE LOOP EVERY TIME
        // List<WebElement> tableRows=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")); //we dont need it bcuz we are reassigning it in while loop
        //locate the next btn
        //WebElement nextBtn=driver.findElement(By.xpath("(//a[text()='Next'])[1]")); // DONT NEED IT HERE SICE ITS USED IN IF CONDITION
        //iterate through the list and look for required id 26335A
//****************************************************************************************************8

       //declare a boolean that will be a flag to control the refreshing ou r list wt=ith the new entries of the next page  until we find desired row of the entry
        boolean notFound=true;
        while (notFound) {
            //relocate the rows after the page is refreshed to avoid stale element exception
            List<WebElement> tableRows=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
            for (int i = 0; i < tableRows.size(); i++) {
                //get the text out of the webelement in the list
                String text = tableRows.get(i).getText();
                //check if the row contains the id we're trying to locate

                if (text.contains("26335A")) {
                    System.out.println("i found the text for you "+i);
                    String xpath="//*[@id='resultTable']/tbody/tr["+(i+1)+"]/td/input"; // CLICKING PARTICULAR CHECKBOX
                    WebElement checkbox = driver.findElement(By.xpath(xpath));
                    checkbox.click();
                    System.out.println("the xpath to is: "+xpath);
                    //we found the desired row si we need to end the while loop
                    notFound=false;
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
// check the checkbox associated with the id