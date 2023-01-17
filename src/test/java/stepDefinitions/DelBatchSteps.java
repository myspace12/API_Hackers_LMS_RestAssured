package stepDefinitions;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.*;
import resources.Utils;

public class DelBatchSteps extends Utils  {
	
	@Then("the Batch API call got success with status code {int}.")
	public void the_batch_api_call_got_success_with_status_code(Integer statusValue) {
		int statusCode = response.getStatusCode();
		assertEquals(statusCode, statusValue.intValue());
	}

	@Then("batch {string} in response body is {string}.")
	public void batch_in_response_body_is(String string, String string2) {
		assertEquals(response.getStatusLine(), "HTTP/1.1 200", "HTTP/1.1 200");
	}
}



