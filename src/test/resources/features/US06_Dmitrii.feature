@DmitryS
Feature: US06 As a PosManager, I should be able to add new products to inventory.

  Scenario: AC-1 TC-1. The user can create a new product by filling only the Product Name input box and after clicking the save button,
  the information of the customer which the user entered should be displayed.

    Given User successfully logged in as POS manager
    Then  User clicks on Inventory Button at the dashboard
    And   User clicks on Product button
    Then  User clicks on create button
    And   User should write a "Item23" of the product
    Then  User clicks on save button
    And   User should sees the "Item23" item name which he entered on the product.


  Scenario: AC-2 TC-2.When clicking any product and then clicking the edit button all the boxes entered information can be editable again.

    Given User as a PosManager is on the Product page
    Then  User write in a search box desire item "Bluetooth Headsets"
    And   User can click on this "Bluetooth Headsets" item
    And   User clicks on edit button
    Then  User can edit check box on this product
    And   User can select any product type in dropdown
    And   User can edit Internal Reference information
    And   User can edit Barcode information
    And   User can change sales price
    And   User can change cost
    Then  User clicks on save button



