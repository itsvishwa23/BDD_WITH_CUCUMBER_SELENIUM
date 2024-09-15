Feature: Login functionality

  Scenario Outline: Successful login with valid credentials
    Given I am on the login page
    When I enter the username <username> and password <password>
    And I click the submit button
    Then I should see "Logged In Successfully"
    And I close the browser

    Examples: 
      | username | password     |
      | student  | Password123  |
      | student  | Password1234 |
