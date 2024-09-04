Feature: Login functionality

  Scenario: Successful login with valid credentials
    Given I am on the login page
    When I enter the username and password
    And I click the submit button
    Then I should see "Logged In Successfully"
    And I close the browser
   
