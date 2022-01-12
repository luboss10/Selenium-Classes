package AAA4Test;

import AAA1TestBase.BaseClass;
import AAA2Utils.CommonMethods;
import AAA3Pages.LoginPageWithPageFactory;
import org.openqa.selenium.WebElement;

public class LoginPageTestWithPageFactory {
    public static void main(String[] args) {

        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        //create an object with loginwith pageFactory
        LoginPageWithPageFactory loginWPF=new LoginPageWithPageFactory();
        WebElement user=loginWPF.username;
        CommonMethods.sendText(user,"Admin");
        WebElement passWord= loginWPF.password;
        CommonMethods.sendText(passWord,"Hum@nhrm123");
        loginWPF.loginBtn.click();
        //or this
        //loginWPF.username.sendKeys("Admin");
        //loginWPF.password.sendKeys("Hum@nhrm123");
        //loginWPF.loginBtn.click();


        //take a screenshot
        CommonMethods.takeScrShot("login page");

        //close browser
        BaseClass.tearDown();


    }
}
