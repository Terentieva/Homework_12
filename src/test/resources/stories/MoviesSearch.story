As a user
I want to find a movie

Scenario: Search without loging in
Given A search page is opened
When User enters The Ugly Truth into search field & presses Search button
Then The user is given the relevant search results


Scenario: Login to the system
Given A login page is opened
When A user is enter myrka_t login and Nthtynmtdf1985 password
Then The myrka_t username should be peresent on page
