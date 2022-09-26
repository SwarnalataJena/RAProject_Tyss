package com.Rmgyantra.CRUDOperationWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeletingProjectTest {
	@Test
	public void deletingProTest()
	{
	Response resp = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_1015");
	resp.prettyPrint();
	
	
	}

}
