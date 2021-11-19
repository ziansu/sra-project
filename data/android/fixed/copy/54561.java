public static java.lang.String subUrl(java.lang.String url) {
    int index = (url.lastIndexOf("/")) + 1;
    java.lang.String truncateUrl = url.substring(0, index);
    return truncateUrl;
}