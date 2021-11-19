@java.lang.Override
public void write(byte[] array, int offset, int length) {
    try {
        byteStream.write(array);
    } catch (java.io.IOException e) {
        throw new org.apache.wicket.WicketRuntimeException(e);
    }
}