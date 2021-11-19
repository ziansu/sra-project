public static <T extends io.vertx.ext.web.ParsedHeaderValue> java.util.List<T> sort(java.util.List<T> headers) {
    java.util.Collections.sort(headers, io.vertx.ext.web.impl.HeaderParser.HEADER_SORTER);
    return headers;
}