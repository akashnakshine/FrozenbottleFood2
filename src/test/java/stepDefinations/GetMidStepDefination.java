package stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetMidStepDefination {
	 Response res;
	 ValidatableResponse validate;
		@When("User want to fetch tha data from database {string}")
		public void user_want_to_fetch_tha_data_from_database(String url) {
		        res = RestAssured.get(url);
		}

		@Then("User want to varify the status code {int}")
		public void user_want_to_varify_the_status_code(Integer int1) {
			 validate = res.then();
			 validate.assertThat().statusCode(int1).log().all();
		}


}
