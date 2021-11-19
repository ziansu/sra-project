public com.craigstockton.teksystems.state.service.StateInfoResponse get() {
    org.jboss.resteasy.client.jaxrs.ResteasyClient build = new org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder().build();
    javax.ws.rs.core.Response response = request.get();
    return com.craigstockton.teksystems.state.service.StateInfoResponse.getInstance(response);
}