protected java.lang.String body(okhttp3.Response response) throws java.io.IOException {
    return new java.lang.String(response.body().bytes(), "UTF-8");
}