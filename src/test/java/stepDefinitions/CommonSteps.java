package stepDefinitions;

import static io.restassured.RestAssured.*;

import static org.junit.Assert.*;

import java.io.IOException;

import org.hamcrest.Matchers;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import junit.framework.Assert;
import resources.ApiResources;
import resources.Utils;
import static io.restassured.RestAssured.*;
public class CommonSteps extends Utils {
	RequestSpecification res;
	ResponseSpecification resspec;
	Response response;
	
	@Given("user has baseURI")
	public void user_has_baseURI() throws IOException{
		res=given().spec(requestSpecification());
	}

	
	@When("user calls {string} with {string} http request")
	public void user_calls_with_http_request(String resource, String method) throws NumberFormatException, IOException {
		//constructor will be called with the value of resource which you pass
		
		ApiResources resourceAPI=ApiResources.valueOf(resource);
		System.out.println("API Resource Used is " +resourceAPI.getResource());
		
				
		if(method.equalsIgnoreCase("POST"))
			response =res.when().post(resourceAPI.getResource())
			.then().spec(responseSpecification()).extract().response();
			
		else if(method.equalsIgnoreCase("GET"))
			response =res.when().get(resourceAPI.getResource())
			.then().spec(responseSpecification()).extract().response();
			
		else if(method.equalsIgnoreCase("PUT"))
			response = res.when().put(resourceAPI.getResource())
			.then().spec(responseSpecification()).extract().response();
			
	    else if(method.equalsIgnoreCase("DELETE"))
	    	response = res.when().delete(resourceAPI.getResource())
	    	.then().spec(responseSpecification()).extract().response();
		
		
	}

		
	@Then("the API call got success with status code {int}")
	public void the_api_call_got_success_with_status_code(Integer statusCode) {
		
		//Assert.assertEquals(response.getStatusCode(),200);
		
		assertEquals(response.getStatusCode(),200);
		
	   
	}
	
	@Then("user gets response in JSON format")
	public void user_gets_response_in_JSON_format() {
		
		System.out.println(response.getContentType());
		assertEquals(response.getContentType(),"Json");
		assertEquals(response.getTime(),200L);
		
	}
	
	
	

}
