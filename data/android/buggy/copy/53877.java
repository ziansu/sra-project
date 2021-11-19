private android.net.Uri appendTestParam(android.net.Uri uri) {
    try {
        return org.mozilla.gecko.background.db.DelegatingTestContentProvider.appendUriParam(uri, BrowserContract.PARAM_IS_TEST, "1");
    } catch (java.lang.Exception e) {
    }
    return null;
}