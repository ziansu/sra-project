public static java.io.Reader newReader(java.io.InputStream input, java.lang.String encoding) {
    return com.univocity.parsers.common.ArgumentUtils.newReader(input, (encoding == null ? ((java.nio.charset.Charset) (null)) : java.nio.charset.Charset.forName(encoding)));
}