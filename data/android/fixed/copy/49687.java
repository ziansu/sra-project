public static java.lang.String decodeUrl(java.lang.String url) {
    if (url == null)
        return null;
    
    return jp.hazuki.yuzubrowser.utils.UrlUtils.decodeUrl(android.net.Uri.parse(url));
}