package com.Rmgyantra.CRUDOperationWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateProTest {
	@Test
	public void creatingProTest()
	{
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "SJ");
		jobj.put("projectName", "SDET20");
		jobj.put("status", "completed");
		jobj.put("teamSize", 11);
		
		RequestSpecification resqspec = RestAssured.given();
		resqspec.contentType(ContentType.JSON);
		resqspec.body(jobj);
		
		Response resp = resqspec.post("http://localhost:8084/addProject");
		ValidatableResponse vres = resp.then();
		vres.assertThat().statusCode(201);
		vres.log().all();
		
		
		
	}
}
