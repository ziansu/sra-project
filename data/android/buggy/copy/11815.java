public static java.lang.String urlEncode(java.lang.String key) {
    try {
        return java.net.URLEncoder.encode(key, nl.jochemkuijpers.network.NetworkUtils.ENCODING);
    } catch (java.io.UnsupportedEncodingException e) {
        throw new java.lang.AssertionError(((nl.jochemkuijpers.network.NetworkUtils.ENCODING) + " not supported."));
    }
}