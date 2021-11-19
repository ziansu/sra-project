@org.testng.annotations.BeforeClass
private void init() {
    com.jayway.restassured.RestAssured.authentication = com.jayway.restassured.RestAssured.basic("LSGjeU4yP1X493ud1hNniA==", "");
}