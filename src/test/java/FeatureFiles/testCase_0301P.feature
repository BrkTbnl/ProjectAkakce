#1. The user opens the akakce.com site in the browser.
#2. The user finds and clicks on the home page ""login"" or a similar option.
#3. The user enters the following information:
#4. Click the ""Login"" button.
#5. It successfully login to the user account an"&"d is directed to the order list by clicking on my orders link.
#6. If the order list is empty, it checks that an appropriate message is displayed.

  Feature: Order List status check

    Background:
      Given navigate to akakce.com
      When click on log-in button
      And user enters their current username and password
      And clicks the login button
      Then relocate to main page logged in.

    Scenario: Order List Status Check
      When the user clicks on My Account
      And the user clicks on My Orders
      Then their order history should be empty
