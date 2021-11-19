public T deserialize(java.nio.ByteBuffer b) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.text.ParseException {
    return deserialize(b.array());
}