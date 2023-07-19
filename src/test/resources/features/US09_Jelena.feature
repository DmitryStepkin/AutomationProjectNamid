@B29g30-174
  Feature: US09 As a Point of Sale manager (POS), I should be able to view product orders.

    Scenario:  Verify the POS managers can view the order list on the Point of Sale page, after checking the Order Reference, all the orders should be checked.

      Given : User logs in as POS manager
      When : User clicks on Point of sales page
      When : User clicks on orders section
      And : User select Order Ref box
      Then : User sees all order boxes checked


