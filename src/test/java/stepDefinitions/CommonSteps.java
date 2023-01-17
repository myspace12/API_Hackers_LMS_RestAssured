package stepDefinitions;

import static io.restassured.RestAssured.*;

import static org.junit.Assert.*;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import junit.framework.Assert;
import resources.ApiResources;
import resources.Utils;

public class CommonSteps extends Utils {
	RequestSpecification res;
	ResponseSpecification resspec;
	Response response;
	Add_BatchSteps data = new Add_BatchSteps();
	PutBatchSteps batch= new PutBatchSteps();

	@Given("user has baseURI")
	public void user_has_baseURI() throws IOException {

		res = given().spec(requestSpecification());

	}

	@When("user calls {string} with {string} http request")
	public void user_calls_with_http_request(String resource, String method) throws NumberFormatException, IOException {
		// constructor will be called with the value of resource which you pass

		ApiResources resourceAPI = ApiResources.valueOf(resource);
		System.out.println("API Resource Used is " + resourceAPI.getResource());

		if (method.equalsIgnoreCase("POST")) {
			

			response = res.when().post(resourceAPI.getResource()).then().spec(responseSpecification()).extract()
					.response();

		} else if (method.equalsIgnoreCase("GET")) {

			response = res.when().get(resourceAPI.getResource()).then().spec(responseSpecification()).extract()
					.response();
		}

	}
	
	
	@When("user calls {string} with {string} http request with {string}")
	public void user_calls_with_http_request_with_id(String resource, String method, String id) throws NumberFormatException, IOException {
		//constructor will be called with the value of resource which you pass
		if (res==null)
			user_has_baseURI();
		
		ApiResources resourceAPI= ApiResources.valueOf(resource);
		System.out.println("API Resource Used is " +resourceAPI.getResource());
		
				
		if(method.equalsIgnoreCase("GET") && resource.contains("Batch"))
		{
			response =res.when().get(resourceAPI.getResource()+id)
			.then().spec(responseSpecification()).extract().response();
		}
		else if(method.equalsIgnoreCase("GET") && resource.contains("Prog"))
		{
			response =res.when().get(resourceAPI.getResource()+id)
			.then().spec(responseSpecification()).extract().response();
		}
	    else if(method.equalsIgnoreCase("DELETE") && resource.contains("Batch"))
	    {
	    	response = res.when().delete(resourceAPI.getResource()+id)
	    	.then().spec(responseSpecification()).extract().response();
	    }
	    else if(method.equalsIgnoreCase("DELETE") && resource.contains("Prog"))
	    {
	    	response = res.when().delete(resourceAPI.getResource()+id)
	    	.then().spec(responseSpecificationForTypeText()).extract().response();
	    }
	    else if(method.equalsIgnoreCase("PUT") && resource.contains("Prog"))
	    {
	    	
	    	response = res.when().delete(resourceAPI.getResource()+id)
	    	.then().spec(responseSpecificationForTypeText()).extract().response();
	    }
	    else if(method.equalsIgnoreCase("PUT") && resource.contains("Batch"))
	    {
	    	res=batch.req;
	    	response = res.when().delete(resourceAPI.getResource()+id)
	    	.then().spec(responseSpecificationForTypeText()).extract().response();
	    }
		
		
	}

	@Then("the API call got status code {int}")
	public void the_api_call_got_status_code(int code) {
						
		assertEquals(response.getStatusCode(),code);
			   
	}
	
	@Then("The API call got status code {int}")
	public void The_api_call_got_status_code(int code1) {
						
		assertEquals(response.getStatusCode(),code1);
			   
	}
	
	
	
	@Then("{string} in response body is {string}")
	public void in_response_body_is(String status, String OK) {
		 assertEquals(response.getStatusLine(),OK);
	    
	}

	@Then("user gets response in JSON format")
	public void user_gets_response_in_JSON_format() {

		System.out.println(response.getContentType());
		assertEquals(response.getContentType(), "application/json");
//		assertEquals(response.getTime(), 200L);

	}

}