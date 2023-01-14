Feature: Validate GET Program API's

Scenario: Get list of all Programs
 
Given user calls "GetProgAPI" 
When  user sends "GET" http request
Then the API call got success with status code "200"
And "status" in response body is "OK"

Scenario: Get Program by valid Id
 
Given user has "<Prog_Id>"  
When  user calls "GetProg_byIdAPI" with "GET" http request
Then the API call got success with status code "200"
And "status" in response body is "OK"
And verify Program_Id in response matches to provided Program_Id
