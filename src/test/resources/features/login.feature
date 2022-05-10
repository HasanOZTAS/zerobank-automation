Feature:User should be able to login

  @login
  Scenario: Login as a user
    Given the user is on the login page
    When the user enters valid credentials
    Then Account summary page should be displayed