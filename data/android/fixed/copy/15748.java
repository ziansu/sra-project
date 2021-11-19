public static java.lang.String getAppendix(java.lang.String url) {
    java.lang.String[] split = url.split("[.]");
    return split[((split.length) - 1)];
}