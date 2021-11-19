@java.lang.Override
public void close() throws java.io.IOException {
    if ((client) != null) {
        client.close();
    }
}