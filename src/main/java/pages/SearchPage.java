package pages;

import net.thucydides.core.annotations.findby.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.CacheLookup;

public class SearchPage extends PageObject {

    @CacheLookup
    @FindBy(xpath="//*[@href='/search']")
    WebElement searchLink;


    @CacheLookup
    @FindBy(id="search_text")
    WebElement searchTextbox;

    @CacheLookup
    @FindBy(id="search_button")
    WebElement searchButton;

    @CacheLookup
    @FindBy(xpath=".//*[@id='body_element']/p")
    WebElement searchResult;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void openSearchPage() {
        element(searchLink).click();
    }

    public void setSearchValue(String searchDescription) {
        //element(searchTextbox).clear();
        element(searchTextbox).sendKeys(searchDescription);
    }

    public void search()
    {
        element(searchButton).click();
    }

    public String getSearchResult()
    {
        return element(searchResult).getText();
    }
}
