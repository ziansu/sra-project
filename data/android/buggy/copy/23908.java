public com.connectordb.client.User getUser(java.lang.String name) throws com.connectordb.client.RequestFailedException, java.lang.Exception {
    okhttp3.Response response = simpleGet(name);
    return gson.fromJson(response.body().charStream(), com.connectordb.client.User.class);
}