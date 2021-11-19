public void onPageStarted(android.webkit.WebView view, java.lang.String url, android.graphics.Bitmap favicon) {
    _handleRedirect(url);
    super.onPageStarted(view, url, favicon);
}