 @B29G30-175
  Feature: US10 As a user, I want to access the documentation page.

    Scenario: AC-1 TC-1 Verify the “Odoo Documentation” message is displayed in a new window.

      Given User logged in as posmanager
      When User clicks on his name
      And  User clicks on documentation button
      Then User should jump in a new window
      And  User sees "Odoo Documentation" message


    Scenario: AC-2 TC-2 Verify there are 4 main document topics are listed.

      Given User logged in as posmanager
      When User clicks on his name
      And  User clicks on documentation button
      Then User should jump in a new window
      And User sees 4 main document topics


