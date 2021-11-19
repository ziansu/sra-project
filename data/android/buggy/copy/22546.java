public static java.lang.String decodePathSegment(java.lang.String pathSegment) throws java.io.UnsupportedEncodingException {
    return java.net.URLDecoder.decode(pathSegment, "UTF-8");
}