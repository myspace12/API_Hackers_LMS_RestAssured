Feature: Validate DELETE Batch API's

#Background: User has already created new Batch

Scenario: Delete a Batch
 
Given user has baseURI 


Scenario Outline: Delete Batch by valid batch Id
 
  
When  user calls "DeleteBatchByIDAPI" with "DELETE" http request with "<batchId>"
Then the Batch API call got success with status code 200.
And batch "status" in response body is "OK".

Examples:

           |   batchId   |
           |   2921     |
