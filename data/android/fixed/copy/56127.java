@java.lang.Override
public void close() throws java.io.IOException {
    try {
        if ((zipfs) != null) {
            zipfs.close();
        }
    } finally {
        if ((httpClient) != null) {
            httpClient.close();
        }
    }
}