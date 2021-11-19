@java.lang.Override
public void close() throws java.io.IOException {
    super.close();
    mapper.writeValue(writer, rootNode);
}