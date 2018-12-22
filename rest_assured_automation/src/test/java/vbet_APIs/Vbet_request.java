package vbet_APIs;

import static io.restassured.RestAssured.*;

import org.junit.Test;
import org.junit.runner.Request;

import io.restassured.response.Response;
import junit.framework.Assert;

public class Vbet_request {
	@Test
	public void request_json() {
		Response req = given().get("https://www.vbet.com/conf.json");
		int reqCode = req.getStatusCode();
		System.out.println("get code is :" + reqCode);
		if (reqCode == 200) req.prettyPrint();
		Assert.assertEquals(reqCode, 200);
		
	} 
}
