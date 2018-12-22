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

public class GetAndPostCall {
	@Test
public void RegistrationSuccessful()
{	
	RestAssured.baseURI = "https://avetiq-test.firebaseapp.com/todos/group/g1531398417536/user/u1531398417536";
	String baseHost = baseURI.substring(0, baseURI.lastIndexOf("/"));
			System.out.println(baseHost);
	RequestSpecification request = RestAssured.given();
	Response response = request.get(baseURI);

	int statusCode = response.getStatusCode();
	Assert.assertEquals(statusCode, 200);
	System.out.println(statusCode);
	if (statusCode == 200) response.prettyPrint();
	RestAssured.baseURI = baseHost;

	JSONObject requestParams = new JSONObject();
//	requestParams.put("id", "100001");
	requestParams.put("done", "Virender"); // Cast
	requestParams.put("text", "Singh");
	request.body(requestParams.toString());
	Response resp = request.post("/u1531398417536");

//	int statusCodePost = request.getStatusCode();
	Assert.assertEquals(statusCode, 200);
	System.out.println(statusCode);
	if (statusCode == 200) resp.prettyPrint();
//	String successCode = response.jsonPath().get("SuccessCode");
//	Assert.assertEquals( "Correct Success code was returned", successCode, "OPERATION_SUCCESS");
}
}