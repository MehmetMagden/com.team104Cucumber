
@wip
Feature: User can not login with invalid info

  Scenario: T11 User enters invalid email and valid password

    Given User goes to "qdURL"
    Then user clicks homepage login button
    And user enters valid User Email "qdInvalidUserImail"
    And user enters valid User Password "qdValidUserPassword"
    Then user clicks on login button
    And user tests that  could not be able to login
    And user waits for 3 sec
    Then closes the page

  Scenario: T12 User enters valid email and invalid password

    Given User goes to "qdURL"
    Then user clicks homepage login button
    And user enters valid User Email "qdValidUserEmail"
    And user enters valid User Password "qdInvalidUsarPassword"
    Then user clicks on login button
    And user tests that  could not be able to login
    And user waits for 3 sec
    Then closes the page

  Scenario: T13 User enters invalid email and invalid password

    Given User goes to "qdURL"
    Then user clicks homepage login button
    And user enters valid User Email "qdInvalidUserImail"
    And user enters valid User Password "qdInvalidUsarPassword"
    Then user clicks on login button
    And user tests that  could not be able to login
    And user waits for 3 sec
    Then closes the page
