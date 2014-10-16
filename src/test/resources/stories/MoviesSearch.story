As a user
I want to find a movie

Scenario: Search without loging in
Given A search page is opened
When User enters The Ugly Truth into search field & presses Search button
Then The user is given the relevant search results


Scenario: Search by logged user
Given A user is logged in as myrka_t with Nthtynmtdf1985 & a search page is opened
When User enters Pretty Women into search field on Search Page & presses Search button
Then The user is given the relevant search results
