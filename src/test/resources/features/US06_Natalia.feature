@B29G30-171
Feature: US06 As a PosManager, I should be able to add new products to inventory.

  @B29G30-171-1
  Scenario Outline: AC-1 User can create a new product by filling only the Product Name input box and after clicking the save button, the information of the customer which the user entered should be displayed.

    Given User logged in as PosManager
    When User goes to "Inventory" module
    And User click Products button
    And User click Create button
    And User should be able to enter "<Entered Product Name>" into input box and click save button
    And User goes back to Products by clicking Products button and search "<Entered Product Name>"
    Then The "<information>" of the customer which the user entered should be displayed


    Examples: product names we use

      |Entered Product Name|       information     |
      |  A-Natalia-test-1  |   A-Natalia-test-1    |
      |  A-Natalia-test-2  |   A-Natalia-test-2    |
      |  A-Natalia-test-3  |   A-Natalia-test-3    |
      |  A-Natalia-test-4  |   A-Natalia-test-4    |


  @B29G30-171-2
  Scenario: AC-2 When clicking any product and then clicking the edit button all the boxes entered information can be editable again.

    Given User logged in as PosManager
    When User goes to "Inventory" module
    And User click Products button
    And User click on product
    And User click Edit button
    Then User should be able to change the Name of the product field
    Then User should be able to edit check boxes
    Then User should be able to edit Product Type dropdown
    Then User should be able to edit Internal Reference and Barcode
    Then User should be able to edit Sales Price and Cost fields