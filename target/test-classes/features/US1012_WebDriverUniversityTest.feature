Feature: US1012 Window Test
  @wip @p2
  Scenario: TC16 User should be able to test new tab
    
    Given user manually goes to "http://webdriveruniversity.com/" homepage
    Then user clicks on login portal link
    And user switches to the new tab
    And user enters userName
    And user enters password
    And user clicks on loginButton
    Then tests that the text of popup is validation failed
    And user clicks ok button at popup
    Then user returns to the first tab
    And tests that the tab is the first tab
    And user closes all pages