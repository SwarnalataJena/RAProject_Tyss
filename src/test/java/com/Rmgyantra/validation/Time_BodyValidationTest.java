package com.Rmgyantra.validation;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;


import java.util.concurrent.TimeUnit;

public class Time_BodyValidationTest {
	@Test
	public void timeBodyValidationTest()
	{
		when().get("http://localhost:8084/projects")
	    .then()
	    .assertThat().time(Matchers.lessThan(5000L),TimeUnit.MILLISECONDS)
		.assertThat().body("[3].projectName", Matchers.equalTo("SDET10030010"))
		.log().all();
	}

}
