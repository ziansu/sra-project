android.webkit.WebView getTopWindow() {
    if ((mSubView) != null) {
        return mSubView;
    }
    return webView;
}