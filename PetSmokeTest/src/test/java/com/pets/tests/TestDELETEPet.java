package com.pets.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;


public class TestDELETEPet {


	@DataProvider(name = "DeletePet")

	public Object [] dateForDelete() {

		return  new Object [] {

				44,5,67,7,60,33,34,4,55,6,5,666,89,97,30,69,5,8,9,7,2,3
		};
	}

	@Test (dataProvider = "DeletePet")
	public void deletePetsByIDNo(int petId){

		RestAssured.given()
		.when()
		.contentType(ContentType.JSON)
		.when()
		.delete("https://petstore.swagger.io/v2/pet/" + petId)
		.then()
		.statusCode(200);




	}


	@Test (dataProvider = "DeletePet")
	public void deletePetsByIDNotExist(int petId){

		RestAssured.given()
		.when()
		.contentType(ContentType.JSON)
		.when()
		.delete("https://petstore.swagger.io/v2/pet" + petId)
		.then()
		.statusCode(404);

	}

}
