package AAA4Test;

import AAA1TestBase.BaseClass;
import AAA2Utils.CommonMethods;
import AAA3Pages.DashBoardPage;
import AAA3Pages.LoginPageWithPageFactory;
import org.openqa.selenium.WebElement;

import java.util.Base64;

public class dashboardPageTest {
    public static void main(String[] args) {
        //open the browser and login
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        LoginPageWithPageFactory loginWPF=new LoginPageWithPageFactory();
        WebElement user=loginWPF.username;
        CommonMethods.sendText(user,"Admin");
        WebElement passWord= loginWPF.password;
        CommonMethods.sendText(passWord,"Hum@nhrm123");
        loginWPF.loginBtn.click();

        //test the dashboard page for the Welcome element task

        DashBoardPage dashBoard=new DashBoardPage();
        WebElement message=dashBoard.welcomeMessage;
        System.out.println(message.getText());

        //take screenshot
        CommonMethods.takeScrShot("Dash Board Page");

    }
}
