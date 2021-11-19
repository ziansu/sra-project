private static com.palantir.remoting2.errors.SerializableError createSerializableError(java.lang.Exception exception) {
    return com.palantir.remoting2.errors.SerializableError.of(exception.getMessage(), exception.getClass());
}