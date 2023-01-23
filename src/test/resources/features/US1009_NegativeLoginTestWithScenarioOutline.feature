
@wip @US1007 @wot
Feature: US1009 User can not login with invalid info

  @T11 @smoke
  Scenario Outline: T13 User enters invalid email and valid password with Scenario Outline

    Given User goes to "qdURL"
    Then user clicks homepage login button
    And user enters valid User Email "<wrongUserMail>"
    And user enters valid User Password "<wrongUserPassword>"
    Then user clicks on login button
    And user tests that  could not be able to login
    And user waits for 3 sec
    Then closes the page

    Examples:
      |wrongUserMail  | wrongUserPassword |

