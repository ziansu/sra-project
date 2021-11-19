public static java.lang.String transferEncoding(retrofit2.Response<?> response) {
    return response.headers().get("Transfer-Encoding");
}