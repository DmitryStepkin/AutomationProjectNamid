@B29G30-205
Feature: As an inventory manager, I should be able to access the main modules
 @B29G30-204
  Scenario: AC-1 TC14 Verify the Inventory managers have access to 16 modules

    Given User logs in as Inventory manager
    Then user should see sixteen modules at the top of the page

      | Discuss         |
      | Calendar        |
      | Notes           |
      | Contacts        |
      | Website         |
      | Inventory       |
      | Manufacturing   |
      | Repairs         |
      | Invoicing       |
      | Email Marketing |
      | Employees       |
      | Leaves          |
      | Expenses        |
      | Lunch           |
      | Maintenance     |
      | Dashboards       |

    And user should see username on at the right to of the page
