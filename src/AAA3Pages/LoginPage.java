package AAA3Pages;

import AAA2Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends CommonMethods {

    public WebElement usernameField=driver.findElement(By.xpath("//*[@name='txtUsername']"));
    public WebElement passwordField= driver.findElement(By.xpath("//*[@name='txtPassword']"));
    public WebElement loginButton=driver.findElement(By.xpath("//*[@name='Submit']"));


}
