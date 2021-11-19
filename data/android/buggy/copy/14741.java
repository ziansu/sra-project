@java.lang.Override
public void onStop() {
    final android.webkit.WebView webView = ((android.webkit.WebView) (findViewById(R.id.WebViewPrint)));
    webView.loadUrl("about:blank");
    super.onStop();
}