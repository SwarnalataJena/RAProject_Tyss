package com.Rmgyantra.DiffWayOfPost;

import static io.restassured.RestAssured.given;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Rmgyantra.PojoLib.PojoClass;

import io.restassured.http.ContentType;

public class DataProInPojoTest {
	@Test(dataProvider = "provideData")
	public void dataProInPojoTest(String createdBy, String projectName, String status, int teamSize)
	{
		PojoClass p=new PojoClass(createdBy, projectName, status, teamSize);
		
		given()
		.contentType(ContentType.JSON)
		.body(p)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.assertThat().statusCode(201)
		.log().all();
	}
	
	@DataProvider
	public Object provideData()
	{
		Object obj [] []=new Object[2][4];
		
		obj[0][0]="SwarnaAmearAkash";
		obj[0][1]="ASA112";
		obj[0][2]="created";
		obj[0][3]=3;
		
		obj[1][0]="SwarnaAmearAkash";
		obj[1][1]="ASA113";
		obj[1][2]="created";
		obj[1][3]=3;
		
		return obj;
		
	}
}
