package com.pet.api.constants;

import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;

public class EndPoints {






	@BeforeSuite
	public  void  init(){


		RestAssured.baseURI = "https://petstore.swagger.io/#";
		
	}

}
