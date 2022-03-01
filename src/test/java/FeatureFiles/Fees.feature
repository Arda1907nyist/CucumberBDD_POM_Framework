Feature: Fees Functionality

  Background:
    Given User is on login page
    When User enter admin credentials
    Then User should login successfully

  Scenario Outline: Add Fees
    And User create Fee "<name>" and "<code>" and "<intCode>" and "<priority>"
    Then Success message should be displayed

    Examples:
      | name      | code    | intCode   | priority |
      | HalitFee1 | 0100001 | paypal    | 754      |
      | HalitFee2 | 0100020 | applePay  | 765      |
      | HalitFee3 | 0230001 | googlePay | 755      |