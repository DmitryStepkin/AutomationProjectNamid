Feature: As a POS & sales manager, I should be able to get correct information on the Sales page.

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


  Scenario: Verify there are 6 columns to see the quotations on the Sales page when the POS & sales managers login.

    Given user on Sales manager home page
    When user on the home page they see Sales manager display name
    When user click on Sales module
    Then user able to see six columns on the Sales page

      | Quotation Number |
      | Quotation Date   |
      | Customer         |
      | Salesperson      |
      | Total            |
      | Status           |


  Scenario: Verify user can see the result on the list when searching with Quotation Number data.

    Given user on pos manager home page
    When user click on sales module
    When pos manager search by Quotation Number data in the search box
    And select first option

    Then pos manager see the result on the list


  @joceline
  Scenario: Verify user can see the result on the list when searching with Quotation Number data.

    Given user on Sales manager home page
    When user click on Sales module
    When Sales manager search by Quotation Number data in the search box
    And select first option
    Then Sales manager see the result on the list
