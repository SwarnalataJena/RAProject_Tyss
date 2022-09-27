package com.Rmgyantra.CRUDOperationWithBDD;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UpdatingWithPatchTest {
	@Test
	public void updatingWithPatchTest()
	{
		
		given()
		.contentType(ContentType.JSON);
		
		
	}

}
