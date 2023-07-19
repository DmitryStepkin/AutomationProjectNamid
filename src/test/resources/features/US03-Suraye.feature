@B29G30-186
Feature: Calendar Display Options

  As a user, I want to see the calendar page as daily, weekly (as a default) and monthly.

  Background:
    Given User is in the login page
    When User enters "posmanager10@info.com" and "posmanager" in the appropriate fields
    And User click on the login button
    Then User sees his name on dashboard
@B29G30-183
  Scenario: View Calendar as Daily
    When User navigates to the calendar page
    And User selects the daily view option
    Then User should see the calendar displayed in daily format
  @B29G30-184
  Scenario: View Calendar as Weekly
    When User navigates to the calendar page
    And User selects the weekly view option
    Then User should see the calendar displayed in weekly format
  @B29G30-185
  Scenario: View Calendar as Monthly
    When User navigates to the calendar page
    And User selects the monthly view option
    Then User should see the calendar displayed in monthly format