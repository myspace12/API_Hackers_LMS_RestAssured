Feature: Validate DELETE Program API's

#Background: User has already created new Program

Scenario: Delete a Program
 
Given user has baseURI


Scenario Outline: Delete Program by valid program Id
 
  
When  user calls "DeleteProgramByIDAPI" with "DELETE" http request with "<progId>"
Then the Program API call got success with status code 200
And Program "status" in response body is "OK"

Examples:

           |   progId   |
           |   6557     |
 
 
Scenario Outline: Delete Program by valid program name
  
When  user calls "DeleteProgramByNameAPI" with "DELETE" http request with "<progName>"
Then the Program API call got success with status code 200
And Program "status" in response body is "OK"

Examples:

           |   progName   |
           |   Jan23-ApiHackers-SDET-066     |
