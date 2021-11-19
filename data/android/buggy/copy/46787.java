@java.lang.Override
public <T> T parseAndClose(java.io.InputStream in, java.nio.charset.Charset charset, java.lang.Class<T> dataClass) throws java.io.IOException {
    try {
        return com.joyent.manta.client.MantaObjectParser.MAPPER.readValue(in, dataClass);
    } finally {
        in.close();
    }
}