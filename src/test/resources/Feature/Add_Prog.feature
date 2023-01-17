Feature: Save Program

 Scenario Outline: POST request to create a user
    Given Add Program Payload with "<programName>","<programDescription>","<programStatus>","<creationTime>","<lastModTime>"
    When user calls "AddProgAPI" with "POST" http request
    Then The API call got status code 201
    And user gets response in JSON format

    Examples: 
      | programName | programDescription | programStatus | creationTime                  | lastModTime                   |
      | SDET        | SQL                | Active        | 2023-01-11T11:07:00.000+00:00 | 2023-01-11T11:07:00.000+00:00 |

