package com.Rmgyantra.Authentication;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Oauth2Test {
	@Test
	public void oauth2Test()
	{
		Response res = 	given()
				.formParam("client_id", "SDET_8")
				.formParam("client_secret", "caa855f1931a8466395b24ea82e4c0d7")
				.formParam("grant_type", "client_credentials")
				.formParam("redirect_uri", "https://example.com")
				.when()
				.post("http://coop.apps.symfonycasts.com/token");

		String accessToken = res.jsonPath().get("access_token");
		System.out.println(accessToken);

		given()
		.auth().oauth2(accessToken)
		.pathParam("USER_ID", "3860")
		.when()
		.post("http://coop.apps.symfonycasts.com/api/{USER_ID}/eggs-collect")
		.then()
		.log().all();




	}

}
