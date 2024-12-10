Feature: User Signup and Login

Scenario: User successfully signs up
  Given I am on the signup page
  When I enter valid details
  And I submit the signup form
  Then I should see a welcome message

Scenario: User logs in with the newly created account
  Given I am on the login page
  When I enter valid credentials
  And I click on the login button
  Then I should be redirected to the account dashboard
