#The user opens the akakce.com site in the browser.
#The user finds and clicks on the home page ""login"" or a similar option.
#The user enters the valid information in the test data:
#Click the ""Login"" button.
#Successful access to the user account.
#The user clicks ""delete my account"" or similar option from the account settings or profile section.
#When the account deletion process is successfully completed, it checks that an appropriate message is displayed.

Feature: Delete account

  Background:
    Given navigate to akakce.com
    When click on log-in button
    And user enters their current username and password
    And clicks the login button
    Then relocate to main page logged in.


  Scenario: Delete account
    When the user clicks on My Account
    And the user clicks on Delete My Account
    And the user enters correct password and click confirm button
    Then Account Deleted Message displayed