package AAA4Test;

import AAA2Utils.CommonMethods;
import AAA3Pages.LoginPage;
import AAA1TestBase.BaseClass;
import org.openqa.selenium.WebElement;


public class LoginPageTest {
    public static void main(String[] args) {
        //open the browser and navigate to http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard

        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        //locate elements and send keys

        LoginPage loginPage=new LoginPage();
        WebElement username=loginPage.usernameField;
        CommonMethods.sendText(username,"Admin");
        WebElement password= loginPage.passwordField;
        CommonMethods.sendText(password,"Hum@nhrm123");
        loginPage.loginButton.click();


    }
}
