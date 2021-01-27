Feature: Application Login

@WebTest
Scenario: Home Page default login
Given User is on netbanking landing page
When User logins into the application with "jin" and password "1234"
Then Home page is populated
And Cards displayed are "true"

@MobileTest
Scenario: Home Page default login
Given User is on netbanking landing page
When User logins into the application with "john" and password "4321"
Then Home page is populated
And Cards displayed are "false"

@MobileTest
Scenario: Home Page default login
Given User is on netbanking landing page
When User signup with following details
| jenny | abcd | jenny@abcd.com | Australlia | 24224242 |
Then Home page is populated
And Cards displayed are "false"

@WebTest
Scenario Outline: Home Page default login
Given User is on netbanking landing page
When User logins in to the application with <Username> and  <Password>
Then Home page is populated
And Cards displayed are "true"

Examples:
|Username |Password |
|user1 |pass1 |
|user2 |pass2 |
|user3 |pass3 |
|user4 |pass4 |
