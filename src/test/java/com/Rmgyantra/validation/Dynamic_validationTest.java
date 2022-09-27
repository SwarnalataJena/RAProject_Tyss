package com.Rmgyantra.validation;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.List;

public class Dynamic_validationTest {
	@Test
	public void dynamic_validationtest()
	{
		String exp_data = "SDET10030010";
		
		Response resp = when().get("http://localhost:8084/projects");
		resp.then().log().all();
		
		List<String> project_list = resp.jsonPath().get("projectName");
		int total_project = project_list.size();
		
		for(int i=0;i<=total_project;i++)
		{
			String actpro = project_list.get(i);
			if(exp_data.equals(actpro))
			{
				System.out.println(actpro+" project is available");
				break;
			}
				
			
		}
		
		
	}

}
