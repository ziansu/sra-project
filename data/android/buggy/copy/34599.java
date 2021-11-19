@java.lang.Override
public void close() throws java.io.IOException {
    mapper.writeValue(writer, rootNode);
    rootNode = null;
}