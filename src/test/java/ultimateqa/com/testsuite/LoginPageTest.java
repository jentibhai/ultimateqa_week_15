package ultimateqa.com.testsuite;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ultimateqa.com.pages.HomePage;
import ultimateqa.com.pages.LoginPage;
import ultimateqa.com.testbase.BaseTest;

public class LoginPageTest extends BaseTest {
    HomePage homepage ;
    LoginPage loginpage ;
    @BeforeMethod(alwaysRun = true)
    public void inIt(){loginpage =new LoginPage();}


    @Test (groups = {"sanity","regression"})
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
        homepage.clickOnsignLink();
        String expectedText = "Welcome Back!";
        String actualText = loginpage.verifyErrorMessage1();
        Assert.assertEquals(actualText,expectedText,"Welcome Back!");

    }

    @Test(groups = {"smoke","regression"})

    public void verifyTheErrorMessage(){

        homepage.clickOnsignLink();
        loginpage.enterEmailId("paijanehal@gmail.com");
        loginpage.enterPassword("nehal123");
        loginpage.clickOnLoginButton();

        String expectedText = "Invalid email or password.";
        String actualText = loginpage.verifyErrorMessage();
        Assert.assertEquals(actualText,expectedText,"Invalid email or password.");



    }



}
