@B29G30-222
Feature: quotations management

  User Story:
  As POS & Sales manager, I want to manage quotations on the Sales page.

@B29G30-189
  Scenario:Verify POS can select all the quotations by clicking the top checkbox.


    Given POS is at sales page

    When user click the top checkbox

    Then user verify  that all the quotation are selected

  @B29G30-221
    Scenario: Verify Sales manager can select all the quotations by clicking the top checkbox.

      Given Sales manager is at sales page

      When user click the top checkbox

      Then user verify  that all the quotation are selected