public void invoke(javax.ws.rs.client.Invocation.Builder builder) throws java.lang.Exception {
    javax.ws.rs.core.Response response = builder.build(method).invoke();
    try {
        onResponse(response);
    } finally {
        response.close();
    }
}