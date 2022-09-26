package com.Rmgyantra.CRUDOperationWithoutBDD;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GettingProjectTest {
	@Test
	public void gettingProTest()
	{
		Response resp = RestAssured.get("http://localhost:8084/projects");
		resp.prettyPrint();
//		System.out.println(resp.getStatusCode());
//		System.out.println(resp.getTime());
//		Assert.assertEquals(201, 200);
		RestAssured.delete("http://localhost:8084/projects/TY_PROJ_1014");
//		RestAssured.get("http://localhost:8084/projects");
		ValidatableResponse vres = resp.then();
		vres.log().all();
		vres.assertThat().statusCode(200);

	}

}
