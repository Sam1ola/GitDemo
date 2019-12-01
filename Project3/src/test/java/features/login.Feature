Feature: Application Login
  @MobileTest
  Scenario: Home page default login

    Given  I log in to the Website
    When I clicked on the buy again
    Then  The page is displayed

  @WebTest
  Scenario Outline: Search for items and then move to checkout page
    Given User is on Greencart Landing page
    When User searched for <Name> Vegetable
    And Added items to cart
    And User proceeded to Checkout page for purchase
    Then verify selected <Name> items are displayed in Check out page

    Examples:
      |Name	   |
      |Brinjal |
      |Beetroot|
  @MobileTest
  Scenario Outline: Search for items and then move to checkout page
    Given i search <Name> in eb

    Examples:
      |Name	   |
      |Brinjal |