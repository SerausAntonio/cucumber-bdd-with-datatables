Feature: User Login Feature

  Scenario: User Login scenario
    Given User is at the login page of the application
    When User login with the following username and password
      | UsernameOne   | PasswordOne   |
      | UsernameTwo   | PasswordTwo   |
      | UsernameThree | PasswordThree |
      | Usernamefour  | Passwordfour  |
    Then User should be able to login