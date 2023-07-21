@B29G30-207
Feature: As an expenses manager, I should be able to access the different modules
  @B29G30-206
  Scenario: AC-1 TC-01 Verify the Expenses managers have access to 12 modules

    Given User logs in as Expenses manager
    Then user should see twelve modules at the top of the page

      | Discuss     |
      | Calendar    |
      | Notes       |
      | Contacts    |
      | Website     |
      | Events      |
      | Employees   |
      | Leaves      |
      | Expenses    |
      | Lunch       |
      | Maintenance |
      | Dashboards  |

    And user should see username on at the right top of the page
