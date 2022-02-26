Feature: Citizenship Functionality

  Background:
    Given User is on login page
    When User enter admin credentials
    Then User should login successfully


  Scenario: Add Citizenship
    And User create citizenship with "HalitCitizen" name and "HC" shortname
    Then Success message should be displayed


  Scenario: Edit Citizenship
    And User edit the "HalitCitizen" citizenship to "HalitUpdatedCitizen"
    Then Success message should be displayed


  Scenario: Delete Citizenship
    And User delete "HalitUpdatedCitizen" citizenship
    Then Success message should be displayed