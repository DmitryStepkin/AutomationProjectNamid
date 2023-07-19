Feature: As a POS & sales manager, I should be able to get correct information on the Sales page.
@wip
  Scenario: Verify there are 6 columns to see the quotations on the Sales page when the POS & sales managers login.

    Given user on pos manager home page
    When user on the home page they see pos manager display name
    When user click on sales module
    Then user able to see six columns on the sales page

      | Quotation Number |
      | Quotation Date   |
      | Customer         |
      | Salesperson      |
      | Total            |
      | Status           |