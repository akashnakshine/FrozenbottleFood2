package stepDefinations;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import static io.restassured.RestAssured.given;

import java.io.File;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PostMidStepDefination {
//	  Response res;
//	    RestAssured req;
//	    ValidatableResponse validate;
//	@Given("user wants to pass the data into database")
//	public void user_wants_to_pass_the_data_into_database() {
//	
//		
//		baseURI = "http://localhost:8080";
//		JSONObject Object = new JSONObject();
//		
//		//Admin Object
//		JSONObject ad1=new JSONObject();
//		ad1.put("email","akashnakshine97@gmail.com");
//		ad1.put("id", "35");
//		ad1.put("name","akash");
//		ad1.put( "password", "hrisha");
//		
//		
//		// insert the admin values
//		Object.put("admin", ad1);
//		
//		
//		//inside array product values
//		JSONObject pv1=new JSONObject();
//		pv1.put( "cost", 405);				      
//
//		pv1.put ("description","its very testy");
//
//		pv1.put("name","chicken ");
//
//		pv1.put("type","NonVeg");
//		
//		
//		//product Array
//		JSONArray pA=new JSONArray();
//		pA.add(pv1);
//		
//		//product key
//		Object.put("product", pA);
//		
//		 
//	}
//
//	@When("user wants to pass the data by using URI as {string}")
//	public void user_wants_to_pass_the_data_by_using_uri_as(String url) {
//		res=when()
//				.post("/foodMenus");
//	}
//
//	@Then("verify the Status code is {int}")
//	public void verify_the_status_code_is(Integer int1) {
//		res.then()
//		.assertThat().statusCode(201)
//		.log().all();
//	   
//	}
//
//}
          Response res;
             RestAssured req;
              ValidatableResponse validate;
@Given("user wants to pass the data into database")
public void user_wants_to_pass_the_data_into_database() {
//	baseURI = "http://localhost:8080";
//	JSONObject Object = new JSONObject();
//	
//	//Admin Object
//	JSONObject ad1=new JSONObject();
//	ad1.put("email","akashnakshine97@gmail.com");
//	ad1.put("id", "35");
//	ad1.put("name","akash");
//	ad1.put( "password", "hrisha");
//	
//	
//	// insert the admin values
//	Object.put("admin", ad1);
//	
//	
//	//inside array product values
//	JSONObject pv1=new JSONObject();
//	pv1.put( "cost", 405);				      
//
//	pv1.put ("description","its very testy");
//
//	pv1.put("name","chicken ");
//
//	pv1.put("type","NonVeg");
//	
//	
//	//product Array
//	JSONArray pA=new JSONArray();
//	pA.add(pv1);
//	
//	//product key
//	Object.put("product", pA);
	 File object=new File("C:\\Users\\ms\\Desktop\\JSONDATA.json");
	 RequestSpecification req = RestAssured.given().contentType("application/json")
	 
	 .body(object) ;
			
}

@When("user wants to pass the data by using URI as {string}")
public void user_wants_to_pass_the_data_by_using_uri_as(String URI) {
	 
              res=req.post(URI);
}

@Then("user want to validate status code {int}")
public void user_want_to_validate_status_code(Integer code) {
    validate=res.then().assertThat()
    		
    .statusCode(code).log().all();
}
}
