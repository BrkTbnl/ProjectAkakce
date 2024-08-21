#1. The user opens the akakce.com site in the browser.
#2. The user finds and clicks on the home page ""login"" or a similar option.
#3. Click the ""Login"" button again

  Feature: Akakce.com User Login with no Credentials



    Scenario: Failed attempt to login
      Given navigate to akakce.com
      When click on log-in button
      And user enters their current username and incorrect password2
      And clicks the login button
      Then an error message is displayed2