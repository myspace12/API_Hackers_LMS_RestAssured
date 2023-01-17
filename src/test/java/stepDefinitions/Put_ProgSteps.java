package stepDefinitions;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import java.io.IOException;

import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;
import resources.TestDataBuild;
import resources.Utils;

public class Put_ProgSteps extends Utils {

	
	static RequestSpecification req;
	static String ProName;
	static String ProDescription;
	TestDataBuild data = new TestDataBuild();

	@Given("Put Program Payload {string} {string} {string} {string} and {string}")
	public void put_program_payload_with_and1(String programName, String programDescription, String programStatus,
			String creationTime, String lastModTime) throws IOException {

		req = given().spec(requestSpecification())
				.body(data.putProgPayload(programName, programDescription, programStatus, creationTime, lastModTime));

	}

	
	@Given("Put program Payload with {string} {string} {string} {string} and {string}")
	public void put_program_payload_with_and(String programName, String programDescription, String programStatus,
			String creationTime, String lastModTime) throws IOException {

		req = given().spec(requestSpecification())
				.body(data.putProgPayload(programName, programDescription, programStatus, creationTime, lastModTime));

	}

	

}
