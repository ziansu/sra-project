private java.lang.String getFieldAsString(com.mashape.unirest.http.HttpResponse<com.mashape.unirest.http.JsonNode> response, java.lang.String field) {
    return getFieldAsString(response.getBody(), field);
}