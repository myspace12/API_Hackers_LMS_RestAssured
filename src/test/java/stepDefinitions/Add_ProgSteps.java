package stepDefinitions;

import static io.restassured.RestAssured.*;
import java.io.IOException;

import io.cucumber.java.en.Given;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import resources.TestDataBuild;
import resources.Utils;

public class Add_ProgSteps extends Utils {
	
	static RequestSpecification req;
	Response response;
	TestDataBuild data=new TestDataBuild();
	
	@Given("Add Program Payload with {string} {string} {string}")
	public void add_program_payload_with(String programName,String programDescription,String programStatus, String creationTime, String lastModTime) throws IOException {
	
		req=given().spec(requestSpecification()).body(data.addProgPayload(programName,programDescription, programStatus, creationTime, lastModTime));
	    
	}}

