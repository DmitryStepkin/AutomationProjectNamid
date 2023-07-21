
@B29G30-167
Feature: US02 As an expense and sales manager, I should be able to Login with valid credentials.

  Scenario: AC-1 US02 TC02 Verify that the user can log in with valid credentials by  hitting the "Enter" key on the keyboard.
   Given User is at the login page
   When  User enter "salesmanager55@info.com" for Email and "salesmanager" for Password
   And   User click on Log In button
   Then  User should see his "SalesManager55" on dashboard


  Scenario: AC-2 US02 TC02 Verify that the error message will be displayed if entered the wrong email or password
    Given User is at the login page
    When  User enter "salesmanager55@info.com" for Email and "salesmanager!" for Password
    And   User click on Log In button
    Then  User should see his "Wrong login/password" on a login page

