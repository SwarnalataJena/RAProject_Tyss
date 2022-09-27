package com.Rmgyantra.DiffWayOfPost;

import org.testng.annotations.Test;

import com.Rmgyantra.PojoLib.PojoClass;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectFromPojoTest {
	@Test
	public void createProjectFromPojoTest()
	{
		PojoClass p=new PojoClass("SWARNA", "Sdet_Hyd_8", "On going", 10);
		
		given()
		.contentType(ContentType.JSON)
		.body(p)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.assertThat().statusCode(201)
		.log().all();
	}

}
