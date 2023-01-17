package stepDefinitions;

import io.cucumber.java.en.Given;
import resources.Utils;
import static io.restassured.RestAssured.*;

import java.io.IOException;

public class GetBatchSteps extends Utils  {

		

	@Given("user has baseURI")
	public void user_has_base_uri() throws IOException {
		res=given().spec(requestSpecification());
	}


	@Given("user has valid {int}")
	public void user_has_valid(int string) {
	   
	}
}

