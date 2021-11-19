protected sun.nio.cs.StreamDecoder getDecoder() throws java.io.IOException {
    if ((decoder) == null) {
        initDecoder();
    }
    return decoder;
}