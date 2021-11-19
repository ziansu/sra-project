public static java.io.InputStream getResourceAsStream(java.lang.String resource) {
    final java.io.InputStream in = io.tetrapod.core.utils.Util.getContextClassLoader().getResourceAsStream(resource);
    return in == null ? io.tetrapod.core.utils.Util.class.getClass().getResourceAsStream(resource) : in;
}