Feature: US1003 User searches for values entered as parameters



  Scenario: TC03 User searches for Nutella entered as a parameter

    Given user goes to Amazon homepage
    Then user search for "apple" in search box
    And tests that results have "apple" word
    Then closes the page

    Given user goes to Amazon homepage
    Then user search for "Java" in search box
    And tests that results have "Java" word
    Then closes the page

    Given user goes to Amazon homepage
    Then user search for "Samsung" in search box
    And tests that results have "Samsung" word
    Then closes the page