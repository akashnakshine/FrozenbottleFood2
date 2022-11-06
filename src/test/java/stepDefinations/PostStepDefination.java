package stepDefinations;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PostStepDefination {

	 RequestSpecification req;
	 Response res;
	 ValidatableResponse validate;
	@Given("User wants to provide the data in database")
	public void user_wants_to_provide_the_data_in_database() {
		 JSONObject object=new JSONObject();
		 object.put("email","akashnakshine27297@gmail.com");
		 object.put("name","akash@123");
		 object.put("password","medhansh567");
		 object.put("id",33);
		 
		 req = RestAssured.given()
		.body(object)
		 .contentType(ContentType.JSON);
	}

	@When("User wants to create the data by using URI as {string}")
	public void user_wants_to_create_the_data_by_using_uri_as(String URI) {
	     res = req.post(URI);
	}

	@Then("User wants to Verify the Status code  {int}")
	public void user_wants_to_verify_the_status_code(Integer code) {
	   validate = res.then();
	  validate.assertThat().statusCode(code).log().all();
	}
	}


