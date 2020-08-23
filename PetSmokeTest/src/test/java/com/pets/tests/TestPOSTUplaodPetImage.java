package com.pets.tests;

import java.io.File;


import org.testng.annotations.Test;
import io.restassured.RestAssured;







public class TestPOSTUplaodPetImage  {



	@Test
	public void uplaodpetimagewithmissedParamInvalid(){


		File petImage = new File("/Users/mac/Documents/workspace/PetSmokeTest/Images/test.png");


		RestAssured.given()
		.multiPart(petImage)
		.multiPart("petImage", petImage, "multipart/form-data")
		.post("https://petstore.swagger.io/v2/pet/uploadImage")
		.then()
		.statusCode(415);
	}

}


