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

    @Given("A user is logged in as $login with $password & a search page is opened")
    public void openSearchPageAsLoggedUser(String login, String password)
    {
        user.open_home_page();
        user.open_login_page();
        user.login_to_the_system(login, password);
        user.open_search_page_from_login_page();
    }

    @When("User enters $searchCriteria into search field & presses Search button")
    public void enterSearchCriteria(String searchCriteria)
    {
        user.enter_search_criteria(searchCriteria);
        user.press_search_button();
    }

    @Then("The user is given the relevant search results")
    public void checkSearchResults()
    {
        String searchResult = user.get_search_results();
        assert(!searchResult.contains("nothing was found!"));
    }

    @When("User enters $searchCriteria into search field on Search Page & presses Search button")
    public void enterSearchCriteriaOnSearchPage(String searchCriteria)
    {
        user.enter_search_criteria(searchCriteria);
        user.press_search_button();
    }
}
