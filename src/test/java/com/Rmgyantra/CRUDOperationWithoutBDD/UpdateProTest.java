package com.Rmgyantra.CRUDOperationWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class UpdateProTest {
	@Test
	public void updateWithPutTest()
	{
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "SJ");
		jobj.put("projectName", "SDET10030010");
		jobj.put("status", "created");
		jobj.put("teamSize", 24);
		
		RequestSpecification resqspec = RestAssured.given();
		resqspec.contentType(ContentType.JSON);
		resqspec.body(jobj);
		
		Response resp = resqspec.put("http://localhost:8084/projects/TY_PROJ_1006");
		ValidatableResponse vres = resp.then();
		vres.assertThat().statusCode(200);
		vres.log().all();
		
		
		
	}

}
