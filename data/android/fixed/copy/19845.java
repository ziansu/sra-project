com.sun.jersey.api.client.ClientResponse post(java.net.URI resourceURI, java.lang.String postData, java.lang.String jsonFormat) {
    com.sun.jersey.api.client.ClientResponse response = _client.post(resourceURI, postData, _vplexSessionId, jsonFormat);
    updateVPLEXSessionId(response);
    return response;
}