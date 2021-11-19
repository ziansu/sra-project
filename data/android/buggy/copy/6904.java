@java.lang.Override
public <T> T parseAndClose(java.io.Reader reader, java.lang.Class<T> dataClass) throws java.io.IOException {
    try {
        return com.joyent.manta.client.MantaObjectParser.MAPPER.readValue(reader, dataClass);
    } finally {
        reader.close();
    }
}