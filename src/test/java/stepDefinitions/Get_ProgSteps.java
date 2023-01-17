package stepDefinitions;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import junit.framework.Assert;
import resources.ApiResources;
import resources.TestDataBuild;
import resources.Utils;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

public class Get_ProgSteps extends Utils {
		
	
			
	//user creates a program and get that program id
	@Given("user calls {string} and gets {string}")
	public void user_calls_and_gets(String resource, String progId) throws IOException {
		
		
		System.out.println("ProgramId is "+progId);
	   
	}

		
/*	@Then("the API call got status code {string}")
	public void the_api_call_got_status_code(String code) {
						
		assertEquals(response.getStatusCode(),code);
			   
	}*/
		
	@Then("response body has {int}")
	public void response_body_has(String keyValue, String Expectedvalue) {
		
		assertEquals(getJsonPath(response,keyValue),Expectedvalue);
	    
	}
	
}
