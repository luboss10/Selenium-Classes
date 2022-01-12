package ReviewClass4;

import AAA1TestBase.BaseClass;
import AAA2Utils.CommonMethods;
import AAA3Pages.DashBoardPage;
import AAA3Pages.LoginPageWithPageFactory;
import SyntaxClass9.task;
import org.openqa.selenium.WebElement;

public class task2 {
/*        1.goto http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard
          2.login
           For this step you will create just a new test "DashBoard Page Test" and simply use the same code that u wrote for task1
             CODE REUSEABILITY
          3.locate the element "Welcome Admin: on top right corner and print on console
          4.take screenshot of the page
    HINTS:
    to do this task you need to  create a new page "Dashboard page" having all the elements you need
    use @find by to find the desired elements
    rest of the classes are most probably not going to change, and you will use the same methods you have implemented earlier

 */
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
