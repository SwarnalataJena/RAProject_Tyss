package com.Rmgyantra.requestChaining;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class RequestChaingTest {
	@Test
	public void requestChainingTest()
	{
		Response res = when().get("http://localhost:8084/projects");
		res.then().log().all();
		
		String projectid = res.jsonPath().get("[1].projectId");
		
		given()
		.pathParam("proid", projectid)
		.when()
		.delete("http://localhost:8084/projects/{proid}")
		.then()
		.log().all();
		
	}

}
