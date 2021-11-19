public static java.lang.String fixupUrl(java.lang.String uri) {
    if (android.text.TextUtils.isEmpty(uri))
        return null;
    
    return org.chromium.chrome.browser.UrlUtilities.nativeFixupUrl(uri, null);
}