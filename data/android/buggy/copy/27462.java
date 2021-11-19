@java.lang.Override
public boolean shouldOverrideUrlLoading(com.tencent.smtt.sdk.WebView webView, java.lang.String url) {
    webView.loadUrl(url);
    return true;
}