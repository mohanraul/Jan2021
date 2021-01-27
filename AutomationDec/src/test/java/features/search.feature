Feature: Search and place order for vegetables

@SmokeTest
Scenario: Search for items and validate results
Given User is on Greencart landing page
When User serached for Cucumber vegetable
Then "Cucumber" results are displayed


@RegressionTest
Scenario Outline: Search for items and then move to checkout page
Given User is on Greencart landing page
When User serached for <Name> vegetable
And Added item to cart
And User proceeded to checkout page for purchase
Then Verify selected <Name> items are displayed in checkout page

Examples:
|Name |
|Brinjal |
|Beetroot |

