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


  Scenario Outline: Edit Fees
    And User edit Fee "<existingFeeName>" and change it to "<newFeeName>"
    Then Success message should be displayed

    Examples:
      | existingFeeName | newFeeName         |
      | HalitFee1       | Updated Halit Fee1 |
      | HalitFee2       | Updated Halit Fee2 |
      | HalitFee3       | Updated Halit Fee3 |


  Scenario Outline: Delete Fees
    And User delete Fee "<FeeName>"
    Then Success message should be displayed

    Examples:
      | FeeName            |
      | Updated Halit Fee1 |
      | Updated Halit Fee2 |
      | Updated Halit Fee3 |