package com.Rmgyantra.CRUDOperationWithBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DeletingProjectTest {
	@Test
	public void deletingProjectTest()
	{
		when()
		.delete("http://localhost:8084/projects/TY_PROJ_1008")
		.then()
		.assertThat().statusCode(204)
		.log().all();
	}

}
