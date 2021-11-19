@java.lang.Override
public void close() throws java.io.IOException {
    if ((zipfs) != null) {
        zipfs.close();
    }
    if ((httpClient) != null) {
        httpClient.close();
    }
}