public static java.io.InputStream internalFileToStream(java.lang.Class<?> c, java.lang.String path) {
    java.io.InputStream in = c.getResourceAsStream(path);
    return in;
}