@java.lang.Override
public void onRequestFocus(android.webkit.WebView view) {
    if ((mWebChromeClient) != null) {
        mWebChromeClient.onRequestFocus(view);
    }
}