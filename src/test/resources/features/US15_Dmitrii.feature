@B29G30-202
Feature: As an Event manager, I want to access the different modules.
  @B29G30-201
  Scenario: AC-1 TC-1 Verify the Event managers access to 15 modules.

    Given User successfully logged in as CRM manager
    Then  User should see on dashboard a list of modules as below
      | Discuss     |
      | Calendar    |
      | Notes       |
      | Contacts    |
      | CRM         |
      | Sales       |
      | Website     |
      | Inventory   |
      | Repairs     |
      | Events      |
      | Employees   |
      | Leaves      |
      | Expenses    |
      | Maintenance |
      | Dashboards   |

   And  User can click and  access to different modules, check the title for each modules as below

      | #Inbox                |
      | Meetings              |
      | Notes                 |
      | Contacts              |
      | Pipeline              |
      | Quotations            |
      | Dashboard             |
      | Inventory             |
      | Repair Orders         |
      | Events                |
      | Employees             |
      | Leaves Summary        |
      | My Expenses to Submit |
      | Maintenance Teams     |
      | My Dashboard          |

