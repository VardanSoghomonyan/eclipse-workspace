package responseRequest;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertArrayEquals;

import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import getRequest.GetRequest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ResponseRequest {
	@Test
public void RegistrationSuccessful()
{		
	RestAssured.baseURI ="https://jsonplaceholder.typicode.com";
	RequestSpecification request = RestAssured.given();

	JSONObject requestParams = new JSONObject();
	requestParams.put("id", "100001");
	requestParams.put("FirstName", "Virender"); // Cast
	requestParams.put("LastName", "Singh");
	requestParams.put("UserName", "sdimpleuser2dd2011");
	requestParams.put("Password", "password1");

	requestParams.put("Email",  "sample2ee26d9@gmail.com");
	request.body(requestParams.toString());
	Response response = request.post("/posts");

	int statusCode = response.getStatusCode();
	Assert.assertEquals(statusCode, 201);
	System.out.println(statusCode);
	response.prettyPrint();
//	String successCode = response.jsonPath().get("SuccessCode");
//	Assert.assertEquals( "Correct Success code was returned", successCode, "OPERATION_SUCCESS");
}
}