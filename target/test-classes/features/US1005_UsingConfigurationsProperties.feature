

Feature: US1005 How to use configuration.properties in methods

  Scenario: TC07 User tests that he could be able to reach Amazon homepage

    Given User goes to "amazonURL"
    Then tests that Url has "amazon" keyword
    And closes the page

  Scenario: TC08 User tests that he could be able to reach WiseQuarter homepage

    Given User goes to "wiseQuarterURL"
    Then tests that Url has "wisequarter" keyword
    And closes the page


  Scenario: TC09 User tests that he could be able to reach Walmart homepage

    Given User goes to "walmartURL"
    Then tests that Url has "walmart" keyword
    And closes the page