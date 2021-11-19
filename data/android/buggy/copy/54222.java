@org.junit.Test
public void logUsingResponseSpec() throws java.lang.Exception {
    io.restassured.RestAssured.expect().log().everything().body(equalTo("ERROR")).when().get("/409");
}