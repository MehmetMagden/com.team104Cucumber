
@US1006
Feature: US1006 User should be able to login with valid info

  Scenario: TC10 Login Test with valid userName and password

    Given User goes to "qdURL"
    Then user clicks homepage login button
    And user enters valid User Email "qdValidUserEmail"
    And user enters valid User Password "qdValidUserPassword"
    Then user clicks on login button
    And user tests that if could be able to login
    And user waits for 3 sec
    Then closes the page