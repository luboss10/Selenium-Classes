package ReviewClass4;

import AAA1TestBase.BaseClass;
import AAA2Utils.CommonMethods;
import AAA3Pages.LoginPageWithPageFactory;
import org.openqa.selenium.WebElement;

public class task3 {
    //go to admin page and find a specific user
    //Admin btn element will be in side the dashboard page
    //create a new test -->adminPageTest

    public static void main(String[] args) {
        //open the browser and login
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        LoginPageWithPageFactory loginWPF = new LoginPageWithPageFactory();
        WebElement user = loginWPF.username;
        CommonMethods.sendText(user, "Admin");
        WebElement passWord = loginWPF.password;
        CommonMethods.sendText(passWord, "Hum@nhrm123");
        loginWPF.loginBtn.click();

    }
}