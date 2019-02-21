@Regression @HelloWorld

Feature: test to sum two numbers
  Scenario Outline: Enter to the calculator and sum two numbers
    Given I open the calculator app
    When I click on the first number "<a>"
    And I click on the sum button
    And I click on the second number "<b>"
    And I click on the equals button
    Then I should see the correct result number "<result>"

    Examples:
      |   a   |   b    | result |
      |   3   |   2    | 5      |

  Scenario Outline: Enter to the calculator and subtract two numbers
    Given I open the calculator app
    When I click on the first number "<a>"
    And I click on the subtract button
    And I click on the second number "<b>"
    And I click on the equals button
    Then I should see the correct result number "<result>"

    Examples:
      |   a   |   b    | result |
      |   3   |   2    | 1      |

  Scenario Outline: Enter to the calculator and multiply two numbers
    Given I open the calculator app
    When I click on the first number "<a>"
    And I click on the multiply button
    And I click on the second number "<b>"
    And I click on the equals button
    Then I should see the correct result number "<result>"

    Examples:
      |   a   |   b    | result |
      |   3   |   2    | 6      |

  Scenario Outline: Enter to the calculator and divide two numbers
    Given I open the calculator app
    When I click on the first number "<a>"
    And I click on the divide button
    And I click on the second number "<b>"
    And I click on the equals button
    Then I should see the correct result number "<result>"

    Examples:
      |   a   |   b    | result |
      |   3   |   2    | 1.5    |