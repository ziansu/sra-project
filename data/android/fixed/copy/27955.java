@java.lang.Override
public void onProgressChanged(android.webkit.WebView view, int newProgress) {
    if ((mWebChromeClient) != null) {
        mWebChromeClient.onProgressChanged(view, newProgress);
    }
}