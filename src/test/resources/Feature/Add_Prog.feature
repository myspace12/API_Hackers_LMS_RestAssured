Feature: Save Program

  Scenario Outline: POST request to create a user
    Given Add Program Payload with "<programName>" "<programDescription>" "<programStatus>"
    When user calls "AddProgAPI" with "POST" http request
    Then The API call got status code 201
    And "Status" in response body is "Created"
    And user gets response in JSON format

    Examples: 
      | programName | programDescription | programStatus |
      |      SDET   | SQL                | Active        |
