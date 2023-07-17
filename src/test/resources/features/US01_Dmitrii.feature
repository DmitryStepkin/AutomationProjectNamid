Feature: US01 As POS and eventCRM manager, I should be able to Login with valid credentials.

  @wip
  Scenario Outline: AC-1 Verify that the user can log in as a Post Manager with valid credentials by clicking on the Login button

    Given User is on the login page
    When  User enter "<username>" and "<password>" in the appropriate fields
    And   User click on login button
    Then  User should land on the dashboard page

    Examples:
      | username                     | password         |
      | posmanager5@info.com         | posmanager       |
      | posmanager155@info.com       | posmanager       |
      | posmanager75@info.com        | posmanager       |
      | eventscrmmanager10@info.com  | eventscrmmanager |
      | eventscrmmanager100@info.com | eventscrmmanager |
      | eventscrmmanager50@info.com  | eventscrmmanager |



