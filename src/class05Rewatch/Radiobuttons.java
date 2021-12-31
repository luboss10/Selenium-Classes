package class05Rewatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        driver.manage().window().maximize();

        //getting the radiobutton webElement

        WebElement femaleRadioBtn=driver.findElement(By.xpath("//input[@value='Female'][@name='optradio']"));
        femaleRadioBtn.click();


//check if radio button is displayed
        boolean isDisplayed= femaleRadioBtn.isDisplayed();
        System.out.println("The radio button is displayed on the4 webPage   :"+ isDisplayed);
        //check if radio button is enabled
        boolean isEnabled=femaleRadioBtn.isEnabled();
        System.out.println("The radio button is enablend on the webPage   :"+isEnabled);

        //check if the radio button is selected
        femaleRadioBtn.isSelected();
        boolean isSelected= femaleRadioBtn.isSelected();
        System.out.println("the radio button is selected  :"+ isSelected);
    Thread.sleep(2000);
        driver.quit();
    }
}
