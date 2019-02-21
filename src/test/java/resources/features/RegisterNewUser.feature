@Regression @HelloWorld

Feature: test open browser
  Scenario Outline: Enter to some url direction
    Given I open the browser on "http://localhost:3000/"
    When I click on Sign Up button
    And I enter "name", "email", "password"
    And I click on Sign Up
    Then I should see a confirmation message

    Examples:
      |   browser   |   url                       |
      |   chrome    |   https://www.google.com    |