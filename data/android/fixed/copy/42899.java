protected com.jayway.restassured.specification.ResponseSpecification getResponseSpecificationPost(org.json.JSONObject payload) {
    return com.jayway.restassured.RestAssured.given().body(payload.toString()).contentType(ContentType.JSON).expect().contentType(ContentType.JSON).statusCode(HttpStatus.SC_OK);
}