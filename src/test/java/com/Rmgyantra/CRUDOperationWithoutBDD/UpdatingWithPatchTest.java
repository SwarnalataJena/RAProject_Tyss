package com.Rmgyantra.CRUDOperationWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class UpdatingWithPatchTest {
	@Test
	public void creatingProTest()
	{
		JSONObject jobj=new JSONObject();
		jobj.put("name", "morpheus");
		jobj.put("job", "developer");
		
		
		RequestSpecification resqspec = RestAssured.given();
		resqspec.contentType(ContentType.JSON);
		resqspec.body(jobj);
		
		Response resp = resqspec.patch("https://reqres.in/api/users/2");
		ValidatableResponse vres = resp.then();
		vres.assertThat().statusCode(200);
		vres.log().all();
		
		
		
	}

}
