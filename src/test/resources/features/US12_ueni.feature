@ueni2
Feature: orders on repairs page

  User Story :
  As a POS & sales manager, I want to get repair order on the Repairs page.

  Scenario: Verify POS can select all the repair orders by clicking the top checkbox.

    Given POS is on the Repairs page.
    When user click the top checkbox in repair page
    Then user verify all the checkbox are selected

  Scenario: Verify sales manager can select all the repair orders by clicking the top checkbox.

    Given sales manager is on the Repairs page.
    When user click the top checkbox in repair page
    Then user verify all the checkbox are selected

