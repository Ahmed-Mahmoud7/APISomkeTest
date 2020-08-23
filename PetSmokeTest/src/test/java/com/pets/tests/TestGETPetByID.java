package com.pets.tests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class TestGETPetByID {



	@Test
	public void getPetsByID(){

		given()
		.when()
		.get("https://petstore.swagger.io/v2/pet/67")
		.then()
		.statusCode(200);  


	}


	@Test
	public void getPetsByIDNotExist(){

		given()
		.when()
		.get("https://petstore.swagger.io/v2/pet/5000")
		.then()
		.statusCode(404);  


	}

}
