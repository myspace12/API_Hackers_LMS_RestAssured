Feature: Validate GET Batch API's
 
Scenario: Get the all batchs
  
Given user has baseURI 
When  user calls "GetBatchAPI" with "GET" http request
Then the API call got status code 200
And "status" in response body is "OK"
And user gets response in JSON format

@tag2
Scenario Outline: get Batach by id
  
Given user has valid <batchId> 
When user calls "GetBatchByIdAPI" with "GET" http request with "<batchId>"
Then the API call got status code 200
And "status" in response body is "OK"
And "batchId" in response body is "<batchId>"

Examples:

           |    batchId    |
           |    1255       |



Scenario Outline: Get request for Batch programId 
 
When user calls "GetBatchByPrIdAPI" with "GET" http request with "<progId>"
Then the API call got status code 200
And "status" in response body is "OK"

Examples:

         |    progId    |
         |  1255        |







