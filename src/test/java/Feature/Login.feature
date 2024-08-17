Feature: Finti User Login

  Scenario Outline: User login with different credentials
    Given The user is on the login page
    When The user enters username "<username>" and password "<password>"
    And The user clicks the login button
    Then The user should be redirected to "<expectedPage>"
    Examples:
      | username                   | password   | expectedPage |
      | superadmin@firstapp.io     | Supra#457  | Dashboard    |

  Scenario: Adding a new merchant business page
    Given The user is on the merchant addition page
    When The user fills out business page with the following details
    Then User clicks on save and continue

  Scenario: Adding a new merchant banking page
    Given The user is on the banking page
    When The user fills out banking page with the following details

  Scenario: Adding a new merchant insights page
    Given The user is on the insights page
    When The user fills out insights page with the following details

  Scenario: Adding a new merchant agreement page
    Given The user is on the agreement page
    When The user fills out agreement page with the following details

  Scenario: Adding a new merchant payment page
    Given The user is on the payment page
    When The user fills out payment page with the following details
