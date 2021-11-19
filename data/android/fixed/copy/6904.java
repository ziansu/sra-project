@java.lang.Override
public <T> T parseAndClose(final java.io.Reader reader, final java.lang.Class<T> dataClass) throws java.io.IOException {
    try {
        return com.joyent.manta.client.MantaObjectParser.MAPPER.readValue(reader, dataClass);
    } finally {
        reader.close();
    }
}