package com.Rmgyantra.validation;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Static_validationTest {
	@Test
	public void staticvalidationTest()
	{
		String exp_pro = "deepak_pro-1";
		 Response res = when().get("http://localhost:8084/projects");
		 res.then()
		 .log().all();
		 String act_data=res.jsonPath().get("[1].projectName");
		 Assert.assertEquals(exp_pro, act_data);	
		
	}

}
