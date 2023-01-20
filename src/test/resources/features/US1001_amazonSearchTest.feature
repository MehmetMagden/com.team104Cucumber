Feature: US 1001 User will test in Amazon

  Scenario: TC01 User search for Nutella in Amazon

    Given user goes to Amazon homepage
    Then user search for Nutella in search box
    And tests that results have Nutella word
    Then closes the page