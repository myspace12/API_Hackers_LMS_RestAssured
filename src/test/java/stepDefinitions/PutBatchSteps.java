package stepDefinitions;


import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import resources.TestDataBuild;
import resources.Utils;

public class PutBatchSteps extends Utils  {
	static String batch_Id;
	static String batch_NM;
	RequestSpecification req;
	
	TestDataBuild data=new TestDataBuild();

@Given("User has batchId")
public void user_has_batch_id() {
    
	
}

@Given("Put Batch Payload with {string} {string} {string} {int} {int} {string}")
public void put_batch_payload_with(String batchName, String batchDescription, String batchStatus, 
		Integer batchnoOfClasses, Integer programId, String programName) throws IOException {
	        
	        req=given().spec(requestSpecification()).
			body(data.putBatchPayload(batchName, batchDescription ,
			batchStatus, batchnoOfClasses, programId, programName));
}



@Then("verify response has {string} and {int}")
public void verify_response_has_and(String name, Integer id) {
    
	batch_Id=getJsonPath(response,"batchId");
	batch_NM=getJsonPath(response,"batchName");
	
	System.out.println("Batch_ID is " +batch_Id);
	System.out.println("Batch_Name is " +batch_NM);
	
	assertEquals(batch_Id,id);
	assertEquals(batch_NM,name);
	
}

	
}
