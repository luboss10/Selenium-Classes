package ReviewClass4;

import AAA1TestBase.BaseClass;
import AAA2Utils.CommonMethods;
import AAA3Pages.LoginPageWithPageFactory;
import org.openqa.selenium.WebElement;

public class task1 {
    //1.goto http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard
    //2. Enter user name and wrong password
    //3.Hit the login Button
    //4. take screen shot
    //guidelines:
    //create
    //1.Base class--> Open and close browser method
    //2.utils-->common methods
    //it will have the methods to
    //a. send keys
    //b. take screen shot
    //3.page --> all the needed elements of the login page
    //" use with page factory to initialize all elements"
    //HINT
    //@Findby (id='txtusername')
    //public WebElement username;
    //don't forget to initialize by calling constructor:)

    //baseclass-->open and close driver method
    //common methods---> commonly used methods
    //pages---> locate all the elemnts that we need to use
    // we have 2 methods we can implement to locate the elements
    //1.the old one --driver.findElements(By.id());
    //2.using page factory annotations
    // ----page factory

    //@FindBy(id="some thing")
    //public WebElement userName;

    //call the constructor to initialize all the elements
    //public void loginWithPageFactory

    //loginPageTest
    public static void main(String[] args) {

        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        //create an object with loginwith pageFactory
        LoginPageWithPageFactory loginWPF=new LoginPageWithPageFactory();
        WebElement user=loginWPF.username;
        CommonMethods.sendText(user,"Admin");
        WebElement passWord= loginWPF.password;
        CommonMethods.sendText(passWord,"Hum@nhrm12");
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



