@all
Feature: Customer Management in Sales Module (US05 - Sales Manager)

  Background:
    Given User is on login page
    When User have enters the valid credentials
    And User clicks on the login button
    Then User sees his "SalesManager10" on dashboard
    And User clicks the Sales module and lands on the sales dashboard page
    And User clicks the Customers button and lands on the Customers page

  @B29G30-US5_TC_170
  Scenario: Create Customer in Sales Page


    When User clicks the Create button and lands on the Create Customer page
    Then User writes customer name into the name field and clicks the create button
    And User sees the Create Contact window on the screen
    When User fills out the Contact name field in the window and clicks the Save&Close button
    And User sees the customer name on the Customer information window and clicks the save button
    Then User sees the edit button on the top of the page and clicks the edit button
    When User sees the customer name on the window, can edit it, and clicks the save button on top

  @B29G30-US5_TC_187
  Scenario: Edit Customer Information in Sales Page


    When User clicks on any customer from the list
    And User clicks the edit button
    Then Users can edit all entered information