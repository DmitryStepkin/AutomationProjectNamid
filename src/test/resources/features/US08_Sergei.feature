 @B29G30-229
Feature: As a POS & sales manager, I want to access the Repairs page.

  @B29G30-209
  Scenario: AC-1  TC-1 Verify there are 6 columns to see the repair orders on the Repairs page when the POS  managers login.


    Given User logged in as posmanager
    Then User sees Repairs module
    Then  User click on Repairs module
    And   User should see six columns in the repair orders on the Repairs page
  @B29G30-210
  Scenario: AC-1  TC-2 Verify there are 6 columns to see the repair orders on the Repairs page when the sales manager   login.


    Given User logged in as salesmanager
    Then User sees Repairs module
    Then  User click on Repairs module
    And   User should see six columns in the repair orders on the Repairs page

  @B29G30-226
  Scenario: AC-2 TC-3 Verify user can see the result on the list when searching with Repair Reference data.


    Given User logged in as posmanager
    And User click on Repairs module
    And User types Reference data "RMA/00246" in the search box
    Then  User should see "RMA/00246" the result

  @B29G30-227
  Scenario: AC-2 TC-4 Verify user can see the result on the list when searching with Repair Reference data.


    Given User logged in as salesmanager
    And User click on Repairs module
    And User types Reference data "RMA/00246" in the search box
    Then  User should see "RMA/00246" the result