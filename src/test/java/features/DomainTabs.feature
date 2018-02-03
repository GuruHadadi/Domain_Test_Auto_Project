Feature: As a user, I want to perform click operations on Domain website

  Scenario Outline: Click different tabs on Domain Home page
    Given I am on Domain home page
    When I click on the tab <tabName>
    Then the target tab-page <tabName> and section title <sectionTitle> is displayed successfully
#    And I close my browser
#    And I click on any available Horse Racking Betting cell
#    When I enter <bettingType> and <stake>
#    And click on Add to Bet slip button
#    Then the added <bettingType> and <stake> displays correctly in the betslip summary area
#
    Examples:
      | tabName | sectionTitle           |
      | Rent    | Find your perfect home |
      | Buy     | Find your perfect home |
      | Sold    | Find your perfect home |
#      | Exacta      | 21.5  ||