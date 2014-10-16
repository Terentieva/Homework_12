package pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.CacheLookup;

@DefaultUrl("http://www.ex.ua/")
public class HomePage extends PageObject {

    @CacheLookup
    @FindBy(xpath="//*[@href='/login']")
    WebElement enterButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openLoginPage() {
        element(enterButton).click();
    }
}
