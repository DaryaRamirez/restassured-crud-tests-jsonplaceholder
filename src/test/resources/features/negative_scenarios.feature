
@negative
Feature: Negative User API scenarios

  Scenario: Get a non-existing post
    When I send a GET request to "/posts/9999"
    Then the response status should be 404

  Scenario: Update non-existing post
    When I send a PUT request to "/posts/9999" with body
      """json
      {
        "id": 9999,
        "title": "ghost",
        "body": "not found",
        "userId": 1
      }
      """
    Then the response status should be 404

  Scenario: Delete non-existing post
    When I send a DELETE request to "/posts/9999"
    Then the response status should be 404
