@ueni
Feature: quotations management

  User Story:
  As POS & Sales manager, I want to manage quotations on the Sales page.


  Scenario:Verify POS can select all the quotations by clicking the top checkbox.


    Given POS is at sales page

    When user click the top checkbox

    Then user verify  that all the quotation are selected


    Scenario: Verify Sales manager can select all the quotations by clicking the top checkbox.

      Given Sales manager is at sales page

      When user click the top checkbox

      Then user verify  that all the quotation are selected