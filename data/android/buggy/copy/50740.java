public static <T> org.tlsys.twt.rt.java.util.TOptional<T> ofNullable(T value) {
    return value == null ? org.tlsys.twt.rt.java.util.TOptional.empty() : org.tlsys.twt.rt.java.util.TOptional.of(value);
}