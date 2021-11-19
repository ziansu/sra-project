public javax.ws.rs.client.WebTarget client() {
    return javax.ws.rs.client.ClientBuilder.newClient().target(IntegrationTest.SERVER_URL);
}