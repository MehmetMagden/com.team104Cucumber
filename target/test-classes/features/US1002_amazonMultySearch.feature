Feature: US1002 User searches for more than one product in amazon homepage


  Scenario: TC02 User should be able to search for products and test them

    Given user goes to Amazon homepage
    Then user search for Nutella in search box
    And tests that results have Nutella word
    And closes the page

    Given user goes to Amazon homepage
    Then user search for Java in search box
    And tests that results have Java word
    And closes the page

    Given user goes to Amazon homepage
    Then user search for Samsung in search box
    And tests that results have Samsung word
    Then closes the page