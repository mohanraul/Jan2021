$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/search.feature");
formatter.feature({
  "name": "Search and place order for vegetables",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Search for items and then move to checkout page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "name": "User is on Greencart landing page",
  "keyword": "Given "
});
formatter.step({
  "name": "User serached for \u003cName\u003e vegetable",
  "keyword": "When "
});
formatter.step({
  "name": "Added item to cart",
  "keyword": "And "
});
formatter.step({
  "name": "User proceeded to checkout page for purchase",
  "keyword": "And "
});
formatter.step({
  "name": "Verify selected \u003cName\u003e items are displayed in checkout page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Name"
      ]
    },
    {
      "cells": [
        "Brinjal"
      ]
    },
    {
      "cells": [
        "Beetroot"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Search for items and then move to checkout page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "name": "User is on Greencart landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinations.MyStepDefinitions.user_is_on_greencart_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User serached for Brinjal vegetable",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinations.MyStepDefinitions.user_serached_for_something_vegetable(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Added item to cart",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.MyStepDefinitions.added_item_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User proceeded to checkout page for purchase",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.MyStepDefinitions.user_proceeded_to_checkout_page_for_purchase()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify selected Brinjal items are displayed in checkout page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.StepDefination.verify_selected_items_are_displayed_in_checkout_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Search for items and then move to checkout page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "name": "User is on Greencart landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinations.MyStepDefinitions.user_is_on_greencart_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User serached for Beetroot vegetable",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinations.MyStepDefinitions.user_serached_for_something_vegetable(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Added item to cart",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.MyStepDefinitions.added_item_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User proceeded to checkout page for purchase",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.MyStepDefinitions.user_proceeded_to_checkout_page_for_purchase()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify selected Beetroot items are displayed in checkout page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.StepDefination.verify_selected_items_are_displayed_in_checkout_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});