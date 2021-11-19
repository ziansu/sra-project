@java.lang.Override
public java.lang.Long read(java.nio.ByteBuffer binary) throws java.io.IOException, java.lang.ClassNotFoundException {
    long aLong = binary.getLong();
    binary.flip();
    return aLong;
}