@java.lang.Override
public void close() throws java.io.IOException {
    flush();
    super.close();
}