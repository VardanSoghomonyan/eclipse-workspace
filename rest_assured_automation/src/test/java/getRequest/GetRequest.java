package getRequest;

import static io.restassured.RestAssured.*;

import org.junit.Test;

import io.restassured.response.Response;
import junit.framework.Assert;

public class GetRequest {
	@Test
	public void testResponce() {
		
		Response resp = given().get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		
		int code = resp.getStatusCode();
		
//		resp.prettyPrint();
		System.out.println("Status code should be " + code);	
		Assert.assertEquals(code, 200);
	}

}
