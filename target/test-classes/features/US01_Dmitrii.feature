@B29G30-198
Feature: US01 As POS and eventCRM manager, I should be able to Login with valid credentials.

  @B29G30-193
  Scenario Outline: AC-1 TC01 Verify that the user can log in as POS and eventCRM with valid credentials by clicking on the Login button

    Given User is on the login page
    When  User enter "<username>" and "<password>" in the appropriate fields
    And   User click on login button
    Then  User should sees his "<name>" on dashboard

    Examples:
      | username                     | password         | name                |
      | posmanager5@info.com         | posmanager       | POSManager5         |
      | posmanager155@info.com       | posmanager       | POSManager155       |
      | posmanager75@info.com        | posmanager       | POSManager75        |
      | eventscrmmanager10@info.com  | eventscrmmanager | EventsCRMManager10  |
      | eventscrmmanager100@info.com | eventscrmmanager | EventsCRMManager100 |
      | eventscrmmanager50@info.com  | eventscrmmanager | EventsCRMManager50  |

  @B29G30-194
  Scenario: AC-1 TC02 Verify that the user can log in with valid credentials by  hitting the "Enter" key on the keyboard.
    Given User is on the login page
    When  User enter "posmanager5@info.com" and "posmanager" in the appropriate fields
    And   User click on enter from keyboard
    Then  User should sees his "POSManager5" on dashboard

  @B29G30-195
  Scenario Outline: AC-2 TC03 Verify the "Wrong login/password" error message should be displayed after entering the invalid credentials
    Given User is on the login page
    When  User enter "<username>" and "<password>" in the appropriate fields
    And   User click on login button
    Then  User should sees error message
    Examples:
      | username                      | password          |
      | posmanager4@info.com          | posmanager        |
      | posmanager156@info.com        | posmanager        |
      | posmanager75@info.com         | posmanager1       |
      | eventscrmmanager9@info.com    | eventscrmmanager  |
      | eventscrmmanager1000@info.com | eventscrmmanager  |
      | eventscrmmanager50@info.com   | eventscrmmanager1 |

  @B29G30-196
  Scenario: AC-3 TC04 Verify that the user gets error message for blank username field.
    Given  User is on the login page
    When  User leave blank username field and enter password
    And   User click on login button
    Then  User should sees error message in username field

  @B29G30-197
  Scenario: AC-3 TC05 Verify that the user gets error message for blank password field.
    Given  User is on the login page
    When  User leave blank password field and enter username
    And   User click on login button
    Then  User should sees error message in password field


