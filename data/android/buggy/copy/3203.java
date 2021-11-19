protected javax.ws.rs.client.Invocation.Builder getRequest(javax.ws.rs.client.Client webClient) {
    javax.ws.rs.client.WebTarget webResource = webClient.target(urlPath);
    return webResource.request(MediaType.APPLICATION_JSON_TYPE);
}