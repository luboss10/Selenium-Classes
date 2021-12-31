package SyntaxClass5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");
        driver.manage().window().maximize();

        //get the radio button webelement
        WebElement femaleRadioButton= driver.findElement(By.xpath("//input[@value='Female'][@name='optradio']"));
       // femaleRadioButton.click();

        //check if the radio button is displayed
        boolean isDisplayed=femaleRadioButton.isDisplayed();
        System.out.println("The radio button is displayed on the webpage :"+isDisplayed);

        //checks if the radio button is enabled
        boolean isEnabled= femaleRadioButton.isEnabled();
        System.out.println("The radio button is enabled on the webpage :"+isEnabled);

        //check if the radio button is Selected
        boolean isSelected=femaleRadioButton.isSelected();
        System.out.println("The radio button is Selected on the webpage :"+isSelected);

        //select the female radio button only if its enabled
        if(isEnabled){
            femaleRadioButton.click();
        }
        //after clicking the button print if its selected or not
        isSelected=femaleRadioButton.isSelected();
        System.out.println("The radio button is Selected on the webpage :"+isSelected);



    }
}