#1. The user opens the akakce.com site in the browser.
#2. If the user is directed to the login page, log in with the current user name and password.
#3. Successful access to the user account.
#4. The user clicks ""output"" or a similar option in the upper"&" right corner of the page.
#5. When the opening process is completed successfully, the user is directed to the login page.

Feature: Akakce.com User Login and Logout
  As a registered user
  I want to log in and log out of my account on akakce.com
  So that I can access my account and ensure I'm logged out securely.

  @SmokeTest
  Scenario: User logs in and logs out successfully
    Given navigate to akakce.com
    When click on log-in button
    And user enters their current username and password
    And clicks the login button
    Then relocate to main page logged in.

    When click on log-out button
    Then the user should be redirected to the main page
