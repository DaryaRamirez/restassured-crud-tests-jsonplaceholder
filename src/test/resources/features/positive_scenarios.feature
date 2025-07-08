
@positive
Feature: Positive User API scenarios

  Scenario: Get an existing post
    When I send a GET request to "/posts/1"
    Then the response status should be 200

  Scenario: Create a post
    When I send a POST request to "/posts" with body
      """json
      {
        "title": "foo",
        "body": "bar",
        "userId": 1
      }
      """
    Then the response status should be 201

  Scenario: Update a post
    When I send a PUT request to "/posts/1" with body
      """json
      {
        "id": 1,
        "title": "foo updated",
        "body": "bar updated",
        "userId": 1
      }
      """
    Then the response status should be 200
