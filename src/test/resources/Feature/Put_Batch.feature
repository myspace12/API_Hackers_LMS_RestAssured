Feature: Validate PUT Batch APIs

Background: User has created a new batch 
Given User has batchId

@PutBatch
Scenario Outline: Verify if batch name is successfully updated using PutBatchAPI

    Given Put Batch Payload with "<batchName>" "<batchDescription>" "<batchStatus>" <batchNoOfClasses> <programId> "<programName>"
    When user calls "PutBatchAPI" with "PUT" http request with "<batchId>"
	Then the API call got status code 200
	And "status" in response body is "OK"
	And verify response has "<batchNm>" and <batchId>

Examples:


    | batchId   |  batchName   |     batchDescription      |   batchStatus  |  batchNoOfClasses  |   programId  |    programName           |
    | 1128      |  blueOcean   |  Selenium Training New    |   Active       |      184           |    1667      |   Program-2023051236583  |
