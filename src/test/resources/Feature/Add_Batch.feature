@PostBatch
Feature: Post Request

  Scenario Outline: Post the list of Batch Details
    Given Upload Batch details with "<batchName>" "<batchDescription>" "<batchStatus>" <batchNoOfClasses> <programId> and "<programName>"
    When user calls "AddBatchAPI" with "POST" http request
    Then The API call got status code 201
    And user gets response in JSON format

    Examples: 
      | batchName  | batchDescription | batchStatus | batchNoOfClasses | programId | programName         |
      | Selenium   | SQL              | Active      |                7 |      5407 | Sql478 |
