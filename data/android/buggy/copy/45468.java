public void invoke(javax.ws.rs.client.Invocation.Builder builder) throws java.lang.Exception {
    javax.ws.rs.core.Response response = null;
    try {
        response = builder.build(method).invoke();
        onResponse(response);
    } finally {
        response.close();
    }
}