package SyntaxClass5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");
        driver.manage().window().maximize();
        //navigate to syntax checkbox demo and check the first check box

        WebElement singleCheckBox=driver.findElement(By.cssSelector("input#isAgeSelected"));
        singleCheckBox.click();
        Thread.sleep(2000);
        //uncheck the check box
        singleCheckBox.click();

        //Check all the text boxes simultaneously
        List<WebElement> checkBoxes=driver.findElements(By.xpath("//input[@class='cb1-element']"));
        int size= checkBoxes.size();
        System.out.println("The number of checkboxes is :"+size);

        for(WebElement checkbox :checkBoxes){
         //   checkbox.click(); -would select every box

            //get attribute value
          String valueOfAttribute= checkbox.getAttribute("value");
            System.out.println(valueOfAttribute);
            //check only value is "option-3"
            if(valueOfAttribute.equalsIgnoreCase("Option-3")){
                checkbox.click(); //click on the checkbox whose attribute value is 3
            }

        }



    }}
