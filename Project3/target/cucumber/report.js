$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/login.Feature");
formatter.feature({
  "name": "Application Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Home page default login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@MobileTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I log in to the Website",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepDef.iLogInToTheWebsite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I clicked on the buy again",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepDef.i_clicked_on_the_buy_again()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDef.thePageIsDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Search for items and then move to checkout page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@WebTest"
    }
  ]
});
formatter.step({
  "name": "User is on Greencart Landing page",
  "keyword": "Given "
});
formatter.step({
  "name": "User searched for \u003cName\u003e Vegetable",
  "keyword": "When "
});
formatter.step({
  "name": "Added items to cart",
  "keyword": "And "
});
formatter.step({
  "name": "User proceeded to Checkout page for purchase",
  "keyword": "And "
});
formatter.step({
  "name": "verify selected \u003cName\u003e items are displayed in Check out page",
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
      "name": "@WebTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Greencart Landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepDef.user_is_on_greencart_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searched for Brinjal Vegetable",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepDef.user_searched_for_vegetable(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Added items to cart",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepDef.added_items_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User proceeded to Checkout page for purchase",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepDef.user_proceeded_to_checkout_page_for_purchase()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify selected Brinjal items are displayed in Check out page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDef.verify_selected_items_are_displayed_in_check_out_page(String)"
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
      "name": "@WebTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Greencart Landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepDef.user_is_on_greencart_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searched for Beetroot Vegetable",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepDef.user_searched_for_vegetable(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Added items to cart",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepDef.added_items_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User proceeded to Checkout page for purchase",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepDef.user_proceeded_to_checkout_page_for_purchase()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify selected Beetroot items are displayed in Check out page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDef.verify_selected_items_are_displayed_in_check_out_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Search for items and then move to checkout page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@MobileTest"
    }
  ]
});
formatter.step({
  "name": "i search \u003cName\u003e in eb",
  "keyword": "Given "
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
    }
  ]
});
formatter.scenario({
  "name": "Search for items and then move to checkout page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@MobileTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "i search Brinjal in eb",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepDef.i_search_in_eb(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});