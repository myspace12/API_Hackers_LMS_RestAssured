@Putprog
Feature: Put request

  Background: The user already created new Program

  Scenario Outline: Modify the Program details with valid ProgramID
    Given Put Program Payload "<programName>" "<programDescription>" "<programStatus>" "<creationTime>" and "<lastModTime>"
    When user calls "PutProgbyIdAPI" with "PUT" http request with "<ProgramId>"
    Then the API call got status code 200
    


    Examples: 
      | ProgramId | programName | programDescription         | programStatus | creationTime                  | lastModTime                   |
      |      3838 | AWS2        | Jva is simple but Powerful | Active        | 2023-01-15T12:23:32.054+00:00 | 2023-01-15T12:23:32.055+00:00 |

  Scenario Outline: Modify the Program details with valid ProgramName
    Given Put program Payload with "<programName>" "<programDescription>" "<programStatus>" "<creationTime>" and "<lastModTime>"
    When user calls "PutProgbyNmAPI" with "PUT" http request with "<programName>"
    Then the API call got status code 200
    

    Examples: 
      | programName | programName | programDescription | programStatus | creationTime                  | lastModTime                   |
      | AWS2        | AWS2        | Java               | Active        | 2023-01-15T12:23:32.054+00:00 | 2023-01-15T12:23:32.055+00:00 |
