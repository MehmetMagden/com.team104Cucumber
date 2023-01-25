@p2
Feature: Registering on Editor webpage by using Scenario Outline

  Scenario Outline: TC14 register on Editor homepage by 5 data




    When user manually goes to "https://editor.datatables.net/" homepage
    Then clicks the new button
    And enters firstName "<firstName>"
    And enters lastName "<lastName>"
    And enters position "<position>"
    And enters office "<office>"
    And enters extension "<extension>"
    And enters startdate "<startDate>"
    And enters salary "<salary>"
    And clicks the Create button
    When user searches by "<firstName>"
    Then verifies that "<firstName>" is in the name list
    And closes the page

    Examples:
      | firstName | lastName | position | office  | extension | startDate  | salary |
      | Hasan     | Firat    | QA       | USA     | NY        | 2021-01-11 | 20000  |
      | Mehmet    | Kara     | QALead   | Germany | some      | 2021-10-10 | 25000  |
      | Ahmet     | Blue     | QA T     | USA     | NY        | 2020-01-11 | 25000  |
      | Yasar     | Toprak   | QA       | Turkey  | Ist       | 2022-12-12 | 23000  |
      | Hasan2    | Firat    | QA 2     | USA2    | NY2       | 2011-01-11 | 24000  |



