public void onPageFinished(android.webkit.WebView view, java.lang.String url) {
    if ((jsCommand) != null)
        webView.loadUrl(jsCommand);
    
    setProgressDialogVisible(false);
}