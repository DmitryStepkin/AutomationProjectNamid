@B29G30-170
Feature: As an inventory manager, I should be able to access the main modules

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
      | Dashboard       |

    And user should see username on at the right to of the page
