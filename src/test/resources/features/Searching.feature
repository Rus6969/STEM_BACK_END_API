Feature: OMDb API

  Scenario: Search by String and return list of matched Results
    When I create a POST request
    Then I see response has 200 status code
    And I verify that response contains at least 30 items


