#1. The user opens the akakce.com site in the browser.
#2. The user finds and clicks on the home page ""login"" or a similar option.
#3. The user enters the valid information in the test data:
#4. Click the ""Login"" button.
#5. Successful access to the us"&"er account.
#6. The user clicks ""delete my account"" or a similar option from the account settings or profile section.
#7. During the account deletion process, an invalid password enters and tries to complete the process.

  Feature: Delete account Negative

    Background:
      Given navigate to akakce.com
      When click on log-in button
      And user enters their current username and password
      And clicks the login button
      Then relocate to main page logged in.


    Scenario: Delete account negative case
      When the user clicks on My Account
      And the user clicks on Delete My Account
      And the user enters invalid password
      Then An error message should be displayed