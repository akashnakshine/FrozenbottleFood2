package stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteIdStepDefination {
    
	 Response res;
	 Integer status; 
	@When("User want to delete data by using URI {string}")
	public void user_want_to_delete_data_by_using_uri(String url) {
          res = RestAssured.delete(url);
	}

	@Then("Verify status code {int}")
	public void verify_status_code(Integer code) {
	  status = code;
	  System.out.println("Use sucessfully deleted by ID");
	}


}
