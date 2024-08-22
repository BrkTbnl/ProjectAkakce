#The user opens the akakce.com site in the browser.
#The user finds and clicks on the home page ""login"" or a similar option.
#The user enters the following information:
#Click the ""Login"" button.
#It successfully login to the user account and is directed to the message box by clicking on my messages link.
#If the message box is empty, it checks that an appropriate message is displayed.

Feature: Message box status check

  Background:
    Given navigate to akakce.com
    When click on log-in button
    And user enters their current username and password
    And clicks the login button
    Then relocate to main page logged in.

  Scenario: message box status check
    When the user clicks on My Account
    And the user clicks on My Messages
    Then their message box should be empty
