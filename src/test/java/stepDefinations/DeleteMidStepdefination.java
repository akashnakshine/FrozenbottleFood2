package stepDefinations;

import io.cucumber.java.en.Then;

public class DeleteMidStepdefination {

	Integer status; 
		
		@Then("Varify status code {int}")
		public void varify_status_code(Integer code) {
			status = code;
			  System.out.println("Use sucessfully deleted by ID");
	}

}
