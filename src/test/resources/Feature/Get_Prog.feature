Feature: Validate GET Program API's

Background: User has already created new Program
Given user has progId

Scenario: Get list of all Programs
 
Given user has baseURI 
When  user calls "GetProgAPI" with "GET" http request
Then the API call got success with status code 200
And "status" in response body is "OK"
And user gets response in JSON format

Scenario Outline: Get Program by valid Id
 
#Given user has valid "<progId>"  
#When  user calls "GetProg_byIdAPI" with "GET" http request with "<progId>"
When user calls "GET" http request with "<path>" and "<progId>"
Then the API call got success with status code 200
And "status" in response body is "OK"
And "programId" in response body is "<progId>"

Examples:

           |   path        |   progId   |
           |   programs   |   2977     |
 
 
Scenario Outline: Get request for Program by Id with Invalid Id (blank Progarm_Id and Id which does not exist)
 
#Given user has invalid "<progId>"  
#When  user calls "GetProg_byIdAPI" with "GET" http request with "<progId>"
When user calls "GET" http request with "<path>" and "<progId>"
Then the API call got status code "<code>"
And "status" in response body is "<res_status>"

Examples:
   
 |  path          |   porgId      |    code    |  res_status |
 | /programs      |               |    404     |  Not Found  |
 | /programs      |      2002     |    400     |  Bad Request|

