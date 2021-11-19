@org.junit.Test
public void deletePerson() {
    com.jayway.restassured.RestAssured.given().when().get("persons/delete/1").then().statusCode(200);
}