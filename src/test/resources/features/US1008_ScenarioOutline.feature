
@wip @US1008 @wot @smoke
Feature: US1008 Scenario Outline how to use more than one data


  Scenario Outline: T12 amazon search test

    Given user goes to "amazonURL" homepage
    Then user search for "<Item>" in search box
    And tests that results have "<Item>" word
    Then closes the page


    Examples:
      |Item       |
      |Nutella    |
      |Java       |
      |Samsung    |
      |Apple      |