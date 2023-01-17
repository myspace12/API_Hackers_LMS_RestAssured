package stepDefinitions;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.*;
import resources.Utils;

public class DelProgSteps extends Utils  {
	
	
	@Then("the Program API call got success with status code {int}")
	public void the_api_call_got_success_with_status_code(Integer statusValue) {

		int statusCode = response.getStatusCode();
		System.out.println("############statusCode"+statusCode);
			assertEquals(statusCode, statusValue.intValue());
		
	}

	@Then("Program {string} in response body is {string}")
	public void in_response_body_is(String string, String string2) {
		System.out.println("############response.getStatusLine()"+response.getStatusLine());
		assertEquals(response.getStatusLine() /*actual value*/, "HTTP/1.1 200" 
			      /*expected value*/, "HTTP/1.1 200");
	}



}
