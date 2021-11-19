public com.reizes.shiva2.http.RestClientResponse postJsonString(java.lang.String requestUri, java.lang.String jsonData) throws java.io.IOException {
    return postString(requestUri, null, com.reizes.shiva2.utils.JsonUtils.toJson(jsonData), "application/json");
}