package ultimateqa.com.pages;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import ultimateqa.com.utility.Utility;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(linkText = "Sign In")
    WebElement signLink;

    public void clickOnsignLink() {
        Reporter.log("clickOnsignLink" + signLink.toString());
        clickOnElement(signLink);

    }


}
