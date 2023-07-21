@B29G30-174
  Feature: US09 As a Point of Sale manager (POS), I should be able to view product orders.

    @B29G30-214
    Scenario:  Verify the POS managers can view the order list on the Point of Sale page, after checking the Order Reference, all the orders should be checked.


      Given : User logs in as POS manager
      When : User clicks on Point of sales page
      When : User clicks on orders section
      And : User select Order Ref box
      Then : User sees all order boxes checked

     @B29G30-215
     Scenario: Verify the Action drop down has 3 options : Import, Export, Delete (Bug: import is not displayed)

       Given : User logs in as POS manager
       When : User clicks on Point of sales page
       When : User clicks on orders section
       And : User select Order Ref box
       When : User clicks on Action button
       Then : User sees "Import", "Export", "Delete" options under Action Button

       # User sees only Export and Delete options when clicks on Action button, import option not displayed
      # Bug reported



