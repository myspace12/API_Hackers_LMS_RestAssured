Feature: Validate GET Program API's

#Background: User has already created new Program
#Given user calls "AddProgAPI" and gets "<progId>"
 
#@GetProgram
Scenario: Get list of all Programs
 
Given user has baseURI 
When  user calls "GetProgAPI" with "GET" http request
Then the API call got status code 200
And "status" in response body is "OK"
And user gets response in JSON format

@GetProgram
Scenario Outline: Get Program by valid Id
 
#Given user has valid <progId>  
#When  user calls "GetProg_byIdAPI" with "GET" http request with <progId>
Given user calls "AddProgAPI" and gets "<progId>" 
When user calls "GetProg_byIdAPI" with "GET" http request with "<progId>"
Then the API call got status code 200
And "status" in response body is "OK"
And response body has <progId>

Examples:

                  |   progId   |
                  |     1667   |
 
 
Scenario Outline: Get request for Program by Id with Invalid Id (blank Progarm_Id and Id which does not exist)
 
#Given user has invalid "<progId>"  
#When  user calls "GetProg_byIdAPI" with "GET" http request with <progId>
When user calls "GetProg_byIdAPI" with "GET" http request with "<progId>"
Then the API call got status code <code>
And "status" in response body is "<res_status>"

Examples:
   
 |  path         |   progId      |    code    |  res_status |
 | programs      |               |    404     |  Not Found  |
 | programs      |      2002     |    400     |  Bad Request|


