package stepDefinitions;


import io.cucumber.java.en.*;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import io.restassured.http.Method;
import junit.framework.Assert;
import static org.junit.Assert.assertEquals;
import static io.restassured.RestAssured.given;
import java.io.IOException;

import io.restassured.specification.RedirectSpecification;
import io.restassured.specification.RequestSpecification;
import resources.ApiResources;
import io.cucumber.java.en.Given;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import resources.TestDataBuild;
import resources.Utils;
import static io.restassured.RestAssured.*;

import java.io.IOException;

public class Add_BatchSteps extends Utils {
	
	

	static RequestSpecification req;
	Response response;

	TestDataBuild data = new TestDataBuild();

	@Given("Upload Batch details with {string} {string} {string} {int} {int} and {string}")
	public void upload_batch_details_with_and(String Batchname, String BatchDescription, String BatchStatus,
			int BatchNoofClasses, int ProgramID, String ProgramName) throws IOException {

		req = given().spec(requestSpecification()).body(data.postBatchPayload(Batchname, BatchDescription, BatchStatus,
				BatchNoofClasses, ProgramID, ProgramName));

	}

}
