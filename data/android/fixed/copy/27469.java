@java.lang.Override
public boolean onJsAlert(android.webkit.WebView view, java.lang.String url, java.lang.String message, android.webkit.JsResult result) {
    if ((mWebChromeClient) != null) {
        return mWebChromeClient.onJsAlert(view, url, message, result);
    }
    return false;
}