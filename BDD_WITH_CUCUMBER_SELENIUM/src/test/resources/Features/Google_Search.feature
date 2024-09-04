Feature: Verify Google Search for Pune

  Scenario: Search for Pune on Google and verify result
    Given I open the browser
    When I search for Pune
    Then the search results should include City in Maharashtra
    And I close the browser
