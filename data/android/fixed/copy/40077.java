private javax.ws.rs.client.Client getAuthenticatedClient(java.lang.String user, java.lang.String passwd) {
    javax.ws.rs.client.Client client = javax.ws.rs.client.ClientBuilder.newClient();
    org.glassfish.jersey.client.authentication.HttpAuthenticationFeature feature = org.glassfish.jersey.client.authentication.HttpAuthenticationFeature.basic(user, passwd);
    return client.register(feature);
}