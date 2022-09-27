package com.Rmgyantra.requestChaining;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class PathAndQueryParameterTest {
	@Test
	public void pathQueryParamTest()
	{
		given()
		.pathParam("username", "SwarnalataJena")
		.queryParam("sort", "created")
		.when()
		.get("https://api.github.com/users/{username}/repos")
		.then()
		.log().all();
	}

}
