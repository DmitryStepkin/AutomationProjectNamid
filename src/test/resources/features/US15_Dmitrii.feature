@wip
Feature: As an Event manager, I want to access the different modules.

  Scenario : Verify the Event managers access to 15 modules.

    Given User successfully logged in as CRM manager
    Then Verify all the "modules" names
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
      | Dashboard   |

   # Then  User can access to different "modules"

    #  | #Inbox                |
    #  | Meetings              |
     # | Notes                 |
      #| Contacts              |
     # | Pipeline              |
     # | Quotations            |
     # | Dashboard             |
     # | Inventory             |
     # | Repair Orders         |
     # | Events                |
     # | Employees             |
     # | Leaves Summary        |
     # | My Expenses to Submit |
     # | Maintenance Teams     |
     # | My Dashboard          |

