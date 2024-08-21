#1. The user opens the akakce.com site in the browser.
#2. On the main page, click ""Create Account"" option.
#3. The user only fills some information incomplete or incorrectly.
#4. Click the ""Create Account"" button

Feature: Akakce.com Account Creation
  As a user
  I want to create an account on akakce.com
  So that I can access the site's features as a registered user.

  @SmokeTest
  Scenario: User fails to create an account with incomplete information
    Given navigate to akakce.com
    And Click on create account
    When the user enters incomplete or incorrect information
    Then an error message is displayed