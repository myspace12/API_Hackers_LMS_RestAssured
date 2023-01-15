package stepDefinitions;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import junit.framework.Assert;
import resources.ApiResources;
import resources.Utils;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

public class Get_ProgSteps extends Utils {
	RequestSpecification res;
	Response response;
	
			
	//user creates a program and get that program id
	@Given("user has progId")
	public void user_has_progId() throws IOException {
		
		res=given().spec(requestSpecification());
	   
	}
		
				
	@When("^user calls (.*) http request with (.*) and (.*)$")
	public void user_calls_http_request_with_and(String method, String path, String progId) throws NumberFormatException, IOException {
		//constructor will be called with the value of resource which you pass
		
		response=res.when().request(method, path, progId).then().spec(responseSpecification())
				.extract().response();
	
	}
		

	@Then("{string} in response body is {string}")
	public void in_response_body_is(String keyValue, String Expectedvalue) {
		
		assertEquals(getJsonPath(response,keyValue),Expectedvalue);
	    
	}
	
			
}
