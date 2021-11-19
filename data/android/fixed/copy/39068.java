@java.lang.Override
public void close() throws java.io.IOException {
    if (finalYielder != null) {
        finalYielder.close();
    }
}