package ultimateqa.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import ultimateqa.com.utility.Utility;

public class LoginPage extends Utility {


    @CacheLookup
    @FindBy(id = "user[email]")
    WebElement errorMessage;

    @CacheLookup
    @FindBy(id = "user[password]")
    WebElement errorMessage1;
    @CacheLookup
    @FindBy(xpath = "//h2[@class='page__heading']")
    WebElement LoginButton;

    @CacheLookup
    @FindBy(xpath = "//li[contains(text(),'Invalid email or password.')]")
    WebElement emailField;

    @CacheLookup
    @FindBy(xpath = "//h2[@class='page__heading']")
    WebElement passwordField;


    public String verifyErrorMessage() {
        Reporter.log("verifyfyErrorMessage" + errorMessage.toString());
        return getTextFromElement(errorMessage);
    }

    public String verifyErrorMessage1() {
        Reporter.log("verifyerrorMessage1" + errorMessage1.toString());
        return getTextFromElement(errorMessage1);
    }

    public void clickOnLoginButton() {
        Reporter.log("clickOnLoginButton" + LoginButton.toString());
        clickOnElement(LoginButton);
    }


    public void enterEmailId(String email) {
        Reporter.log("" + emailField.toString());
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        Reporter.log("" + passwordField.toString());
        sendTextToElement(passwordField, password);
    }


}
