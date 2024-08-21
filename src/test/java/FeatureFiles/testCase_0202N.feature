#1. The user opens the akakce.com site in the browser.
#2. The user finds and clicks on the home page ""login"" or a similar option.
#3. The user enters invalid data:
#4. E-mail: testuser@example.com
#5. Password: InvalidPassword (invalid password)
#6. Click the ""Login"" button again.

Feature: Akakce.com User Login with Invalid Credentials
  As a registered user
  I want to log in to my account on akakce.com
  So that I can verify that incorrect credentials are handled properly.

  @SmokeTest
  Scenario: User fails to log in with incorrect password
    Given navigate to akakce.com
    When click on log-in button
    And user enters their current username and incorrect password
    And clicks the login button
    Then an error message should be displayed
