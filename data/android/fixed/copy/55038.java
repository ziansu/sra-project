public void close() throws java.io.IOException {
    if ((this.httpClient) != null) {
        httpClient.close();
    }
}