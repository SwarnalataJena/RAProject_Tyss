package com.Rmgyantra.DiffWayOfPost;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class CreateProjectTest {
	@Test
	public void createProjectTest()
	{
		HashMap hp=new HashMap();
		hp.put("createdBy", "SJ");
		hp.put("projectName", "SDET22000");
		hp.put("status", "completed");
		hp.put("teamSize", 11);
		
		given()
		.contentType(ContentType.JSON)
		.body(hp)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.assertThat().statusCode(201)
		.and().assertThat().contentType(ContentType.JSON)
		.log().all();
	}

}
