public java.lang.String doPost(java.lang.String path, java.lang.Object body, java.lang.String accessToken) throws java.io.IOException {
    return request(path, "POST", body, MediaType.APPLICATION_JSON, accessToken);
}