package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.yecht.Data;
import org.yecht.JechtIO;
import pages.HomePage;
import pages.LoginPage;
import pages.SearchPage;

public class UserSteps extends ScenarioSteps{
    //@Given

    HomePage homePage;
    LoginPage loginPage;
    SearchPage searchPage;

    public UserSteps(Pages pages)
    {
        super(pages);
        homePage = getPages().get(HomePage.class);
        loginPage = getPages().get(LoginPage.class);
        searchPage = getPages().get(SearchPage.class);
    }

    @Step
    public void open_home_page()
    {
        homePage.open();
    }

    @Step
    public void open_login_page()
    {
        homePage.openLoginPage();
    }

    @Step
    public void login_to_the_system(String login, String password)
    {
        loginPage.enterLogin(login);
        loginPage.enterPassword(password);
        loginPage.pressLoginButton();
    }

    @Step
    public void open_search_page()
    {
        searchPage.openSearchPage();
    }

    @Step
    public void enter_search_criteria(String searchCriteria)
    {
        searchPage.setSearchValue(searchCriteria);
    }

    @Step
    public void press_search_button()
    {
        searchPage.search();
    }

    @Step
    public String get_search_results()
    {
        return searchPage.getSearchResult();
    }

    @Step
    public String get_login_value()
    {
        return loginPage.getLoginMenuValue();
    }
}