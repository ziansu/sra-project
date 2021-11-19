@java.lang.Override
public void close() throws java.io.IOException {
    if ((csvListReader) != null) {
        csvListReader.close();
    }
}