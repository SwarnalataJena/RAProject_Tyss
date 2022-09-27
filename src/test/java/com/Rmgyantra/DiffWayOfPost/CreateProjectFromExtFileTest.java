package com.Rmgyantra.DiffWayOfPost;

import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

public class CreateProjectFromExtFileTest {
	@Test
	public void createProjectFromExtFileTest()
	{
		File f=new File("./myFileJN.json");
		
		given()
		.contentType(ContentType.JSON)
		.body(f)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.log().all();
	}

}
