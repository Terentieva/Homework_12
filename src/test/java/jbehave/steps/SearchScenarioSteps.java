package jbehave.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import steps.UserSteps;

public class SearchScenarioSteps {
    @Steps
    UserSteps user;

    @Given("A search page is opened")
    public void openSearchPageWithoutLogin()
    {
        user.open_home_page();
        user.open_search_page();
    }

    @Given("A login page is opened")
    public void openLoginPage()
    {
        user.open_home_page();
        user.open_login_page();
    }

    @When("User enters $searchCriteria into search field & presses Search button")
    public void enterSearchCriteria(String searchCriteria)
    {
        user.enter_search_criteria(searchCriteria);
        user.press_search_button();
    }

    @When("A user is enter $login login and $password password")
    public void loginToTheSystem(String login, String password)
    {
        user.login_to_the_system(login, password);
    }

    @Then("The user is given the relevant search results")
    public void checkSearchResults()
    {
        String searchResult = user.get_search_results();
        assert(!searchResult.contains("nothing was found!")): "Nothing was found";
    }

    @Then("The $username username should be peresent on page")
    public void enterSearchCriteriaOnSearchPage(String username)
    {
        String pageUsername = user.get_login_value();
        assert(pageUsername.contains(username)): "Username does not present on page";
    }
}
