@org.junit.Test
public void deletePerson() {
    com.jayway.restassured.RestAssured.given().when().delete("persons/delete/1").then().statusCode(200);
}