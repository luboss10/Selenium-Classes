package class05Rewatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.plugin.dom.core.Element;

import java.util.List;

public class checkBoxes {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");
        WebElement singleCheckbox = driver.findElement(By.cssSelector("input#isAgeSelected"));
        singleCheckbox.click();
        Thread.sleep(2000);
        // uncheck the check box
        singleCheckbox.click();
        //check all checkboxes

        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        checkBoxes.size();
        System.out.println("the number of checkboxes is :" + checkBoxes.size());

        for (WebElement checkBox : checkBoxes) {
            checkBox.click();


            String valueOfAtt = checkBox.getAttribute("value");
            System.out.println(valueOfAtt);
            //check only whose value is "option-3"
            if (valueOfAtt.equalsIgnoreCase("Option-3")) {
                //  checkBox.click();


            }
        }
    }
}
