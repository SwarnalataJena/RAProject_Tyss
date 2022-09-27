package com.Rmgyantra.Authentication;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BarerTokenTest {
	@Test
	public void barerTokenTest()
	{
		given()
		.auth().oauth2("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")
		.when()
		.get("https://api.github.com/user/repos")
		.then()
		.log().all();
	}

}
