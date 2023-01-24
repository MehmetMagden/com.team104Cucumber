
@US1009 @wot
Feature: US1009 User can not login with invalid info

  @T11 @smoke
  Scenario Outline: T13 User enters invalid email and valid password with Scenario Outline

    Given User goes to "qdURL"
    Then user clicks homepage login button
    And user manually enters invalid Emails "<wrongUserMail>"
    And user manually enters invalid Passwords "<wrongUserPassword>"
    Then user clicks on login button
    And user tests that  could not be able to login
    And user waits for 3 sec
    Then closes the page

    Examples:
      |wrongUserMail  | wrongUserPassword |
      |bb@b.com       | 12341234Aad.      |
      |CC@C.com       | 12341234Ccd.      |
      |dd@d.com       | 12341234Ddd.      |
      |ee@e.com       | 12341234Eee.      |
      |ff@f.com       | 12341234Fff.      |

