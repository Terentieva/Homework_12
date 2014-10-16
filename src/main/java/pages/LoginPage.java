package pages;

import net.thucydides.core.annotations.findby.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.CacheLookup;

public class LoginPage extends PageObject {

    @CacheLookup
    @FindBy(xpath="//input[@type='text']")
    WebElement loginTextbox;

    @CacheLookup
    @FindBy(xpath="//input[@type='password']")
    WebElement passwordTextbox;

    @CacheLookup
    @FindBy(xpath="//input[@class='button']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath="//*[@href='/search']")
    WebElement searchLink;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterLogin(String login) {
        element(loginTextbox).clear();
        element(loginTextbox).sendKeys(login);
    }

    public void enterPassword(String password) {
        element(passwordTextbox).clear();
        element(passwordTextbox).sendKeys(password);
    }

    public void pressLoginButton()
    {
        element(loginButton).click();
    }

    public void clickSearchLink(){element(searchLink).click();}
}
