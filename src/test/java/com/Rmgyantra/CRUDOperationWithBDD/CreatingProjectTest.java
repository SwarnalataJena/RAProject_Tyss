package com.Rmgyantra.CRUDOperationWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreatingProjectTest {
	@Test
	public void creatingProjectTest()
	{
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "SJ");
		jobj.put("projectName", "SDET220");
		jobj.put("status", "completed");
		jobj.put("teamSize", 11);
		
		given()
		.contentType(ContentType.JSON)
		.body(jobj)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.assertThat().statusCode(201)
		.log().all();
		
		
		
	}

}
