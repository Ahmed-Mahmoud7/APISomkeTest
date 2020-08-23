package com.pets.tests;



import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;



public class TestGETPeByStatus {







	@Test
	public void getPetsByStatusAvalible(){


		given()
		.when()
		.get("https://petstore.swagger.io/v2/pet/findByStatus?status=Avalible")
		.then()
		.assertThat()
		.statusCode(200);    

	}

	@Test
	public void getPetsByStatusPending(){


		given()
		.when()
		.get("https://petstore.swagger.io/v2/pet/findByStatus?status=pending")
		.then()
		.assertThat()
		.statusCode(200);    

	}


	@Test
	public void getPetsByStatusSold(){


		given()
		.when()
		.get("https://petstore.swagger.io/v2/pet/findByStatus?status=sold")
		.then()
		.assertThat()
		.statusCode(200);


	}







}
