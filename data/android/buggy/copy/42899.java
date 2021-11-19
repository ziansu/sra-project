protected com.jayway.restassured.specification.ResponseSpecification getResponseSpecificationPost(org.json.JSONObject payload) {
    com.jayway.restassured.specification.ResponseSpecification response = com.jayway.restassured.RestAssured.given().body(payload.toString()).contentType(ContentType.JSON).expect().contentType(ContentType.JSON).statusCode(HttpStatus.SC_OK);
    return response;
}