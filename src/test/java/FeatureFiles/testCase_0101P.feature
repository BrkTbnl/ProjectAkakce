#1. The user opens the akakce.com site in the browser.
#2. On the main page, click ""Create Account"" option.
#3. The user fills the required information completely.
#4. Click the ""Create Account"" button.")

Feature: Akakce.com Account Creation
  As a user
  I want to create an account on akakce.com
  So that i can access the site's features as a registered user.

  @SmokeTest
  Scenario: User successfully creates an account on akakce.com
    Given navigate to akakce.com
    And Click on create account
    When enter all required information and click Submit
    Then relocate to main page logged in.
